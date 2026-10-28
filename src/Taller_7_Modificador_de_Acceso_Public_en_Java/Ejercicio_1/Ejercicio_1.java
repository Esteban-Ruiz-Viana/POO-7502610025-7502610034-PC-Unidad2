package Taller_7_Modificador_de_Acceso_Public_en_Java.Ejercicio_1;

//Crea una clase Empleado con las propiedades nombre y salario. Define:
//1. La propiedad nombre debe ser pública.
//2. Proporciona métodos get y set públicos para la propiedad salario, con validaciones en el método set.
//3. Crea una clase de prueba que instancie objetos de Empleado y acceda a las propiedades.

public class Ejercicio_1 {

    public static void main(String[] args) {

        // Instancia el objeto con un salario valido
        Empleado emp1 = new Empleado ("Checo Perez", 1500000 );

        // Acceso directo al atributo publico nombre
        System.out.println( "Nombre del empleado: " + emp1.nombre );

        // Lectura del atributo privado mediante getter publico
        System.out.println( "Salario inicial: $ " + emp1.getsalario() );

        // Actualizacion del salario mediante setter publico
        emp1.setsalario(6000000);
        System.out.println( "Salario final: $ " + emp1.getsalario() );

        // Prueba de validacion: intentar asignar un valor negativo
        System.out.println( "\nTratando de poner un salario negativo" );
        emp1.setsalario(-5000000);
    }
}