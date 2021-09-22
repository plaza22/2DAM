package ejercicios;

import java.util.Scanner;


public class Ejercicio09{

/**
 *
 * @author Alejandro Plaza
 */

    public static void main(String[] args) {
          final double IVA = 0.21;
          
          Scanner sc = new Scanner (System.in,"Windows-1252");
          System.out.println("Introduce el precio del producto:");
          
          int precio = sc.nextInt();
          double resultado = (precio * IVA) + precio;
          System.out.println("El precio final es de: " + resultado + "€");

    } // Fin del main

} //Fin de la clase Ejercicio9
