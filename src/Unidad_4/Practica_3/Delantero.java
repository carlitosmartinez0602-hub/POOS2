package Unidad_4.Practica_3;

public class Delantero extends Jugador{
    private int goalsScored;
    private int minutesPlayed;

    public Delantero(int uniformNumber, String name, int size, int age, int goalsScored, int minutesPlayed) {
        super(uniformNumber, name, size, age);
        this.goalsScored = goalsScored;
        this.minutesPlayed = minutesPlayed;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getMinutesPlayed() {
        return minutesPlayed;
    }

    public void setMinutesPlayed(int minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }
}
