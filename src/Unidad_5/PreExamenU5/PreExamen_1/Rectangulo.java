package Unidad_5.PreExamenU5.PreExamen_1;

public class Rectangulo extends Figura{
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return ancho * largo;
    }

    @Override
    public String toString() {
        return "|-----Rectangulo-----|" +
                "\nLargo: " + largo +
                "\nAncho: " + ancho +
                "\nÁrea: " + calcularArea();
    }
}
