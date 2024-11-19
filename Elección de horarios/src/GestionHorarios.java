import java.util.ArrayList;

public class GestionHorarios {
    private ArrayList<Materia> materiasRegistradas;
    private ArrayList<Estudiante> estudiantesInscritos;

    public GestionHorarios() {
        this.materiasRegistradas = new ArrayList<>();
        this.estudiantesInscritos = new ArrayList<>();
    }

    public void registrarMateria(Materia materia) {
        materiasRegistradas.add(materia);
        System.out.println("Materia " + materia.getNombre() + " registrada.");
    }

    public void inscribirEstudiante(Estudiante estudiante, Materia materia, String horario) {
        try {
            estudiante.inscribirMateria(materia, horario);
            estudiantesInscritos.add(estudiante);
        } catch (Exception e) {
            System.out.println("Error al inscribir al estudiante: " + e.getMessage());
        }
    }
}
