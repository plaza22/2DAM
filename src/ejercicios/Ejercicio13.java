package ejercicios;

import java.util.Scanner;


public class Ejercicio13{

/**
 *
 * @author Alejandro Plaza
 */

    public static void main(String[] args) {
        
        double total = 0;
        int contador = 1;
        
        Scanner sc = new Scanner (System.in,"Windows-1252");
        System.out.println("Introduce en numero de ventas totales en los ultimos 15 días ");
        int ventas = sc.nextInt();
        
        while (contador <= ventas){
  
        System.out.println("Introduce el valor de la venta " + contador);
        double precio = sc.nextDouble();
        total +=precio;
        contador++;          
            
        } // fin del while
        System.out.println("El total de todas las ventas de los últimos 15 días es de " + total + "€");
        sc.close();
    

    } // Fin del main

} //Fin de la clase Ejercicio13
