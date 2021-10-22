/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hacktober;

/**
 *
 * @author Judha Maygustya
 */
import java.util.Scanner;

public class DeterminingTheSmallestLargestValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int container [][] = new int[3][5];
        System.out.println(" ====== INPUT  MATRIKS VALUE======\n");
        for (int i = 0; i < container.length; i++) {
            for (int j = 0; j < container[0].length; j++) {
                System.out.print("Input Numbers to   [" + i + "] [" + j + "] :");
                container[i][j] = input.nextInt();
            }
        }

        System.out.println("\n ======= MATRIKS VIEW=======");
        for (int i = 0; i < container.length; i++) {
            for (int j = 0; j < container[0].length; j++) {
                System.out.println("[" + i + "] [" + j + "] : " + container[i][j]);
            }
        }
        System.out.println(" ");
        System.out.println(" ");

        //Baris Terbesar //
        for (int i = 0; i < container.length; i++) {
            int terbesar = 0;
            for (int j = 0; j < container[0].length; j++) {
                if (container[i][j] > terbesar) {
                    terbesar = container[i][j];
                }
            }
            System.out.println("Largest Number In Row  [" + i + "] = " + terbesar);
        }
        System.out.println(" ");
        System.out.println(" ");
        //Kolom Terbesar //
        for (int i = 0; i < container[0].length; i++) {
            int terbesar = 0;
            for (int j = 0; j < container.length; j++) {
                if (container[j][i] > terbesar) {
                    terbesar = container[j][i];
                }
            }
            System.out.println("Largest Number In Column  [" + i + "] = " + terbesar);
        }

    }
}
// Code BY Judha Maygustya
