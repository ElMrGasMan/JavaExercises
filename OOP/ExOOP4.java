/*
Escribir una clase Papel que contenga un atributo texto, un método escribir, que reciba una
cadena de caracteres para agregar al texto, y el método toString() que imprima el contenido del
texto.

Escribir una clase Birome que contenga un atributo cantidad de tinta, y un método escribir, que
reciba un texto y un papel (objeto de la clase Papel) sobre el cual escribir. Cada letra escrita
debe reducir la cantidad de tinta contenida. Cuando la tinta se acabe, debe imprimir un mensaje
de error indicando que la tinta se ha acabado.
*/


import java.util.Scanner;

class Papel {
    private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Papel() {
        this.texto = "";
    }

    @Override
    public String toString() {
        return "En la hoja está escrito: " + this.texto;
    }

    protected void escribir(String texto2) {
        this.texto = this.texto.concat(texto2) + " ";
    }
}


class Birome {
    private int cantTinta;

    public int getCantTinta() {
        return cantTinta;
    }

    public void setCantTinta(int cantTinta) {
        this.cantTinta = cantTinta;
    }

    public Birome(int cantTinta) {
        this.cantTinta = cantTinta;
    }

    public void escribir(String texto, Papel papel)
    {
        StringBuilder sb = new StringBuilder();

        for (char c : texto.toCharArray())
        {
            if (this.cantTinta == 0)
            {
                System.out.println("ADVERTENCIA: La birome se ha quedado sin tinta. Es posible que el texto no se haya escrito totalmente.");
                break;
            }

            sb.append(c);
            this.cantTinta--;
        }

        papel.escribir(sb.toString());
    }
}


public class ExOOP4 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Papel papel1 = new Papel();

        Birome birome = new Birome(30);

        System.out.println("Escriba un texto: ");
        birome.escribir(scanner.nextLine(), papel1);
        System.out.println(papel1);

        System.out.println("Escriba otro texto: ");
        birome.escribir(scanner.nextLine(), papel1);
        System.out.println(papel1);
    }
}
