package Ejercicio4;

class Persona {
    private String nombre = "Fernanda";

    public String getNombre() {
        return nombre;
    }
}

class Estudiante extends Persona {
    void mostrarNombre() {
        System.out.println(getNombre());
    }
}

/*
class Persona {
    private String nombre = "Carlos";
}

class Estudiante extends Persona {
    void mostrarNombre() {
        System.out.println(nombre); // Error de compilación
    }
}
 */