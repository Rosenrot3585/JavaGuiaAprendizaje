package ejercicio12ga;

import java.util.Scanner;

/**
 * 
 * @author Rosenrot3585
 * 
 */


 //Programa que simula el funcionamiento de un dispositivo RS232


public class Ej12GA {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        //Se define el arreglo cadena que tomará la instrucción del usuario
        String cadena;
        char opt='s';
        boolean bandera = false;
        
        do {

        System.out.println("Por favor ingrese la instrucción.");
        System.out.println("Recuerde debe empezar con 'X', finalizar con 'O' y tener hasta 5 caracteres.");
        System.out.println("Nota: '&&&&&' finaliza el ingreso de entradas.");
        cadena = leer.next();     
        
        //Para agilizar la lectura se convierten las antradas a mayúsculas de forma automática
        cadena=cadena.toUpperCase();

        //Se verifica que la longitud de la cadena sea de 5 caracteres

        if (cadena.equals("&&&&&"))  {
            System.out.println("Se recibió un FDE.");
            opt='n';
        }else{
        for (int i = 0; i < cadena.length()-1; i++) {    
            if ((i==0 && !cadena.substring(i, i+1).equals("X")) || (i==4 && !cadena.substring(i, i+1).equals("O")) ) {
                bandera = true;  
            }
        }
        if (bandera) {
            System.out.println("Secuencia INCORRECTA."); 
            
        } else {
            System.out.println("Secuencia CORRECTA."); 
            
        }
        System.out.println("Si desea ingresar otra secuencia ingrese 's': ");
        opt = leer.next().charAt(0);
    }


    }while(opt=='s');

    System.out.println("Ha finalizado el ingreso de secuencias. Programa terminado.");

    }
}