public class App {
    public static void main(String[] args) {

        Materia programacion = new Materia("Programación", "190001", 3);
        programacion.agregarHorario("Lunes 10:00-12:00");
        programacion.agregarHorario("Martes 14:00-16:00");

        Materia fisicaMecanica = new Materia("Fisica Mecánica", "190002", 4);
        fisicaMecanica.agregarHorario("Lunes 10:00-12:00");
        fisicaMecanica.agregarHorario("Miércoles 09:00-11:00");

        Materia algebraLineal = new Materia("Algebra Lineal", "190003", 3);
        algebraLineal.agregarHorario("Jueves 14:00-16:00");
        algebraLineal.agregarHorario("Viernes 09:00-11:00");

        Materia calculoIntegral = new Materia("Cálculo Integral", "190004", 4);
        calculoIntegral.agregarHorario("Lunes 16:00-18:00");
        calculoIntegral.agregarHorario("Miércoles 06:00-08:00");

        Materia tgs = new Materia("Teoría General de Sistemas", "190005", 2);
        tgs.agregarHorario("Martes 18:00-20:00");
        tgs.agregarHorario("Viernes 08:00-10:00");

        Materia electivaTecnica = new Materia("Electiva Técnica", "190006", 2);
        electivaTecnica.agregarHorario("Miércoles 12:00-14:00");
        electivaTecnica.agregarHorario("Miércoles 14:00-16:00");

        GestionHorarios gestion = new GestionHorarios();

        gestion.registrarMateria(programacion);
        gestion.registrarMateria(fisicaMecanica);

        Estudiante juan = new Estudiante("Juan Perez", "190001");
        Estudiante maria = new Estudiante("Maria Lopez", "190002");

        gestion.inscribirEstudiante(juan, programacion, "Lunes 10:00-12:00");
        gestion.inscribirEstudiante(juan, fisicaMecanica, "Lunes 10:00-12:00");
        gestion.inscribirEstudiante(juan, fisicaMecanica, "Miércoles 09:00-11:00");
        gestion.inscribirEstudiante(juan, tgs, "Viernes 08:00-10:00");
        gestion.inscribirEstudiante(juan, electivaTecnica, "Miércoles 14:00-16:00");
        gestion.inscribirEstudiante(juan, calculoIntegral, "Miércoles 06:00-08:00");

        gestion.inscribirEstudiante(maria, fisicaMecanica, "Lunes 10:00-12:00");
        gestion.inscribirEstudiante(maria, calculoIntegral, "Lunes 16:00-18:00");
        gestion.inscribirEstudiante(maria, tgs, "Viernes 08:00-10:00");
        gestion.inscribirEstudiante(maria, electivaTecnica, "Miércoles 14:00-16:00");
        gestion.inscribirEstudiante(maria, algebraLineal, "Miércoles 20:00-22:00");
        gestion.inscribirEstudiante(maria, algebraLineal, "Jueves 14:00-16:00");
        gestion.inscribirEstudiante(maria, programacion, "Martes 14:00-16:00");

        juan.mostrarHorarioCompleto();
        maria.mostrarHorarioCompleto();

    }
}
