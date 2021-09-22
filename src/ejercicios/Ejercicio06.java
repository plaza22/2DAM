package ejercicios;

import java.util.Scanner;

public class Ejercicio06{

/**
 *
 * @author Alejandro Plaza
 */

    public static void main(String[] args) {
        
    Scanner sc = new Scanner (System.in,"Windows-1252");
        
    System.out.println("Introduce el radio ");
    
    double radio =sc.nextDouble();
    
    double resultado = Math.PI * Math.pow(radio, 2);
    
        System.out.println("El área del circulo es " +resultado);
       
   

    } // Fin del main

} //Fin de la clase Ejercicio6
    
