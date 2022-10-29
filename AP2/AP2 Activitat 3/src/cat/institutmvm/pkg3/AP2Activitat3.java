/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm.pkg3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AP2Activitat3 {

    private static final String MSG_1 = "Escriu un nombre";
    private static final String MSG_2 = "Es positiu";
    private static final String MSG_3 = "Es negatiu";
    private static final String MSG_4 = "Es mes gran 35";
    private static final String MSG_5 = "Es mes petit 35";
    private static final String MSG_6 = "Es mes gran 100";
    private static final String MSG_7 = "Es mes petit 100";
    private static final String MSG_8 = "Esta en el interval de -3 i 27";
    private static final String MSG_9 = "NO esta en el interval de -3 i 27";
    private static final String MSG_10 = "Esta en el interval de 25 i 50";
    private static final String MSG_11 = "NO esta en el interval de 25 i 50";
    private static final String MSG_12 = "El modul es mes petit";
    private static final String MSG_13 = "El modul es mes gran";
    private static final String MSG_14 = "Introdueix dos nombre";
    private static final String MSG_15 = "Es senar";
    private static final String MSG_16 = "No es sennar";
    private static final String MSG_17 = "El primer es mes gran";
    private static final String MSG_18 = "El segon es més gran";
    private static final String MSG_19 = "Escriu 3 nombres";
    private static final String MSG_20 = "El 3 es mes gran";
    private static final String MSG_21 = "Es multiple";
    private static final String MSG_22 = "No es multiple";

    public static void main(String[] args) {
        System.out.println(MSG_1);
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        if (x > 0) {
            System.out.println(MSG_2);
        } else {
            System.out.println(MSG_3);
        }
        if (x > 35) {
            System.out.println(MSG_4);
        } else {
            System.out.println(MSG_5);
        }
        if (x > 100) {
            System.out.println(MSG_6);
        } else {
            System.out.println(MSG_7);
        }
        if ((-3 < x) && (x < 27)) {
            System.out.println(MSG_8);
        } else {
            System.out.println(MSG_9);
        }
        if ((25 < x) && (x < 50)) {
            System.out.println(MSG_10);
        } else {
            System.out.println(MSG_11);
        }
        System.out.println(MSG_14);
        int y, z;
        y = sc.nextInt();
        z = sc.nextInt();
        if (y % z < 15) {
            System.out.println(MSG_12);
        } else {
            System.out.println(MSG_13);
        }
        System.out.println(MSG_1);
        int i;
        i = sc.nextInt();
        if (i % 2 != 0) {
            System.out.println(MSG_15);
        } else {
            System.out.println(MSG_16);
        }
        if (i % 2 != 0) {
            System.out.println(i * i);
        } else {
            System.out.println(i * i * 1);
        }
        System.out.println(MSG_14);
        int j, k;
        j = sc.nextInt();
        k = sc.nextInt();
        if (j > k) {
            System.out.println(MSG_17);
        } else {
            System.out.println(MSG_18);
            System.out.println(MSG_19);
            int b, v, t;
            b = sc.nextInt();
            v = sc.nextInt();
            t = sc.nextInt();
            if ((b > v) && (b > t)) {
                System.out.println(MSG_17);
            } else {
                if ((b < v) && (b > t)) {
                    System.out.println(MSG_18);
                } else {
                    System.out.println(MSG_20);
                }
                System.out.println(MSG_14);
                int o, h;
                o = sc.nextInt();
                h = sc.nextInt();
                if (o % h == 0) {
                    System.out.println(MSG_21);
                } else {
                    System.out.println(MSG_22);
                }

                System.out.println("Introdueix el litres gastats");
                int litres, quota;
                litres = sc.nextInt();
                quota = 6;
                if (litres < 50) {
                    System.out.println(quota);
                } else {
                    if ((litres >= 50) && (litres <= 200)) {
                        System.out.println(quota + (litres - 50) * 0.1);
                    } else {
                        System.out.println(quota + (litres - 50) * 0.1 + (litres - 200) * 0.3);
                    }
                }

            }
        }

    }
}
