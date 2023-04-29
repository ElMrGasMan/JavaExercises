/*
Un profesor desea saber qué porcentaje de hombres y qué porcentaje de mujeres hay en
un grupo de estudiantes.
*/


import java.util.Scanner;

public class Ex5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        ExtraThings.DrawLine();

        System.out.println("Ingrese el número total de estudiantes: ");
        int totalEst = scanner.nextInt();

        System.out.println("Ahora ingrese la cantidad de hombres que hay en el curso: ");
        int totalHombres = scanner.nextInt();

        System.out.println("Ahora ingrese la cantidad de mujeres que hay en el curso: ");
        int totalMujeres = scanner.nextInt();

        ExtraThings.DrawLine();

        int porcentHombres = (totalHombres * 100) / totalEst;
        int porcentMujeres = (totalMujeres * 100) / totalEst;

        System.out.println("El porcentaje de mujeres en el curso es: " + porcentMujeres + "% y el porcentaje de hombres es: " + porcentHombres + "%.");

        ExtraThings.DrawLine();
    }
}
