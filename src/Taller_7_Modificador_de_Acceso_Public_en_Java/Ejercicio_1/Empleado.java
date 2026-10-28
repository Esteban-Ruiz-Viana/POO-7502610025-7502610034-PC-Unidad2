package Taller_7_Modificador_de_Acceso_Public_en_Java.Ejercicio_1;

public class Empleado {

    //Atributos
    public String nombre;
    private double salario;

    //Constructor
    public Empleado ( String nombre, double salario ) {
        this.nombre = nombre;
        setsalario(salario);
    }

    //Getter salario
    public double getsalario () {

        return salario;

    }

    //Setter salario
    public void setsalario (double salario) {

        if (salario >= 0) {
            this.salario = salario;

        }else{
            System.out.println("El salario no puede ser negativo");

        }
    }
}
