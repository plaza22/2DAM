package ejercicios;

import java.util.Scanner;

public class Ejercicio15 {

    /**
     *
     * @author Alejandro Plaza
     */
    public static void main(String[] args) {

        double total = 0;
        int ventas = 0;
        String cifra;

        Scanner sc = new Scanner(System.in, "Windows-1252");
        System.out.println("Introduce el importe de la venta ");
        cifra = sc.nextLine();

        if (cifra.equals("*")) {
            System.out.println("No hay total de ventas ");
        } // fin del if

        while (!cifra.equals("*")) {

            double importe = Double.parseDouble(cifra);
            total += importe;
            System.out.println("Introduce el importe de la venta ");
            cifra = sc.nextLine();
            ventas++;
          } // fin del while

        System.out.println("El numero de ventas totales es de " + ventas + " ventas");
        System.out.println("El total de las ventas es de " + total + " €");

    } // Fin del main

} //Fin de la clase Ejercicio15
