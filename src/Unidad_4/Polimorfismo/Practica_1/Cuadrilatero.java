package Unidad_4.Polimorfismo.Practica_1;

public class Cuadrilatero extends Poligono{
    private int alfa,beta;
    private double a,b;
    private double base, height;

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "|-----Cuadrilatero-----|";
    }
}
