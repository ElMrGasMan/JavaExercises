/*
Leer dos números y encontrar:
a. La suma del doble del primero más el cuadrado del segundo.
b. El promedio de sus cubos.
 */

import java.util.Locale;
import java.util.Scanner;
import java.math.*;

public class Ex3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);

        ExtraThings.DrawLine();

        System.out.println("Ingrese los dos valores para calcularlos: ");
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();

        ExtraThings.DrawLine();

        System.out.println("El doble del primer número: " + num1 * 2 + ", más el cuadrado del segundo: " + num2 * num2 + ", es igual a: " + (num1 * 2 + num2 * num2) + ".");

        ExtraThings.DrawLine();

        double num3 = Math.pow(num1, 3);
        double num4 = Math.pow(num2, 3);

        System.out.println("El promedio del cubo del primer número: " + num3 + ", más el cubo del segundo: " + num4 + ", es igual a: " + (num3 + num4) / 2 + ".");

        ExtraThings.DrawLine();

        scanner.close();
    }
}
