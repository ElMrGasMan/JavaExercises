/*
Leer tres números enteros de un Digito y almacenarlos en una sola variable que contenga
a esos tres dígitos Por ejemplo si A=5 y B=6 y C=2 entonces X=562.
 */


import java.util.Scanner;

public class Ex4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        ExtraThings.DrawLine();

        System.out.println("Ingrese los tres números para combinarlos en uno solo: ");
        System.out.println("(Recuerde que el primer numero será el digito 100, el segundo el 10 y el tercero la unidad).");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        ExtraThings.DrawLine();

        int numCompleto = num1 * 100 + num2 * 10 + num3;

        System.out.println("El número completo es: " + numCompleto + ".");
    }
}
