import java.util.HashMap;

public class Estudiante {
    private String nombre;
    private String id;
    protected HashMap<String, String> materiasInscritas;

    public Estudiante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.materiasInscritas = new HashMap<>();
    }

    public void inscribirMateria(Materia materia, String horario) throws Exception {
        if (materiasInscritas.containsValue(horario)) {
            throw new Exception("El horario ya está ocupado con otra materia.");
        }
        if (materia.getHorariosDisponibles().contains(horario)) {
            materiasInscritas.put(materia.getCodigo(), horario);
            System.out.println("Materia " + materia.getNombre() + " inscrita en el horario " + horario);
        } else {
            throw new Exception("El horario seleccionado no está disponible para esta materia.");
        }
    }

    public void mostrarHorarioCompleto() {
        System.out.println("\nHorario completo de " + nombre + ":");
        for (String codigoMateria : materiasInscritas.keySet()) {
            System.out.println("Materia: " + codigoMateria + ", Horario: " + materiasInscritas.get(codigoMateria));
        }
    }

    public String getId() {
        return id;
    }
}
