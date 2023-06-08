package ejercicioextra24;

import java.util.Scanner;

/**
 * 
 * @author Rosenrot3585
 * 
 */


 //Programa que calcula la Serie de Fibonacci hasta un número N

public class EjEx24 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese el número hasta el que desea calcular la Serie Fibonacci: ");
        int n =  leer.nextInt();

        System.out.println(calcularFibonacci(n));
        
    }

    public static int calcularFibonacci(int num){
        int fibo;

            
        if (num <= 1) {
            fibo= 1;
            
        } else {
            fibo=calcularFibonacci(num-1)+calcularFibonacci(num-2);
        }
return fibo;
}
}


