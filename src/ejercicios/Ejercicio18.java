package ejercicios;

import java.util.Scanner;


public class Ejercicio18{

/**
 *
 * @author Alejandro Plaza
 */

    public static void main(String[] args) {
        
        int contador = 1;
        int resultado;
        
        Scanner sc = new Scanner(System.in, "Windows-1252");
        System.out.println("Introduce el primer número deseado ");
        int num1 = sc.nextInt();
        System.out.println("Introduce el último número deseado ");
        int num2 = sc.nextInt();
        
        while(contador <= 50 ){
            resultado = (int)(Math.random()*(num1-num2)+num2);
            System.out.println("Numero "+ contador + " -- "+resultado);
            contador++;
        }
        
        

    } // Fin del main

} //Fin de la clase Ejercicio18
