package ejercicios;


public class Ejercicio12{

/**
 *
 * @author Alejandro Plaza
 */

    public static void main(String[] args) {
        
        int numero = 100;
        
        while (numero >=1) {
            
           if ((numero % 2 == 0) && (numero % 3 == 0)){
            
            System.out.println(numero);
            
            } // se cierra el if
            numero --;
        } // se cierra el while

    } // Fin del main

} //Fin de la clase Ejercicio12


           