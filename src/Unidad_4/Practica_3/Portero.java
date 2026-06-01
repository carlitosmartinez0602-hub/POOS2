package Unidad_4.Practica_3;

public class Portero extends Jugador{
    private int minutesPlayed;

    public Portero(int uniformNumber, String name, int size, int age, int minutesPlayed) {
        super(uniformNumber, name, size, age);
        this.minutesPlayed = minutesPlayed;
    }

    public int getMinutesPlayed() {
        return minutesPlayed;
    }

    public void setMinutesPlayed(int minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPosición: Portero" +
                "\nMinutos jugados: " + minutesPlayed;
    }
}
