package ejercicios;

import java.util.Scanner;


public class Ejercicio25{

/**
 *
 * @author Alejandro Plaza
 */

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in, "Windows-1252");
        System.out.println("Introduce el número entero deseado: ");
        int numero = sc.nextInt();
        
        int resultado = 0;
        int contador = 1;
        
        while (contador <= numero){
              resultado += contador++;
        }
        System.out.println(resultado);

    } // Fin del main

} //Fin de la clase Ejercicio25
