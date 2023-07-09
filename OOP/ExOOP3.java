/*
Crear una clase Vector, que en su constructor reciba una lista de elementos que serán sus
coordenadas. En el método toString() se imprime su contenido con el formato [x,y,z].

1. Crear un método que reciba un número y devuelva un nuevo vector (objeto de la clase
Vector), con los elementos multiplicados por ese número.

2. Crear un método sumar que recibe otro vector, verifica si tienen la misma cantidad de
elementos y devuelve un nuevo vector con la suma de ambos. Si no tienen la misma
cantidad de elementos entonces imprimir un mensaje de error y la función debe retornar
el vector que se pasó como parámetro.
*/


import java.util.Scanner;


class Vector
{
    private double x;
    private double y;
    private double z;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Vector(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString()
    {
        return String.format("[%.2f, %.2f, %.2f]\n", this.x, this.y, this.z);
    }

    public Vector multiplicarPorConst(double num)
    {
        return new Vector(this.x * num, this.y * num, this.z * num);
    }

    public Vector sumarVectores(Vector vector2)
    {
        return new Vector(this.x + vector2.getX(), this.y + vector2.getY(), this.z + vector2.getZ());
    }
}


public class ExOOP3
{
    public static void main(String[] args)
    {

    }
}
