import javax.swing.*;
import javax.swing.text.DefaultEditorKit;
import java.awt.*;
import java.awt.event.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class besar extends JTextField
{
    private final char[] buff = "  0.  0.  0.  0".toCharArray();

    private int bpos;

    private void putnum (int num, int offset)
    {
        int a = num/100;
        num -= a*100;
        int b = num/10;
        num -= b*10;
        buff[offset] = (char)('0'+a);
        buff[offset+1] = (char)('0'+b);
        buff[offset+2] = (char)('0'+num);
    }

    private void align (int base)
    {
        int end = base+3;
        StringBuffer sb = new StringBuffer();
        for (int s=base; s<end; s++)
        {
            if (buff[s] != ' ')
                sb.append(buff[s]);
        }
        while (sb.length() > 1 && sb.charAt(0) == '0')
            sb.delete(0,1);
        while (sb.length() < 3)
            sb.insert(0, ' ');
        try
        {
            int num = Integer.parseInt(sb.toString().trim());
            if (num > 255)
                sb = new StringBuffer("255");
            if (num < 0)
                sb = new StringBuffer("  0");
        }
        catch (NumberFormatException e)
        {
            sb = new StringBuffer("  0");
        }
        for (int s=base; s<end; s++)
        {
            buff[s] = sb.charAt(s-base);
        }
    }

    private void alignAll()
    {
        align(0);
        align (4);
        align(8);
        align (12);
    }

    private void fwd ()
    {
        bpos = bpos == 15 ? bpos : bpos +1;
    }

    private void back ()
    {
        bpos = bpos == 0 ? bpos : bpos -1;
    }

    private void backspace()
    {
        back();
        if (bpos == 3 || bpos == 7 || bpos == 11)
        {
            return;
        }
        if (bpos < 15)
            buff[bpos] = ' ';
    }

    private void setChar (char c)
    {
        if (bpos == 3 || bpos == 7 || bpos == 11)
        {
            fwd();
        }
        if (bpos < 15)
            buff[bpos] = c;
        fwd();
    }

    public besar()
    {
        super();
        setPreferredSize(new Dimension(110, 30));
        setEditable(false);

        Action beep = getActionMap().get(DefaultEditorKit.deletePrevCharAction);
        beep.setEnabled (false);

        setText (new String (buff));

        addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                setText (new String (buff));
                setCaretPosition(0);
                getCaret().setVisible(true);
            }

            @Override
            public void focusLost(FocusEvent e)
            {
                alignAll();
                setText(new String(buff));
            }
        });

        addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyTyped (KeyEvent e)
            {
                bpos = getCaretPosition();
                char c = e.getKeyChar();
                if ((c>= '0' && c<= '9') || c == ' ')
                {
                    setChar (c);
                }
                else if (c == KeyEvent.VK_BACK_SPACE)
                {
                    backspace();
                }
                else if (c == KeyEvent.VK_ENTER)
                {
                    alignAll();
                }
                setText(new String(buff));
                setCaretPosition(bpos);
            }
        });
    }

    ////////////////////////////////////////////////////////////////////////////////////////

    public InetAddress getAddress()
    {
        String[] parts = new String(buff).split("\\.");
        byte[] adr = new byte[4];
        for (int s=0; s<4; s++)
            adr[s] = (byte)Integer.parseInt(parts[s].trim());
        try {
            return InetAddress.getByAddress(adr);
        } catch (UnknownHostException e) {
            return null;
        }
    }

    public void putAddress (InetAddress in)
    {
        byte[] adr = in.getAddress();
        putnum(adr[0]&0xff, 0);
        putnum(adr[1]&0xff, 4);
        putnum(adr[2]&0xff, 8);
        putnum(adr[3]&0xff, 12);
        alignAll();
        setText (new String(buff));
    }
}
