import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bankAccount {

    void collectDB(Map<Integer, customer> bdb) {

        bdb.put(1999, new customer("Yogender", 1999, new currentAcc("saving account", 7.5f),
                new savingsAcc("life insurance", 10f)));

        bdb.put(4321, new customer("nikhil", 4321, new currentAcc("modified intrest rates", 8.5f),
                new savingsAcc("increase HRA", 9.5f)));

    }

    public static void main(String[] args) {
        Map<Integer, customer> bdb = new HashMap<>();
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter the customer id: ");
        int id = ob.nextInt();
        ob.close();

        bankAccount bk = new bankAccount();
        bk.collectDB(bdb);

        if (bdb.containsKey(id)) {
            customer c = bdb.get(id);
            System.out.println("Name: " + c.name);
            System.out.println("ID: " + c.id);
            System.out.println("Current Account Scheme:");
            System.out.println(c.ca.scheme);
            System.out.println("Interest: " + c.ca.interest);
            System.out.println("Savings Account Scheme:");
            System.out.println(c.sa.scheme);
            System.out.println("Interest: " + c.sa.interest);
        } else {
            System.out.println("Invalid id number");
        }

    }
}

class customer {
    String name;
    int id;
    currentAcc ca;
    savingsAcc sa;

    customer(String name, int id, currentAcc ca, savingsAcc sa) {
        this.name = name;
        this.id = id;
        this.ca = ca;
        this.sa = sa;
    }
}

class currentAcc {
    String scheme;
    float interest;

    currentAcc(String scheme, float interest) {
        this.scheme = scheme;
        this.interest = interest;
    }
}

class savingsAcc {
    String scheme;
    float interest;

    savingsAcc(String scheme, float interest) {
        this.scheme = scheme;
        this.interest = interest;
    }
}
