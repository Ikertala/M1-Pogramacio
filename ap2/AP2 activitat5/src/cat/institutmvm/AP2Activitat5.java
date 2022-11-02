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
public class AP2Activitat5 {

    private static final String MSG_1 = "Digues un any";
    private static final String MSG_2 = "Es de trespas";
    private static final String MSG_3 = "No es de trespas";

    public static void main(String[] args) {
        int any;
        System.out.println(MSG_1);
        Scanner sc = new Scanner(System.in);
        any = sc.nextInt();
        if ((any % 4 == 0) && (any %100!=0) || (any % 400==0)){
        System.out.println(MSG_2);
        } else {
        System.out.println(MSG_3);
    }

    }
}
