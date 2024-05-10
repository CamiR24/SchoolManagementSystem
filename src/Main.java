import java.util.Date;
public class Main {
    public static void main(String[] args) {
        // Crear instancias de Estudiante y Curso
        Estudiante estudiante1 = new Estudiante(1, "Juan", "Perez", new Date(), "matriculado");
        Estudiante estudiante2 = new Estudiante(2, "Maria", "Gonzalez", new Date(), "matriculado");
        Curso curso1 = new Curso(1, "Programación Java", "Introducción a la programación en Java", 4, "1.0");
        Curso curso2 = new Curso(2, "Bases de Datos", "Introducción a las bases de datos", 3, "1.0");

        // Instanciar GestorAcademico
        GestorAcademico gestorAcademico = new GestorAcademico();

        try {
            // Probar los métodos de GestorAcademico
            gestorAcademico.matricularEstudiante(estudiante1);
            gestorAcademico.matricularEstudiante(estudiante2);
            gestorAcademico.agregarCurso(curso1);
            gestorAcademico.agregarCurso(curso2);
            gestorAcademico.inscribirEstudianteCurso(estudiante1, curso1.getId());
            gestorAcademico.inscribirEstudianteCurso(estudiante2, curso1.getId());
            gestorAcademico.inscribirEstudianteCurso(estudiante2, curso2.getId());
 
        } catch (EstudianteYaMatriculadoException | CursoYaCreadoException | EstudianteYaInscritoException e) {
            e.printStackTrace();
        }
}
}