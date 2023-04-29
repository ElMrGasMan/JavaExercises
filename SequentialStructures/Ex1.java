/* En un hospital existen 3 áreas: Urgencias, Pediatría y Traumatología. El presupuesto anual
del hospital se reparte de la siguiente manera:
URGENCIAS = 37%
PEDIATRIA = 42%
TRAUMATOLOGIA = 21% */

import java.util.Scanner;

public class Ex1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ExtraThings.DrawLine();

        System.out.println("Ingrese el presupuesto anual para calcularlo: ");
        int presupuesto = scanner.nextInt();
        ExtraThings.DrawLine();

        System.out.println("El presupuesto se repartirá de la siguiente forma: ");

        System.out.println("Área de Urgencias: " + presupuesto * 0.37 + "$.");
        System.out.println("Área de Pediatría: " + presupuesto * 0.42 + "$.");
        System.out.println("Área de Traumatología: " + presupuesto * 0.21 + "$.");

        ExtraThings.DrawLine();

        scanner.close();
    }
}
