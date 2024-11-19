import java.util.ArrayList;

public class Materia {
    private String nombre;
    private String codigo;
    private int creditos;
    private ArrayList<String> horariosDisponibles;

    public Materia(String nombre, String codigo, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.horariosDisponibles = new ArrayList<>();
    }

    public void agregarHorario(String horario) {
        if (!horariosDisponibles.contains(horario)) {
            horariosDisponibles.add(horario);
        } else {
            System.out.println("Este horario ya está disponible para la materia.");
        }
    }

    public void mostrarHorariosDisponibles() {
        System.out.println("Horarios disponibles para " + nombre + ":");
        for (String horario : horariosDisponibles) {
            System.out.println(horario);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public ArrayList<String> getHorariosDisponibles() {
        return horariosDisponibles;
    }

    public int getCreditos() {
        return creditos;
    }

}
