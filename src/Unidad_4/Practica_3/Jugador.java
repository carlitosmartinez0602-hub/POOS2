package Unidad_4.Practica_3;

public class Jugador {
    private int uniformNumber;
    private String name;
    private int size;
    private int age;

    public Jugador(int uniformNumber, String name, int size, int age) {
        this.uniformNumber = uniformNumber;
        this.name = name;
        this.size = size;
        this.age = age;
    }

    public int getUniformNumber() {
        return uniformNumber;
    }

    public void setUniformNumber(int uniformNumber) {
        this.uniformNumber = uniformNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\n|-----Jugador-----|\n" +
                "\nNúmero de uniforme: " + uniformNumber +
                "\nNombre: " + name +
                "\nTalla: " + size + " cm" +
                "\nEdad: " + age + " años";
    }
}
