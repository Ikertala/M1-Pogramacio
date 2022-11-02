/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;

/**
 *
 * @author alumne_1r
 */
public class AP2Activities {

    /**
     * @param args the command line arguments
     */
    private static final String MSG_1 = "Iker ";
    private static final String MSG_2 = "Talavera Gamez";

    public static void main(String[] args) {
        System.out.println(MSG_1);
        System.out.println(MSG_1 + MSG_2);
        System.out.println(MSG_1);
        System.out.println(MSG_2);
        //Quadrat
        for (int i = 0; i != 10; i++) {
            System.out.println("* * * * * * * * * *");
            // Triangle 

            for (int i = 0; i != 10; i++) {
                System.out.print("");
                for (int j = 0; j < i; j++) {
                    System.out.print("");

                }
                System.out.println("");
            }
        }
    }
}
