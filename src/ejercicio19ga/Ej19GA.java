package ejercicio19ga;

import java.util.Scanner;

/**
 * 
 * @author Rosenrot3585
 * 
 */

// Programa que verifica si una matriz en antisimétrica.
public class Ej19GA {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int[][] matrizT = new int[3][3];
        llenarMatriz(matriz, 3, 3);
        System.out.println("");
        System.out.println("La matriz es:");
        System.out.println("");
        mostrarMatriz(matriz, 3, 3);
        System.out.println("");
        System.out.println("Y la matriz Traspuesta es:");
        System.out.println("");
        matrizT = matrizTraspuesta(matriz, 3, 3);
        System.out.println("");
        mostrarMatriz(matrizT, 3, 3);
        esAntisimetrica(matriz, matrizT, 3, 3);
    }

    public static void llenarMatriz(int[][] matriz, int n, int m) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
    }

    public static int[][] matrizTraspuesta(int[][] matriz, int n, int m) {
        int[][] matrizT = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrizT[i][j] = matriz[j][i];
            }
        }
        return matrizT;
    }

    public static void esAntisimetrica(int[][] matriz, int[][] matrizT, int n, int m) {
        boolean bandera = true;
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (i == j && matriz[i][j] != 0) {
                        bandera = false;
                    } else if (matriz[i][j] == -(matrizT[i][j])) {
                    } else {
                        bandera = false;
                    }
                }
            }
        if (bandera) {
            System.out.println("La matriz es Antisimétrica");
        } else {
            System.out.println("La matriz NO es Antisimétrica");
        }
    }

    public static void mostrarMatriz(int[][] matriz, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == 0) {
                    System.out.print("[ " + matriz[i][j] + " | ");

                } else if (j == m - 1) {
                    System.out.print(matriz[i][j] + " ]");
                } else {
                    System.out.print(matriz[i][j] + " | ");
                }
            }
            System.out.println("");
        }

    }
}
