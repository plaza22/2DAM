package ejercicios;

import java.util.Scanner;

public class Ejercicio20 {

    /**
     *
     * @author Alejandro Plaza
     */
    public static void main(String[] args) {

        int contador = 2;
        boolean primo = true;

        Scanner sc = new Scanner(System.in, "Windows-1252");
        System.out.println("Introduce el número entero deseado: ");
        int numero = sc.nextInt();

        if (numero <= 1) {
            primo = false;
        } else {
            while (contador != numero) {
                if (numero % contador == 0) {
                    primo = false;
                }
                contador++;
            }

        }
        if (primo == true) {
            System.out.println("El número " + numero + " sí es primo");
        } else {
            System.out.println("El número " + numero + " no es primo");
        }

    } // Fin del main

} //Fin de la clase Ejercicio20
