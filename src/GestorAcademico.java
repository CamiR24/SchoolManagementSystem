import java.util.ArrayList;
import java.util.HashMap;

class GestorAcademico {
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Curso> cursos;
    private HashMap<Curso, ArrayList<Estudiante>> inscripciones;

    public GestorAcademico() {
        this.estudiantes = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.inscripciones = new HashMap<>();
    }

    // Métodos para agregar estudiantes y cursos, inscribir estudiantes en cursos, etc.
}