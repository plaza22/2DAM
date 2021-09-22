package ejercicios;

import java.util.Scanner;

public class Ejercicio16 {

    /**
     *
     * @author Alejandro Plaza
     */
    public static void main(String[] args) {

        final String contrasenia = "admin";
        int intentos = 3;

        while (intentos >= 1) {

            Scanner sc = new Scanner(System.in, "Windows-1252");
            System.out.println("Introduce la contraseña correcta: ");
            String solucion = sc.nextLine();

            if (solucion.equals(contrasenia)) {
                System.out.println("Enhorabuena ha acertado la contraseña.");
                intentos = 0;

            } // se cierra el if
            else {
                
                System.out.println("Contraseña incorrecta.");
                intentos--;
                System.out.println("Le quedan " + intentos + " intentos.");
                
                if (intentos == 0) {

                    System.out.println("Ha agotado sus 3 intentos.");

                } // se cierra el if del else

            } // se cierra el else

        } // se cierra el while

    } // Fin del main

} //Fin de la clase Ejercicio16

