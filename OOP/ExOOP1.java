/*
Crea una clase llamada Cuenta que tendrá los siguientes atributos:
1. titular y cantidad (puede tener decimales). Crear sus métodos get, set.
2. Crear dos constructores que permitan crear una cuenta para un titular y la cantidad.

Tendrá dos métodos especiales:
1. ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida
es negativa, no se hará nada.

2. retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual
a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
*/


import java.util.Scanner;


class Cuenta
{
    private String titular;
    private double cantidad;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Cuenta()
    {
        this.titular = "INDEFINIDO";
        this.cantidad = 0.0;
    }

    public Cuenta(String nombApellTit, double cant)
    {
        this.titular = nombApellTit;
        this.cantidad = cant;
    }

    @Override
    public String toString() {
        return String.format("Titular de la cuenta: %s. \nMonto total: $%.2f.\n", this.titular, this.cantidad);
    }

    protected void ingresar(double cant)
    {
        if(cant < 0)
        {
            System.out.println("Se ingresó un monto negativo. Operación invalidada.");
            return;
        }

        this.cantidad += cant;
    }

    protected void retirar(double cant)
    {
        if(this.cantidad - cant < 0)
        {
            this.cantidad = 0;
            return;
        }

        this.cantidad -= cant;
    }
}

public class ExOOP1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del titular de la cuenta y el monto: ");
        Cuenta cuenta1 = new Cuenta(scanner.nextLine(), scanner.nextDouble());

        System.out.println(cuenta1);

        System.out.println("Ingrese una cantidad de dinero: ");
        cuenta1.ingresar(scanner.nextDouble());
        System.out.println(cuenta1);

        System.out.println("Retire una cantidad de dinero: ");
        cuenta1.retirar(scanner.nextDouble());
        System.out.println(cuenta1);

        scanner.close();
    }
}
