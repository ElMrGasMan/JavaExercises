/* Escriba un algoritmo que dado el número de horas trabajadas por un empleado y el sueldo
por hora, calcule el sueldo total de ese empleado. Tenga en cuenta que las horas extras se
pagan el doble. */


import java.util.Locale;
import java.util.Scanner;

public class Ex2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);

        ExtraThings.DrawLine();

        System.out.println("Ingrese el salario del empleado: ");
        float sueldoHora = scanner.nextFloat();

        System.out.println("Ahora ingrese la cantidad de horas trabajadas normalmente por el empleado y luego las horas extras si las hizo: ");
        int horasTrab =  scanner.nextInt();
        int horasExtras = scanner.nextInt();

        ExtraThings.DrawLine();

        System.out.println("El sueldo total del empleado es: " + (horasTrab + horasExtras * 2) * sueldoHora + "$.");
        ExtraThings.DrawLine();

        scanner.close();
    }
}
