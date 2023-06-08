package ejercicio17ga;

import java.util.Random;

/**
 * 
 * @author Rosenrot3585
 * 
 */

/**Programa que a través de una función rellena un vector 
y agrupa la cantidad de números según sus dígitos (de 1 a 5).*/

public class Ej17GA {
public static void main(String[] args) {
    int n = (int) (Math.random() * 20);

    int[] vector = new int[n];
    int[] contador = new int[5];

    llenarVector(vector, n);
    contador=agruparElementosVectorSegunDigitos(vector, n);
    System.out.println("El vector ");
    mostrarVector(vector,n);

    System.out.println("Tiene la siguiente cantidad de núemros según sus dígitos: ");

    for (int i= 0; i < 5; i++) {
    System.out.println(contador[i] + " de " + (i+1) + " dígito(s).");
    }

}
public static void llenarVector(int[] vector, int n){
    for (int i = 0; i < n; i++) {
        vector[i]=(int) (Math.random() * 99999);
    }
}
public static int[] agruparElementosVectorSegunDigitos(int[] vector, int n){
    int[] cont= new int[5];

    for (int i = 0; i < vector.length; i++) {
        switch (Integer.toString(vector[i]).length()) {
            case 1:
                cont[0]++;
                break;
                case 2:
                cont[1]++;
                break;
                case 3:
                cont[2]++;
                break;
                case 4:
                cont[3]++;
                break;
                case 5:
                cont[4]++;
                break;
            default:
                break;
        }
    }
    return cont;
}
public static void mostrarVector(int[] vector, int n){
    for (int i = 0; i < n; i++) {

        System.out.print("["+vector[i] +"]");
    }
    System.out.println("");
}

}