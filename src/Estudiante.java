import java.util.Objects;

public class Estudiante {
    /**
     * Atributos
     */
    protected String nombre;
    protected int edad;
    protected int matricula;
    /**
     * Constructor
     */
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    /**
     * Equals
     */
    @Override
    public boolean equals(Object otro) {
        // Verifico reflexibida: alejandro == alejandro true, alejandro == pedro false, sigue abajo
        if (this == otro) {
            return true;
        }
        // Verifico null
        if (otro == null) {
            return false;
        }
        // Verificar misma clase o superclase
        if (!(otro instanceof Estudiante)) {
            return false;
        }
        // Verificar atributos
        Estudiante cast = (Estudiante) otro; // cast que dice "trata este objeto como estudiante". Si otro no es realmente un Estudainte, lanzara una excepcion en tiempo de ejecucion
        return this.getMatricula() == cast.getMatricula(); // cast es una referencia al mismo objeto que otro, pero ahora el compilador sabe que es de tipo Estudiante
    }
    /**
     * Haschode
     */
    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }

    public int getMatricula() {
        return matricula;
    }

}
