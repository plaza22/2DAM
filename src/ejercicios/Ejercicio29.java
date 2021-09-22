package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio29 {

    /**
     *
     * @author Alejandro Plaza
     */
    public static void main(String[] args) {
        String cadena_convertida = "";

        String texto_usuario = JOptionPane.showInputDialog(null, "Por favor introduzca una frase", "Introduccion", JOptionPane.QUESTION_MESSAGE);

        Object[] opciones = {"MAYUSCULAS", "minusculas"};

        int resultado = JOptionPane.showOptionDialog(null, "¿A que quiere convertir?", "Eleccion", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        if (resultado == JOptionPane.YES_OPTION) {
            cadena_convertida = texto_usuario.toUpperCase();
        }

        if (resultado == JOptionPane.NO_OPTION) {
           cadena_convertida = texto_usuario.toLowerCase();
        }

        JOptionPane.showMessageDialog(null, cadena_convertida, "Resultado", JOptionPane.INFORMATION_MESSAGE, null);
    } // Fin del main

} //Fin de la clase Ejercicio29
