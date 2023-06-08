package ejercicio21ga;

//import java.util.Scanner;

/**
 * 
 * @author Rosenrot3585
 * 
 */

// Programa que verifica si una matriz de 3x3 es una submatriz de una matriz de
// 10x10.
public class Ej21GA {
    public static void main(String[] args) {

        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];

        llenarMatriz(matrizM, 10, 10);
        llenarMatriz(matrizP, 3, 3);
        System.out.println("Este programa comprueba si la Matriz P es una Submatriz de la Matriz M");
        System.out.println("Siendo la Matriz M: ");
        mostrarMatriz(matrizM, 10, 10);
        System.out.println("");
        System.out.println("y la matriz a buscar,  Matriz P: ");
        mostrarMatriz(matrizP, 3, 3);
        System.out.println("");

        esSubmatriz(matrizM, matrizP);

    }

    public static void llenarMatriz(int[][] matriz, int n, int m) {
        // Scanner leer = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 2);
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int dig = (int) (Math.floor(Math.log10(Math.abs(matriz[i][j])))) + 1;
                if (j == 0) {
                    if (dig < 2) {
                        System.out.print("[  " + matriz[i][j] + " | ");
                    } else {
                        System.out.print("[ " + matriz[i][j] + " | ");
                    }

                } else if (j == m - 1) {
                    if (dig < 2) {
                        System.out.print(" " + matriz[i][j] + " ]");
                    } else {
                        System.out.print(matriz[i][j] + " ]");
                    }
                } else {
                    if (dig < 2) {
                        System.out.print(" " + matriz[i][j] + " | ");
                    } else {
                        System.out.print(matriz[i][j] + " | ");
                    }
                }
            }
            System.out.println("");
        }

    }

    public static void esSubmatriz(int[][] matrizA, int[][] matrizB) {
        boolean submatriz;
        submatriz = false;
        int fila, columna;
        fila=0;
        columna=0;
        // Itera filas de MatrizA
        for (int i = 0; i < 10; i++) {
            // Itera columnas de MatrizA
            for (int j = 0; j < 10; j++) {
                /*
                 * Verifica que si no ha encontrado valores de matrizB en MatrizA
                 * no estemos empezando a buscar en las filas o columnas mayores que 7
                 */
                if ((i < 8 && j < 8) && (matrizA[i][j] == matrizB[0][0]) && !submatriz) {
                    submatriz = compararMatrices(matrizA, matrizB, i, j);
                    if (submatriz) {
                        fila=i;
                        columna=j;
                    }
                }
                
            }
        }
        if (!submatriz) {
            System.out.println("No se encontró la submatriz.");
        } else {
            System.out.println("La posición de la submatriz es: ");
            for (int k = 0; k <3; k++) {
                for (int l = 0; l < 3; l++) {
                    System.out.print(" (" + (fila + k) + "," + (columna + l) + ") ");    
                }
                System.out.println("");
            }
        }
    }

    public static boolean compararMatrices(int[][] matriz1, int[][] matriz2, int n, int m) {
        boolean iguales = true;

        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                if ((matriz2[k][l] == matriz1[n + k][m + l]) && iguales) {
                } else {
                    return false;
                }
            }
        }
        return iguales;
    }
}
