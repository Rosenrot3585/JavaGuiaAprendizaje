package ejercicio13ga;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

/**
 * 
 * @author Rosenrot3585
 * 
 */

//Programa que dibuja el marco de un cuadro de tamaño n X n

public class Ej13GA {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese el tamaño de los lados del cuadrado a dibujar: ");
    int n = leer.nextInt();
    System.out.println("Su cuadro luce así:");
    System.out.println("");
    for (int i = 0; i < n; i++) {
        System.out.println("");
        for (int j = 0; j < n; j++) {
            if (i==0 || i==n-1){
                System.out.print("*");
            } else {
                if (j==0 || j==n-1) {
                    System.out.print("*");
                    
                } else {
                    
                    System.out.print(" ");
                }
            }
            
        }
        
        
    }

    }
    
}
