package ejercicio3ga;

import java.util.Scanner;

/**
 * 
 * @author Rosenrot3585
 */

/*  Program that takes a Sentence and print it in uppercases and then in
lowcases.*/

public class Ej3GA {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Escriba una frase: ");
        String frase = leer.nextLine();

        System.out.println("La frase en mayúsculas es: ");
        System.out.println(frase.toUpperCase());
        System.out.println("");
        System.out.println("La frase en minúsculas es: ");
        System.out.println(frase.toLowerCase());
        System.out.println("");
    }

}
