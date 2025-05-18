public class EstudianteGrado extends Estudiante{
    /**
     * Atributos
     */
    private String carreraGrado;
    /**
     * Constructor
     */
    public EstudianteGrado(String nombre, int edad, int matricula, String carreraGrado) {
        super(nombre,edad);
        this.matricula = matricula;
        this.carreraGrado = carreraGrado;
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
        EstudianteGrado cast = (EstudianteGrado) otro; // cast que dice "trata este objeto como estudiante". Si otro no es realmente un Estudainte, lanzara una excepcion en tiempo de ejecucion
        return this.getMatricula() == cast.getMatricula()
                && carreraGrado.equals(cast.carreraGrado); // cast es una referencia al mismo objeto que otro, pero ahora el compilador sabe que es de tipo Estudiante
    }



}
