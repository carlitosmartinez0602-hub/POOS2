package Unidad_4.Practica_4;

public class Persona {
    protected String name;
    protected int age;
    protected char sex;
    protected double weight;
    protected double height;

    public Persona(String name, int age, char sex, double weight, double height) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
    }
    public char comprobarSexo(char sex) {
        if (sex == 'M' || sex == 'm') {
            return 'M';
        } else if (sex == 'H' || sex == 'h') {
            return 'H';
        }
        return 'H';
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
