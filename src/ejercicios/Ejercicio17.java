package ejercicios;

import java.util.Scanner;

public class Ejercicio17 {

    /**
     *
     * @author Alejandro Plaza
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "Windows-1252");
        System.out.println("Introduce el dia de la semana deseado: ");
        String dia = sc.nextLine();
        
        if(dia.equals("sabado") || dia.equals("domingo")){
            System.out.println("El dia de la semana " + dia + " no es lavorable");
        }
        else {
            System.out.println("el dia de la semana " + dia + " si es lavorable");
        }

    } // Fin del main

} //Fin de la clase Ejercicio17
