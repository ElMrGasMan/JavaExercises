import Stuff.ExtraThings;

import java.util.Scanner;

public class ExARRAYS2
{

    public static void mostrarArrInt(int[] arrMost)
    {
        for (int i = 0; i < arrMost.length; i++)
        {
            System.out.println("El nombre en la posicion número " + (i+1) + " es: " + arrMost[i] + ".");
        }
    }


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] arrNum1 = new int[5], arrNum2 = new int[5];
        int[] arrNum3 = new int[arrNum1.length + arrNum2.length], arrNum4 = new int[arrNum1.length + arrNum2.length];
        int num, i, j = 0;
        int tamanArr1 = arrNum1.length, tamanArr2 = arrNum2.length;

        ExtraThings.DrawLine();
        System.out.println("Ahora se procedera a ingresar los datos en la lista numero 1: ");

        for(i = 0; i < tamanArr1; i++)
        {
            System.out.println("Ingrese el numero en la posicion " + (i+1) + ":");
            num = scanner.nextInt();

            arrNum1[i] = num;
        }
        ExtraThings.DrawLine();

        System.out.println("Ahora a ingresar los datos de la lista numero 2: ");

        for(i = 0; i < tamanArr2; i++)
        {
            System.out.println("Ingrese el numero en la posicion " + (i+1) + ":");
            num = scanner.nextInt();

            arrNum2[i] = num;
        }
        ExtraThings.DrawLine();

        System.out.println("A continuacion se procedera a concatenar ambas listas en una sola: ");

        for(i = 0; i < tamanArr1 * 2; i++)
        {
            if(i >= tamanArr1)
            {
                arrNum3[i] = arrNum2[i - tamanArr2];
            }
            else
            {
                arrNum3[i] = arrNum1[i];
            }

        }

        mostrarArrInt(arrNum3);
        ExtraThings.DrawLine();;

        System.out.println("Ahora se procederá a INTERSECTAR ambas listas en una nueva: ");

        for(int numb : arrNum1)
        {
            for(i = 0; i < tamanArr2; i++)
            {
                if(numb == arrNum2[i])
                {
                    arrNum4[j] = arrNum2[i];
                    j++;
                }
            }
        }

        mostrarArrInt(arrNum4);
        ExtraThings.DrawLine();

        scanner.close();
    }
}
