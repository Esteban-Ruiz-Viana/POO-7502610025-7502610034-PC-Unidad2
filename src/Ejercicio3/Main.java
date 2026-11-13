package Ejercicio3;


public class Main {
    public static void main(String[] args) {

        Empleado empleado = new Empleado("Valery", 250000);

        Gerente gerente = new Gerente(
                "Fernanda", 450000, "Marketing"
        );

        empleado.mostrarDetalles();

        System.out.println();
        gerente.mostrarDetalles();
    }
}