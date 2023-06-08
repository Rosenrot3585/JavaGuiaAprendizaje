package ejercicioextra9;

import java.util.Scanner;

public class EjEx9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        do {
            System.out.println("Por favor ingrese el número que desea dividir: ");
            System.out.println("(Debe ser mayor que 1)");
            System.out.println("");
            num1 = leer.nextInt();
        } while (num1<=1);
        do {
            System.out.println("Ingrese el número entre el que desea dividir " + num1 + ": ");
            System.out.println("(Debe ser mayor que 1)");
            System.out.println("");
            num2 = leer.nextInt(); 
        } while (num2<=1);
        int coc=1;
        System.out.println("");

        System.out.println("Al dividir "+ num1 + " / " + num2);
        dividirRestando(num1,num2,coc);
    }

    public static void dividirRestando(int n1, int n2, int coc){
        int resto = n1-n2;;
        if (resto<n2) {
            System.out.println(n1 + " - " + n2 + " = " + resto);
            System.out.println(""); 
            System.out.println("El resto es "+ resto + " y el cociente es " + coc);
        } else {
            System.out.println(n1 + " - " + n2 + " = " + resto);
            coc++;
            dividirRestando(resto, n2, coc);
        }
    }

}
