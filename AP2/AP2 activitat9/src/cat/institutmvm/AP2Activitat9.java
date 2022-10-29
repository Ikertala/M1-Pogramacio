/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AP2Activitat9 {

    private static final String MSG_1 = "Introdueix nombres";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(MSG_1);
        int user = scanner.nextInt();
        int operacion = 0;
        int i = 0;
        while (user != 0) {
            operacion = operacion + user;
            System.out.println(MSG_1);
            user = scanner.nextInt();
            i++;

        }
        System.out.println((float) operacion / i);

    }

}
