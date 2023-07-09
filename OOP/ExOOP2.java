/*
Crear una clase Fracción, que cuente con dos atributos: dividendo y divisor, que se asignan en
el constructor, y se imprimen como X/Y en el método toString().

1. Crear un método sumar que recibe otra fracción y devuelve una nueva fracción con la
suma de ambas.

2. Crear un método multiplicar que recibe otra fracción y devuelve una nueva fracción con
el producto de ambas.
*/


import java.util.Scanner;


class Fraccion
{
    private double numerador;
    private double denominador;

    public double getNumerador() {
        return numerador;
    }

    public void setNumerador(double numerador) {
        this.numerador = numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public void setDenominador(double denominador) {
        this.denominador = denominador;
    }

    public Fraccion(double numerador, double denominador)
    {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    @Override
    public String toString()
    {
        return String.format("%.1f/%.1f\n", this.numerador, this.denominador);
    }

    public Fraccion sumar(Fraccion fraccionASum)
    {
        return new Fraccion(this.numerador + fraccionASum.getNumerador(), this.denominador + fraccionASum.getDenominador());
    }

    public Fraccion multiplicar(Fraccion fraccionASum)
    {
        return new Fraccion(this.numerador * fraccionASum.getNumerador(), this.denominador * fraccionASum.getDenominador());
    }
}


public class ExOOP2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primera fraccion: ");
        Fraccion fraccion1 = new Fraccion(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("Ingrese la segunda fraccion: ");
        Fraccion fraccion2 = new Fraccion(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("La suma de ambas da como resultado: ");
        System.out.println(fraccion1.sumar(fraccion2));

        System.out.println("La multiplicacion de ambas da como resultado: ");
        System.out.println(fraccion1.multiplicar(fraccion2));

        scanner.close();
    }
}
