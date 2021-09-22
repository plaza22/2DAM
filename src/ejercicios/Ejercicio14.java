package ejercicios;

import java.util.Scanner;


public class Ejercicio14{

/**
 *
 * @author Alejandro Plaza
 */
    public static void main(String[] args) {
        
        double resultado_positivo = 0;
        double resultado_negativo = 0;
        
        Scanner sc = new Scanner (System.in,"Windows-1252");
        System.out.println("Introduce en valor de a ");
        int a = sc.nextInt();
        System.out.println("Introduce en valor de b ");
        int b = sc.nextInt();
        System.out.println("Introduce en valor de c ");
        int c = sc.nextInt();
        
        double discriminante = Math.pow(b, 2)- (4 * a* c);
        
         if(discriminante > 0){
             resultado_positivo = (-b + Math.sqrt(discriminante)) / (2 * a);
             System.out.println(resultado_positivo);
                     
             resultado_negativo = (-b - Math.sqrt(discriminante)) / (2 * a);
             System.out.println(resultado_negativo);
         }
         if (discriminante == 0){
             
             resultado_positivo = (-b + Math.sqrt(discriminante)) / (2 * a);
             System.out.println(resultado_positivo);
         }
         if (discriminante < 0){
             System.out.println("Esta ecuacion de segundo grado no tiene una solucion real");
         }
         
         
        

    } // Fin del main

} //Fin de la clase Ejercicio14
