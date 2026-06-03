package Unidad_4.Polimorfismo.Practica_1;

public class Triangulo extends Poligono{
    private int alfa,beta,gama;
    private double a,b,c;
    private double base, height;

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "|-----Triangulo-----|";
    }
}
