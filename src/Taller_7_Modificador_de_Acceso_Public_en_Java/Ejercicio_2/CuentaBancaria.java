package Taller_7_Modificador_de_Acceso_Public_en_Java.Ejercicio_2;

public class CuentaBancaria {

    //Atributos
    private String numeroCuenta;
    private double Saldo;
    public String tipoCuenta;

    //Constructor
    public CuentaBancaria( String numeroCuenta, double Saldo, String tipoCuenta ) {

        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        setSaldo(Saldo);

    }

    //Getter de saldo
    public double getSaldo() {

        return Saldo;

    }

    //Setter de saldo
    public void setSaldo( double Saldo ){

    if ( Saldo >= 0 ) {
        this.Saldo = Saldo;

    } else{
        System.out.println("El saldo no puede ser negativo");

        }
    }

    //Mostrar los detalles de la cuenta
    public void mostrarDetalles() {

        System.out.println( "Numero de cuenta: " + numeroCuenta );
        System.out.println( "Tipo de cuenta: " + tipoCuenta);
        System.out.println( "Saldo: " + Saldo);

    }
}