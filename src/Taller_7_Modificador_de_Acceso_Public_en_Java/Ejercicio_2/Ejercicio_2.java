package Taller_7_Modificador_de_Acceso_Public_en_Java.Ejercicio_2;

//Crea una clase CuentaBancaria con las propiedades numeroCuenta (privada), saldo (privada) y tipoCuenta (pública). Define:
//1. Métodos públicos get y set para saldo.
//2. Un metodo público para mostrar los detalles de la cuenta.
//3. Crea una clase de prueba que intente acceder directamente a numeroCuenta y observe los errores de compilación.

public class Ejercicio_2 {

    public static void main(String[] args) {

        // Datos ingresados
        CuentaBancaria cuenta1 = new CuentaBancaria( "781937289", 48300212, "Ahorros" );

        //Acceso a tipoCuenta
        System.out.println( "Tipo de cuenta: " + cuenta1.tipoCuenta );

        //Mostrar saldo inicial con getter
        System.out.println( "Saldo inicial: $ " + cuenta1.getSaldo() );

        //Actualizar saldo con setter
        cuenta1.setSaldo( 1699788 );
        System.out.println( "Saldo final: $ " + cuenta1.getSaldo() );

        //Mostrar datos de la cuenta
        System.out.println( "\nDetalles de la cuenta: " );
        cuenta1.mostrarDetalles();

        //Error: numeroCuenta es privado
        // System.out.println( cuenta1.numeroCuenta );

    }
}
