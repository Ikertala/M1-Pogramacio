/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class AP2Activitat4 {

    /**
     * @param args the command line arguments
     */
    private static final String MSG_1 = "Introdueix un numero entre el 1 y el 12: ";
    private static final String MSG_2 = "Gener ";
    private static final String MSG_3 = "Febrer ";
    private static final String MSG_4 = "Març ";
    private static final String MSG_5 = "Abril ";
    private static final String MSG_6 = "Maig ";
    private static final String MSG_7 = "Juny ";
    private static final String MSG_8 = "Juliol ";
    private static final String MSG_9 = "Agost";
    private static final String MSG_10 = "Septembre ";
    private static final String MSG_11 = "Octubre ";
    private static final String MSG_12 = "Novembre";
    private static final String MSG_13 = "Decembre ";
    private static final String MSG_14 = "No coincideix aningun més ";

    public static void main(String[] args) {
        int numMonth;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        numMonth = sc.nextInt();
        switch (numMonth) {
            case 1:
                System.out.println(MSG_2);
                break;
            case 2:
                System.out.println(MSG_3);
                break;
            case 3:
                System.out.println(MSG_4);
                break;
            case 4:
                System.out.println(MSG_5);
                break;
            case 5:
                System.out.println(MSG_6);
                break;
            case 6:
                System.out.println(MSG_7);
                break;
            case 7:
                System.out.println(MSG_8);
                break;
            case 8:
                System.out.println(MSG_9);
                break;
            case 9:
                System.out.println(MSG_10);
                break;
            case 10:
                System.out.println(MSG_11);
                break;
            case 11:
                System.out.println(MSG_12);
                break;
            case 12:
                System.out.println(MSG_13);
                break;

            default:
                System.out.println(MSG_14);

        }
    }
}
