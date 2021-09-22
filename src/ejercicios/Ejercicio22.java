package ejercicios;

import java.util.Scanner;


public class Ejercicio22{

/**
 *
 * @author Alejandro Plaza
 */

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in, "Windows-1252");
        System.out.println("Introduce la frase deseada: ");
        String frase = sc.nextLine();
        
        int total_vocales = 0;
        char letra;
        
        for(int i = 0; i < frase.length(); i++){
            letra = frase.charAt(i);
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                total_vocales++;
            }
            
        }
        
        

    } // Fin del main

} //Fin de la clase Ejercicio22
