public class Main {
    public static void main(String[] args) {

        Estudiante[] estudiante = new Estudiante[6];

        estudiante[0] = new EstudiantePosgrado("Jose", 20, 1, "Datos");
        estudiante[1] = new EstudiantePosgrado("Maria", 19, 2, "Abogacia");
        estudiante[2] = new EstudianteGrado("Carlos", 18, 4, "Medicina");
        estudiante[3] = new EstudianteGrado("Agostina", 19, 4, "Letras");

        estudiante[4] = new Estudiante("Agus", 22);
        estudiante[5] = new Estudiante("Josefa", 24);

        System.out.println(estudiante[2].equals(estudiante[3]));
        System.out.println(estudiante[2] == estudiante[3])
        ;

    }
}