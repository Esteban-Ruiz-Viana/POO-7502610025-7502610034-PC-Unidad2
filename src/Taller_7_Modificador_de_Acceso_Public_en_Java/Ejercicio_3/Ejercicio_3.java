package Taller_7_Modificador_de_Acceso_Public_en_Java.Ejercicio_3;

//1. Define una clase Utilidades con métodos públicos que realicen operaciones matemáticas básicas (suma, resta, multiplicación, división).
//2. Crea una clase de prueba que acceda a estos métodos y valide su correcto funcionamiento.

public class Ejercicio_3 {

    public static void main(String[] args) {

        //Los metodos son static, se llaman con el nombre de la clase

        //Suma
        System.out.println( "Suma: " + Utilidades.suma( 230, 245 ) );

        //Resta
        System.out.println( "Resta: " + Utilidades.resta( 500, 600 ) );

        //Multiplicacion
        System.out.println( "Multiplicacion: " + Utilidades.multiplicacion( 40, 89 ) );

        //Division
        System.out.println( "Division: " + Utilidades.division( 23, 29 ) );

    }
}
