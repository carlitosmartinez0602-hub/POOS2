package Unidad_4.Practica_4;

public class Paciente extends Persona {
    private String firstMedAppoint;
    private Medico treatingDoc;

    public static final int PESO_BAJO = -1;
    public static final int PESO_IDEAL = 0;
    public static final int SOBREPESO = 1;
    public static final int OBESIDAD = 2;

    public Paciente(String name, int age, char sex, double weight, double height, String firstMedAppoint, Medico treatingDoc) {
        super(name, age, sex, weight, height);
        this.firstMedAppoint = firstMedAppoint;
        this.treatingDoc = treatingDoc;
    }

    public int calcularIMC() {
        double imc = weight / Math.pow(height, 2);

        if (imc < 18.5) {
            return PESO_BAJO;
        } else if (imc >= 18.5 && imc < 25) {
            return PESO_IDEAL;
        } else if (imc >= 25 && imc < 30) {
            return SOBREPESO;
        } else {
            return OBESIDAD;
        }
    }

    public boolean esMayorEdad() {
        return age >= 18;
    }

    public String getMensajeIMC() {
        int res = calcularIMC();
        switch (res) {
            case PESO_BAJO:
                return "Está por debajo de su peso ideal";
            case PESO_IDEAL:
                return "Está en su peso ideal";
            case SOBREPESO:
                return "Tiene sobrepeso";
            case OBESIDAD:
                return "Tiene obesidad";
            default:
                return "No se pudo determinar";
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + name + "\n" +
                "Edad: " + age + " años\n" +
                "Sexo: " + comprobarSexo(sex)+ "\n" +
                "Peso: " + weight + " kg\n" +
                "Altura: " + height + " m\n" +
                "Fecha primera consulta: " + firstMedAppoint + "\n" +
                "Médico: " + treatingDoc.getName();
    }
}