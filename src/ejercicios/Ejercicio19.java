package ejercicios;

import java.util.Scanner;

public class Ejercicio19 {

    /**
     *
     * @author Alejandro Plaza
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "Windows-1252");
        System.out.println("Introduce el número entero deseado: ");
        int numero = sc.nextInt();
        
        int contador = 0;
        
        while (numero > 0){
            numero /= 10;
            contador++;
        }
        System.out.println("El número introcucido tiene " + contador + " digitos");

    } // Fin del main

} //Fin de la clase Ejercicio19
