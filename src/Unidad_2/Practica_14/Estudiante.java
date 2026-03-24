package Unidad_2.Practica_14;

public class Estudiante {
    private String matricula;
    private String nombre;
    private String apellido;
    private Materia[] materias;

    public Estudiante(String matricula, String nombre, String apellido) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.materias = new Materia[3];
        for (int i = 0; i < 3; i++) {
            materias[i] = new Materia();
        }
    }

    public String getMatricula() { return matricula; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public Materia[] getMaterias() { return materias; }

    public double calcularPromedio() {
        double suma = 0;
        int cont = 0;
        for (int i = 0; i < 3; i++) {
            if (materias[i].getCalificacion() != -1) {
                suma += materias[i].getCalificacion();
                cont++;
            }
        }
        return cont > 0 ? suma / cont : 0;
    }

    public String mostrarTodas() {
        String texto = "MATERIAS:\n";
        for (int i = 0; i < 3; i++) {
            texto += (i+1) + ". " + materias[i] + "\n";
        }
        return texto;
    }

    public String mostrarConCalif() {
        String texto = "MATERIAS CON CALIFICACIÓN:\n";
        boolean hay = false;
        for (int i = 0; i < 3; i++) {
            if (materias[i].getCalificacion() != -1) {
                texto += (i+1) + ". " + materias[i] + "\n";
                hay = true;
            }
        }
        return hay ? texto : "No hay materias calificadas";
    }

    public String mostrarSinCalif() {
        String texto = "MATERIAS SIN CALIFICACIÓN:\n";
        boolean hay = false;
        for (int i = 0; i < 3; i++) {
            if (materias[i].getCalificacion() == -1 && !materias[i].getClave().isEmpty()) {
                texto += (i+1) + ". " + materias[i] + "\n";
                hay = true;
            }
        }
        return hay ? texto : "Todas tienen calificación";
    }
}