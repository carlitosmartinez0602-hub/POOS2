package Unidad_5.PreExamenU5.PreExamen_1;

public class Cirunferencia extends Figura{
    private double radio;
    private double pi;

    public Cirunferencia(double radio, double pi) {
        this.radio = radio;
        this.pi = Math.PI;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    @Override
    public double calcularArea() {
        return pi * (Math.pow(radio,2));
    }

    @Override
    public String toString() {
        return "|-----Cirunferencia-----|" +
                "\nRadio: "+ radio +
                "\nPi=" + pi +
                "\nÁrea: " + calcularArea();
    }
}
