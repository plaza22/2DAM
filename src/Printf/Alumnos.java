package Printf;


public class Alumnos{

/**
 *
 * @author Alejandro Plaza
 */
        
        double nota;
        int id;
        String apellido;
        String nombre;
        

    public Alumnos( int id, String apellido, String nombre, double nota) {
        
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
    
    public static double devolvernota(){
    
        double nota_generada;
        nota_generada = Math.random()*10.01;
        return nota_generada;
    }
  
        
} //Fin de la clase Alumnos
