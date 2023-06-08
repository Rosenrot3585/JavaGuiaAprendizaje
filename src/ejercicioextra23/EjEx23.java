package ejercicioextra23;

import java.util.Scanner;

/**
 * 
 * @author Rosenrot3585
 * 
 */

// Progrma para crear una sopa de Letra para Niños.
public class EjEx23 {
    public static void main(String[] args) {
        String[][] sopaDeLetras = new String[20][20];
        String[] palabras = new String[5];
        System.out.println("A continuación ingresaremos 5 palabras para crear la Sopa de Letras");
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = leerPalabra();
        }
        llenarMatriz(sopaDeLetras, 20, 20, palabras);
        mostrarMatriz(sopaDeLetras, 20, 20);
    }

    public static void llenarMatriz(String[][] matrix, int n, int m, String[] palabra) {
        int fila=0;

        for (int i = 0; i < 5; i++) {
            do {
                fila = (int) (Math.random() * n);
            }while (matrix[fila][0] != null);
                for (int j = 0; j < palabra[i].length(); j++) {

                    matrix[fila][j] = descomponerPalabra(palabra[i], j);
                }
            }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == null) {
                    matrix[i][j] = Integer.toString((int) (Math.random() * 10));
                }
            }
        }
    }

    public static String descomponerPalabra(String palabra, int ind) {
        String caracter;
        caracter = palabra.substring(ind , ind+1);
        return caracter;
    }

    public static String leerPalabra() {
        String palabra;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Por favor ingrese una palabra de 3 a 5 caracteres: ");
            palabra = leer.next();
        } while (palabra.length() > 5 || palabra.length() < 3);

        return palabra;
    }

    public static void mostrarMatriz(String[][] matriz, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                System.out.print(matriz[i][j] + " ");

            }
            System.out.println("");
        }

    }
}
