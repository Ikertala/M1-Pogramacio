/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ap2.acticitat.pkg6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AP2Acticitat6 {

    private static final String MSG_1 = "Digues un més y un any";
    private static final String MSG_2 = "Error";

    public static void main(String[] args) {
        System.out.println(MSG_1);
        int any, mes, diesf, dmesos;
        Scanner sc = new Scanner(System.in);
        any = sc.nextInt();
        mes = sc.nextInt();
        if ((any % 4 == 0) && (any % 100 != 0) || (any % 400 == 0)) {
            diesf = 29;
        } else {
            diesf = 28;
        }
        if ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12)) {
            dmesos = 31;
        } else {
            dmesos = 30;
        }
        switch (mes) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println(any + " " + mes + " " + dmesos);
                break;

            case 2:
                System.out.println(any + " " + mes + " " + diesf);
                break;

            default:
                System.out.println(MSG_2);
        }
    }
}
