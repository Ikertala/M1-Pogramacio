/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.intitutmvm;

import java.util.Scanner;

public class Projecte2final {

    private static final String MSG_21 = "-----------------------------";
     private static final String MSG_25 = "Número de clientes por tipo:";
    private static final String MSG_24 = "Quiere consultar por tipo de cliente? (si: 1 / no: 0).";
    private static final String MSG_23 = "años";
    private static final String MSG_22 = "La madia de edad es:";
    private static final String MSG_20 = "Histograma de número de clientes :";
    private static final String MSG_19 = "Importe total acumulado: ";
    private static final String MSG_17 = "el total de clientes es :";
    private static final String MSG_16 = "Has seleccionado la opcion Venda lliure (0)";
    private static final String MSG_15 = "Has seleccionado la opcion Carnet jove (2)";
    private static final String MSG_14 = "Has seleccionado la opcion Pensionista (1)";
    private static final String MSG_13 = "Has seleccionado la opcion Venda lliure (0)";
    private static final String MSG_18 = "ID" + "\t" + "EDAD" + "\t" + "TIPO" + "\t" + "IMPORTE" + "\t" + "TELÉFONO";
    private static final String MSG_12 = "Cuants clients son?";

    private static final String MSG_1 = "Introdueix el teu id:";

    private static final String MSG_2 = "Introdueix la teva edat:";

    private static final String MSG_3 = " tipus de venda:";

    private static final String MSG_8 = "venda lliur(0)";

    private static final String MSG_9 = "pensionista(1)";

    private static final String MSG_10 = "carnet jove(2)";

    private static final String MSG_11 = "soci(3)";

    private static final String MSG_4 = "Introdueix el import de la compra";

    private static final String MSG_5 = "Introdueix un telefon ";

    private static final String MSG_6 = "Error, torna a intentar-ho";

    private static final String MSG_7 = "Programa finalizado";

    public static void main(String[] args) {

        int clientes, errors = 0, a = 0, errors2 = 0, tclientes = 0, pasa = 0, consulta = 0, tclient = 0, totalimp = 0, contador = 0, contador1 = 0, contador2 = 0, contador3 = 0;

        boolean correcte;//declaramos la variable que se encargue de que los valores sen del tipo correcto

        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_12);

        clientes = sc.nextInt();//Le pedimos que introduzca el numero de clientes

//declaramos todas las arrays
        int[] id = new int[clientes];

        int[] tipus = new int[clientes];

        int[] edat = new int[clientes];

        int[] importp = new int[clientes];

        int[] telef = new int[clientes];

        String[] ventas = new String[clientes];

        int[] espacio = new int[clientes];//es la array para el histograma

        for (int i = 0; i < id.length; i++, a++) {

            // este bucle es para que compruebe que el tipo de dato es correcto
            do {

                //le pedimos que ponga un valor y lo leemos y almacenamos
                System.out.println(MSG_1);

                correcte = sc.hasNextInt();

                if (correcte) {

                    id[i] = sc.nextInt();

                    if (id[i] > 999 || id[i] < 111) {

                        correcte = false;

                        System.out.println(MSG_6);

                        errors2 = errors2 + 1;// el valor de error aumenta si no esta entre els valors

                    }

                } else {

                    System.out.println(MSG_6);

                    errors2++;

                }
                errors++;
            } while ((!correcte) && (i < 3));

            errors = 0; // reiniciamos el valor de errors 

            if (errors <= 3 && correcte) {

                errors2 = 0;

                do {

                    System.out.println(MSG_2);

                    correcte = sc.hasNextInt();

                    if (correcte) {

                        edat[i] = sc.nextInt();

                        if ((edat[i] < 14) || (edat[i] > 120)) {

                            //volvemos a assignar unos limites que hay que cumplir para ser correcto   
                            correcte = false;

                            System.out.println(MSG_6);

                            errors2 = errors2 + 1;

                        }

                    } else {

                        System.out.println(MSG_6);

                        errors2++;

                    }
                    errors++;
                } while ((!correcte) && (errors < 3));
            }
            if (i < 3 && correcte) {

                errors2 = 0;

                do {//mostrem els tipus de ventas

                    System.out.println(MSG_3);

                    System.out.println(MSG_8);

                    System.out.println(MSG_9);

                    System.out.println(MSG_10);

                    System.out.println(MSG_11);

                    correcte = sc.hasNextInt();

                    if (correcte) {

                        tipus[i] = sc.nextInt();

                        if (tipus[i] < 0 || tipus[i] > 3) {//tornem a posar els limits 

                            correcte = false;

                            System.out.println(MSG_6);

                            errors2 = errors2 + 1;

                        }

                    } else {

                        System.out.println(MSG_6);

                        errors++;

                        errors2 = 0;
                    }

                    switch (tipus[i]) {

                        case 0:

                            System.out.println("Has selecionado la opcion venta libre");
                        break;
                        case 1:

                            System.out.println("Has selecionado la opcion pensionista");
                          break;
                        case 2:

                            System.out.println("Has selecionado la opcion de carnet jove");
                        break;
                        case 3:

                            System.out.println("Has seleccionado la opcion Soci (3)");
                        break;
                    }

                } while ((!correcte) && (i < 3));

                
            }
            errors = 0;
            if (errors <= 3 && correcte) {

                errors2 = 0;

                do {

                    System.out.println(MSG_4);

                    correcte = sc.hasNextInt();

                    if (correcte) {

                        importp[i] = sc.nextInt();

                        if (importp[i] > 1000 || importp[i] < 0) {
                            //ponemos otro limite 
                            correcte = false;

                            System.out.println(MSG_6);

                            errors2 = errors2 + 1;

                        }

                    } else {

                        System.out.println(MSG_6);

                        errors2++;
                    }
                    errors++;
                } while ((!correcte) && (errors < 3));
            }
            errors = 0;
            if (errors < 3 && correcte) {
                errors2 = 0;
                do {
                    System.out.println(MSG_5);
                    correcte = sc.hasNextInt();
                    if (correcte) {
                        telef[i] = sc.nextInt();
                        if ((telef[i] < 111111111) || (telef[i] > 999999999)) { //Pedimos por teclado el valor de telefono la cual tiene que cumplir esta condición.
                            correcte = false;
                            System.out.println(MSG_3);
                            errors2++; //Incrementa si no cumple la condición.
                        }
                    } else {
                        sc.next();
                        System.out.println(MSG_3);
                        errors2++;
                    }
                    errors++;
                } while ((!correcte) && (errors < 3));
            }
            if (errors2 >= 3) { 
                i = i - 1;   //si se cometen más de tres errores en la introducción en lugar de pasar al siguiente cliente volvera pedir que vuelvas ha hacer todo el cliente de nuevo
                a = a - 1;
            }
        }

        for (int i = 0;
                i < edat.length - 1; i++) {//hacemos esto para cambiar el orden de la array sengun como sea de grande el valor de edad 
            for (int j = i + 1; j < edat.length; j++) {
                if (edat[i] > edat[j]) {
                    pasa = id[i];
                    id[i] = id[j];
                    id[j] = pasa;
                    pasa = edat[i];
                    edat[i] = edat[j];
                    edat[j] = pasa;
                    pasa = tipus[i];
                    ventas[i] = ventas[j];
                    tipus[j] = pasa;
                    pasa = importp[i];
                    importp[i] = importp[j];
                    importp[j] = pasa;
                    pasa = telef[i];
                    telef[i] = telef[j];
                    telef[j] = pasa;
                }

            }
        }
        for (int i = 0;
                i < tipus.length;
                i++) {
            switch (tipus[i]) {//con este switch mostramos el tipus de venta
                case 0:
                    ventas[i] = MSG_8;

                case 1:
                    ventas[i] = MSG_9;

                case 2:
                    ventas[i] = MSG_10;

                case 3:
                    ventas[i] = MSG_11;

            }
        }
        if (errors
                < 3) {
            System.out.println("");
            System.out.println(MSG_18); //Mostramos los datos de loscl ientes por pantalla
            for (int i = 0; i < clientes; i++) {

                // la t es para tabular 
                System.out.print(id[i]);
                System.out.print("\t");
                System.out.print(edat[i]);
                System.out.print("\t");
                System.out.print(ventas[i]);
                System.out.print("\t");
                System.out.print(importp[i] + "€");
                System.out.print("\t");
                System.out.print(telef[i]);
                System.out.println();
            }
        }
        if (errors
                < 3) {
            System.out.println("");
            System.out.println(MSG_17 + clientes);
            System.out.println("");
            do {
                System.out.println(MSG_24);
                correcte = sc.hasNextInt();
                if (correcte) {
                    consulta = sc.nextInt();
                    if ((consulta < 0) || (consulta > 1)) { //Pedimos al usuario que introduzca un 0 o 1 dependiendo si quiere o no quiere ver el tipo de venta
                        correcte = false;
                        System.out.println(MSG_17);
                    }
                } else {
                    sc.next();
                    System.out.println(MSG_17);
                }
            } while ((!correcte));
            if (consulta == 1) { //Si elige consultar por tipo de venta realizamos el mismo proceso con la variable tcliente.
                do {               //Para así pedirle cual es el tipo de cliente del cual quiere realizar la consulta.
                    System.out.println(MSG_16);
                    correcte = sc.hasNextInt();
                    if (correcte) {
                        tclient = sc.nextInt();
                        if ((tclientes < 0) || (tclientes > 3)) {
                            correcte = false;
                            System.out.println(MSG_17);
                        }
                    } else {
                        sc.next();
                        System.out.println(MSG_17);
                        System.out.println(MSG_7);
                    }
                } while ((!correcte)); //Lo hará siempre que escriba uno de los 4 valores dado (0,1,2,3,)
                if (tclient == 0) { //Si quiere consultar por Venta Libre pulsará 0.
                    System.out.println(MSG_13);
                    for (int i = 0; i < tipus.length; i++) {
                        if (tipus[i] == 0) { //Y mediante este bucle solo se printarán las posiciones de tipus 0 , es decir, Venta Libre.
                            System.out.print(id[i]);
                            System.out.print("\t");
                            System.out.print(edat[i]);
                            System.out.print("\t");
                            System.out.print(ventas[i]);
                            System.out.print("\t");
                            System.out.print(importp[i] + "€");
                            System.out.print("\t");
                            System.out.print(telef[i]);
                            System.out.println();
                        }
                    }
                }
                if (tclient == 1) { //Presionando el 1 obtienes a los pensionistas.
                    System.out.println(MSG_18);
                    for (int i = 0; i < tipus.length; i++) {
                        if (tipus[i] == 1) { //Y mediante este bucle solo se printarán las posiciones de tipus 1 , es decir, Pensionista.
                            System.out.print(id[i]);
                            System.out.print("\t");
                            System.out.print(edat[i]);
                            System.out.print("\t");
                            System.out.print(ventas[i]);
                            System.out.print("\t");
                            System.out.print(importp[i] + "€");
                            System.out.print("\t");
                            System.out.print(telef[i]);
                            System.out.println();
                        }
                    }
                }
                if (tclient == 2) { //Si quiere consultar por Carnet Joven pulsará 2.
                    System.out.println(MSG_18);
                    for (int i = 0; i < tipus.length; i++) {
                        if (tipus[i] == 2) { //Y mediante este bucle solo se printarán las posiciones en la cuál la tipus  2 , es decir, Carnet Joven.
                            System.out.print(id[i]);
                            System.out.print("\t");
                            System.out.print(edat[i]);
                            System.out.print("\t");
                            System.out.print(ventas[i]);
                            System.out.print("\t");
                            System.out.print(importp[i] + "€");
                            System.out.print("\t");
                            System.out.print(telef[i]);
                            System.out.println();
                        }
                    }
                }
                if (tclient == 3) { //Si quiere consultar por Socio pulsará 3.
                    System.out.println(MSG_18);
                    for (int i = 0; i < tipus.length; i++) {
                        if (tipus[i] == 3) { //Y mediante este bucle solo se printarán las posiciones en la cuál la tipus 3 , es decir, Socio.
                            System.out.print(id[i]);
                            System.out.print("\t");
                            System.out.print(edat[i]);
                            System.out.print("\t");
                            System.out.print(ventas[i]);
                            System.out.print("\t");
                            System.out.print(importp[i] + "€");
                            System.out.print("\t");
                            System.out.print(telef[i]);
                            System.out.println();
                        }
                    }
                }
            }
            System.out.println("");
            System.out.println(MSG_18);
            consulta = sc.nextInt();
            if (consulta == 1) { //le preguntamos si quiere 
                System.out.println("");
                System.out.println(MSG_14 + a);
                System.out.println("");
                for (int i = 0; i < edat.length; i++) { 
                    totalimp = totalimp + edat[i];
                }
                System.out.println(MSG_22 + (float) totalimp / clientes + MSG_23); //creamos una pedia de edad con los valores del array i el tamño i lo printamos
                System.out.println("");
                System.out.println(MSG_25);
                System.out.println("");
                for (int i = 0; i < tipus.length; i++) { 
                    if (tipus[i] == 0) {                 
                        contador = contador + 1;        
                    }
                    if (tipus[i] == 1) {
                        contador1 = contador1 + 1;
                    }
                    if (tipus[i] == 2) {
                        contador2 = contador2 + 1;
                    }
                    if (tipus[i] == 3) {
                        contador3 = contador3 + 1;
                    }
                }
                if (contador > 0) { //Con estos condicionales nos aseguramos de que solo se printen los tipos de clientes que se han introducido y los que no no se printarán.
                    System.out.println("V.Libre: " + contador);
                    System.out.println("");
                }
                if (contador > 0) {
                    System.out.println("Pensionista: " + contador);
                    System.out.println("");
                }
                if (contador1 > 0) {
                    System.out.println("C.Joven: " + contador1);
                    System.out.println("");
                }
                if (contador2 > 0) {
                    System.out.println("Socio: " + contador2);
                    System.out.println("");
                }
                espacio[0] = contador; //Asociamos cada contador a cada una de las posiciones para crear un histograma con asteriscos i asignarle este valor
                espacio[1] = contador;
                espacio[2] = contador1;
                espacio[3] = contador2;
                System.out.println(MSG_20);
                System.out.println(MSG_21);
                for (int i = 0; i < espacio.length; i++) {
                    switch (i) {
                        case 0:
                            if (espacio[i] > 0) {  // printaran segun la condicion 
                                System.out.print("V.Libre: ");
                                break;
                            }
                        case 1:
                            if (espacio[i] > 0) {
                                System.out.print("Pensión: ");
                                break;
                            }
                        case 2:
                            if (espacio[i] > 0) {
                                System.out.print("C.Joven: ");
                                break;
                            }
                        case 3:
                            if (espacio[i] > 0) {
                                System.out.print("Socio: ");
                                break;
                            }
                    }
                    for (int j = 0; j < espacio[i]; j++) { //Printamos la cantidad de cada posición de la array con los asteriscos para hacer el histograma.
                        System.out.print("*");
                    }
                    System.out.println();
                }
                totalimp = 0;
                for (int i = 0; i < importp.length; i++) { // sumamos i printamos
                    totalimp = totalimp + importp[i];
                }
                System.out.println("");
                System.out.println(MSG_19 + totalimp + "€");
                System.out.print("");
            }
        }
    }

}
