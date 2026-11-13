package Ejercicio2;

public class Estudiante extends Persona {
    private String matricula;

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.matricula = carrera;
    }

    public String getMatricula() {
        return matricula;
    }

    void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Carrera: " + getMatricula());
    }

}