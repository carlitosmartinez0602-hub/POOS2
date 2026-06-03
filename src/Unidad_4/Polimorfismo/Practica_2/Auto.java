package Unidad_4.Polimorfismo.Practica_2;

public class Auto {
    private String carRegistration;
    private String carBrand;
    private String carModel;

    public Auto(String carRegistration, String carBrand, String carModel) {
        this.carRegistration = carRegistration;
        this.carBrand = carBrand;
        this.carModel = carModel;
    }

    @Override
    public String toString() {
        return carBrand + " " + carModel + " " + carRegistration + " ";
    }
}