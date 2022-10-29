/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm.pkg8.b;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AP2Activities8B {

    private static final String MSG_1 = "Posa el nombre de repeticions";
    private static final String MSG_2 = "Posa altre numero";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        int numr = sc.nextInt();
        System.out.println(MSG_2);
        while (numr != 0) {
            sc.next();
            System.out.println(MSG_2);

            numr--;
        }
    }

}
