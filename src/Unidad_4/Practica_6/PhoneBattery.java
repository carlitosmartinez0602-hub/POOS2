package Unidad_4.Practica_6;

public class PhoneBattery extends Battery {

    public PhoneBattery(int initialCharge) {
        super(initialCharge);
    }

    @Override
    public String toString() {
        return "PhoneBattery " + super.toString();
    }
}