package Unidad_4.Practica_3;

public class Sedan extends Ford {
    private int lenght;

    public Sedan(int speed, double regularPrice, String color, int year, int manufacturerDiscount, int lenght) {
        super(speed, regularPrice, color, year, manufacturerDiscount);
        this.lenght = lenght;
    }

    @Override
    public double getSalePrice() {
        if (lenght > 20) {
            return super.getSalePrice() * 0.95;
        } else {
            return super.getSalePrice() * 0.90;
        }
    }
}