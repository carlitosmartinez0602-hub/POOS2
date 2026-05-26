package Unidad_4.Practica_3;

public class Sedan extends Ford {
    private int length;

    public Sedan(int speed, double regularPrice, String color, int year, int manufacturerDiscount, int length) {
        super(speed, regularPrice, color, year, manufacturerDiscount);
        this.length = length;
    }

    @Override
    public double getSalePrice() {
        if (length > 20) {
            return super.getSalePrice() * 0.95;
        } else {
            return super.getSalePrice() * 0.90;
        }
    }
}