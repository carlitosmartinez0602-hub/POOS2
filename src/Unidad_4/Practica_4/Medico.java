package Unidad_4.Practica_4;

public class Medico extends Persona {
    private double appointmentPrice;
    private String speciality;

    public Medico(String name, int age, char sex, double weight, double height, double appointmentPrice, String speciality) {
        super(name, age, sex, weight, height);
        this.appointmentPrice = appointmentPrice;
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + "\n" +
                "Edad: " + age + " años\n" +
                "Sexo: " + comprobarSexo(sex) + "\n" +
                "Especialidad: " + speciality + "\n" +
                "Precio consulta: $" + appointmentPrice;
    }
}