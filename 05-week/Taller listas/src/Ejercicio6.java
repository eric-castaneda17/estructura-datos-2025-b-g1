
public class Ejercicio6 {
    public static void main(String[] args) {
        ListaEspera espera = new ListaEspera();

        // Llegan pacientes
        espera.ingresarPaciente("Ana");
        espera.ingresarPaciente("Luis");
        espera.ingresarPaciente("Carlos");
        espera.ingresarPaciente("Maria");

        // Mostrar lista
        espera.mostrarLista();

        // Atender dos pacientes
        espera.atenderPaciente();
        espera.atenderPaciente();

        // Mostrar lista
        espera.mostrarLista();

        // Llega otro paciente
        espera.ingresarPaciente("Pedro");

        // Mostrar lista
        espera.mostrarLista();

        // Atender todos
        espera.atenderPaciente();
        espera.atenderPaciente();
        espera.atenderPaciente();
        espera.atenderPaciente(); // lista vacía

        // Mostrar lista final
        espera.mostrarLista();
    }
}
