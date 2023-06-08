package ejercicio15ga;

/**
 * 
 * @author Rosenrot3585
 * 
 */

//Programa que a través de una función rellena y muestra un vector lleno del 1 al 100.

public class Ej15GA {
    public static void main(String[] args){
        int[] vector = new int[100];

        llenarVector(vector);  

        System.out.println("El vector en forma decreciente es así: ");

        mostrarVector(vector);  
        
    }
    public static void llenarVector(int[] vector){
        for (int i = 0; i < 100; i++) {
            vector[i]=i+1;
        }
    }

    public static void mostrarVector(int[] vector){
        for (int i = 99; i >= 0; i--) {

            System.out.println("vector["+ i +"] = " + vector[i]);
        }
    }
    
}
