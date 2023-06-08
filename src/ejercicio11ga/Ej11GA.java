package ejercicio11ga;

import java.util.Scanner;

/*
 * 
 * @author Rosenrot3585
 */

/*  Program that takes 2 numbers and let user decide hot to operate with them, option can be choose in a menu.*/

public class Ej11GA {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num2, opt;
        float num1;
        char opt2;
        opt = 0;
        opt2 = 'r';
        System.out.println("¡Bienvenido!");
        System.out.println("");
        System.out.println("Ingrese el primer número con el que desea operar: ");
        num1 = leer.nextInt();
        System.out.println("");
        System.out.println("Ingrese el segundo número con el que desea operar: ");
        num2 = leer.nextInt();
        System.out.println("");

        while (opt2 != 's') {
            do {
                System.out.println("------------------");
                System.out.println("|      MENU      |");
                System.out.println("| 1.-Sumar       |");
                System.out.println("| 2.-Restar      |");
                System.out.println("| 3.-Multiplicar |");
                System.out.println("| 4.-Dividir     |");
                System.out.println("| 5.-Salir       |");
                System.out.println("------------------");
                System.out.println("Del Menú elija la operación que desea realizar, ingresand un número del 1 al 5: ");
                opt = leer.nextInt();
                if (opt > 5 || opt < 1) {
                    System.out.println("La opción ingresada no es correcta");
                }
                System.out.println("");
            } while (opt > 5 || opt < 1);

            switch (opt) {
                case 1:
                    System.out.println("Eligió Sumar: ");
                    System.out.println((int) num1 + "+" + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Eligió Restar: ");
                    System.out.println((int) num1 + "-" + num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Eligió Multiplicar: ");
                    System.out.println((int) num1 + "*" + num2 + " = " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Eligió Dividir: ");
                    while (num2 == 0) {
                        System.out.println("Para realizar la división el número 2 debe ser distinto de cero (0).");
                        do {

                            System.out.println("si desea salir y realizar otra operación ingrese 'y',");
                            System.out.println(
                                    "si no ingrese 'n' para modificar el valor del número 2 y continuar la división");
                            opt2 = leer.next().charAt(0);
                        } while (opt2 != 'n' && opt2 != 'y');
                        System.out.println("Ingrese el segundo número con el que desea operar: ");
                        num2 = leer.nextInt();
                        System.out.println("");

                    }

                    System.out.println(num1 + "/" + (float) num2 + " = " + (float) (num1 / num2));
                    break;
                    case 5:

                        System.out.println("¿Está seguro que desea salir del sistema? Presione 's' para salir.");
                        opt2 = leer.next().charAt(0);

                default:
                    break;
            }
            System.out.println("");

        }
        System.out.println("Ha salido del programa");

    }

}
