package ejercicio14ga;

import java.util.Scanner;

/**
 * 
 * @author Rosenrot3585
 * 
 */

// Programa que convierte Euros a Libras, dólares y Yenes.

public class Ej14GA {
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int opt = 0;
    String moneda;
    System.out.println("Ingrese la cantidad de Euros que desea convertir.");
    float euros = leer.nextFloat();
    System.out.println("");

    System.out.println("Indique la moneda a la cual desea hacer la conversión");
    
    do {
        System.out.println("--------------");
        System.out.println("|    MENU    |");
        System.out.println("| 1.-Libras  |");
        System.out.println("| 2.-Dólares |");
        System.out.println("| 3.-Yenes   |");
        System.out.println("--------------");
        opt = leer.nextInt();
    }while(opt<1 || opt>3);

    switch (opt) {
        case 1:
            moneda = "Libras";
            break;
            case 2:
            moneda = "Dólares";
            break;
    
        default:
        moneda = "Yenes";
            break;
    }
    convertidorDeEuros(euros, moneda);
}

public static void convertidorDeEuros(float amount, String currency){

    if (currency.equals("Libras")) {
        System.out.println(amount + " Euros equivalen a "+ amount*0.86f + " " + currency + ".");
        
    } else if (currency.equals("Dólares")) {
        System.out.println(amount + " Euros equivalen a "+ amount*1.28611f + " " + currency + ".");
        
    } else {
        System.out.println(amount + " Euros equivalen a "+ amount*129.852f + " " + currency + ".");
    }
}
}
