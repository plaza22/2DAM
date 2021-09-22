package Printf;

public class EjercicioPrintf {

    /**
     *
     * @author Alejandro Plaza
     */
    public static void main(String[] args) {

        Alumnos[] alumnos = new Alumnos[12];

        alumnos[0] = new Alumnos(1, "Bañon", "Frankz", Alumnos.devolvernota());
        alumnos[1] = new Alumnos(2, "Bermejo", "Carlos", Alumnos.devolvernota());
        alumnos[2] = new Alumnos(3, "Caceres", "Diego", Alumnos.devolvernota());
        alumnos[3] = new Alumnos(4, "Caja", "Victor", Alumnos.devolvernota());
        alumnos[4] = new Alumnos(5, "Carabut", "Constantin", Alumnos.devolvernota());
        alumnos[5] = new Alumnos(6, "De Pablo", "Victor Manuel", Alumnos.devolvernota());
        alumnos[6] = new Alumnos(7, "Gonzalez", "Jorge", Alumnos.devolvernota());
        alumnos[7] = new Alumnos(8, "Gutierrez", "Sergio", Alumnos.devolvernota());
        alumnos[8] = new Alumnos(9, "Martin", "Miguel Angel", Alumnos.devolvernota());
        alumnos[9] = new Alumnos(10, "Plaza", "Alejandro", Alumnos.devolvernota());
        alumnos[10] = new Alumnos(11, "Rosa", "Eizan", Alumnos.devolvernota());
        alumnos[11] = new Alumnos(12, "Vidal", "Pedro Enrique", Alumnos.devolvernota());

        
        System.out.printf("%-2s \t %-6s \t %-8s \t %4s \n", "ID","Nombre","Apellido", "Nota");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - -  ");
        for(int numero_alumno = 0; numero_alumno < alumnos.length; numero_alumno++ ) {
            System.out.printf("%-4d \t %-9s \t %-12s \t %.2f \n", alumnos[numero_alumno].id, alumnos[numero_alumno].apellido, alumnos[numero_alumno].nombre, alumnos[numero_alumno].nota);
        }

    } // Fin del main

} //Fin de la clase EjercicioPrintf
