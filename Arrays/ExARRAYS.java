import Stuff.ExtraThings;

import java.util.Scanner;

public class ExARRAYS
{

    public static void mostrarArrStr(String[] arrMost)
    {
        for (int i = 0; i < arrMost.length; i++)
        {
            System.out.println("El nombre en la posicion número " + (i+1) + " es: " + arrMost[i] + ".");
        }
    }


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] arrNombres = new String[5];
        String nombre;
        int i, selec;


        ExtraThings.DrawLine();

        for(i = 0; i < arrNombres.length; i++)
        {
            System.out.println("Ingrese el nombre número " + (i + 1) + " de la lista:");
            nombre = scanner.nextLine();

            while(nombre.length() > 30)
            {
                System.out.println("El nombre es muy largo. Por favor reingrese el nombre de un modo más corto.");
                nombre = scanner.nextLine();
            }

            arrNombres[i] = nombre;
        }

        ExtraThings.DrawLine();
        mostrarArrStr(arrNombres);
        ExtraThings.DrawLine();

        System.out.println("Ingrese un nombre para eliminar de la lista: ");
        nombre = scanner.nextLine();

        for (i = 0; i < arrNombres.length; i++)
        {
            if(nombre.compareTo(arrNombres[i]) == 0)
            {
                System.out.println("¡Nombre encontrado!. Eliminando...");
                arrNombres[i] = "&-/ESPACIO DISPONIBLE/-&";
                break;
            }

        }

        if(nombre.compareTo(arrNombres[i]) != 0)
        {
            System.out.println("El nombre no ha sido encontrado. Nada fue eliminado.");
        }

        mostrarArrStr(arrNombres);
        ExtraThings.DrawLine();

        System.out.println("Ahora se procederá a ordenar las listas mediante el Ordenamiento de Burbuja.");
        System.out.println("Todos los espacios que estén disponibles se desplazaran al comienzo de la lista. \t");

        int segundoIndex;
        String primero, segundo;

        for(int limite = arrNombres.length - 1; limite > 0; limite--)
        {
            for(int primerIndex = 0; primerIndex < limite; primerIndex++)
            {
                segundoIndex = primerIndex + 1;

                if(arrNombres[primerIndex].compareToIgnoreCase(arrNombres[segundoIndex]) > 0)
                {
                    primero = arrNombres[primerIndex];
                    segundo = arrNombres[segundoIndex];

                    arrNombres[primerIndex] = segundo;
                    arrNombres[segundoIndex] = primero;
                }
            }
        }

        System.out.println("Lista ordenada alfabéticamente. Procediendo a mostrarla:");
        mostrarArrStr(arrNombres);
        ExtraThings.DrawLine();

        scanner.close();
    }
}
