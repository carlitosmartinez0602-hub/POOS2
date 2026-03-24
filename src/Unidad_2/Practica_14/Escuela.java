package Unidad_2.Practica_14;

import javax.swing.*;

public class Escuela {
    static Estudiante e;

    public static void main(String[] args) {
        int el;
        do {
            el = Integer.parseInt(JOptionPane.showInputDialog(
                    "1. Registrar Estudiante\n2. Registrar 3 Materias\n3. Asignar Calificación\n" +
                            "4. Calcular Promedio\n5. Mostrar Todas\n6. Mostrar con Calificación\n" +
                            "7. Mostrar sin Calificación\n8. Mostrar Promedio\n0. Salir"));

            switch(el) {
                case 1: registrarEstudiante(); break;
                case 2: registrarMaterias(); break;
                case 3: asignarCalificacion(); break;
                case 4: calcularPromedio(); break;
                case 5: JOptionPane.showMessageDialog(null, e.mostrarTodas()); break;
                case 6: JOptionPane.showMessageDialog(null, e.mostrarConCalif()); break;
                case 7: JOptionPane.showMessageDialog(null, e.mostrarSinCalif()); break;
                case 8: mostrarPromedio(); break;
                case 0: JOptionPane.showMessageDialog(null, "Adiós"); break;
                default: JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        } while(el != 0);
    }

    static void registrarEstudiante() {
        String mat = pDat("Matrícula:");
        if (mat == null) return;
        String nom = pDat("Nombre:");
        if (nom == null) return;
        String ape = pDat("Apellido:");
        if (ape == null) return;

        e = new Estudiante(mat, nom, ape);
        JOptionPane.showMessageDialog(null, "Registrado");
    }

    static void registrarMaterias() {
        if (e == null) { JOptionPane.showMessageDialog(null, "Primero registre estudiante"); return; }

        for (int i = 0; i < 3; i++) {
            String clave = pDat("Materia " + (i+1) + " - Clave:");
            if (clave == null) return;
            String nombre = pDat("Materia " + (i+1) + " - Nombre:");
            if (nombre == null) return;

            Materia m = new Materia();
            m.setClave(clave);
            m.setNombre(nombre);
            e.getMaterias()[i] = m;
        }
        JOptionPane.showMessageDialog(null, "3 materias registradas");
    }

    static void asignarCalificacion() {
        if (e == null || e.getMaterias()[0].getClave().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Registre estudiante y materias primero");
            return;
        }

        String lista = "";
        for (int i = 0; i < 3; i++) {
            lista += (i+1) + ". " + e.getMaterias()[i].getClave() + " - " + e.getMaterias()[i].getNombre() + "\n";
        }

        int sel = Integer.parseInt(pDat(lista + "\nElegir materia (1-3):"));
        Materia m = e.getMaterias()[sel-1];

        try {
            double cal = Double.parseDouble(pDat("Calificación (0-100):"));
            m.setCalificacion(cal);
            JOptionPane.showMessageDialog(null, "Calificación asignada");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    static void calcularPromedio() {
        if (e == null) { JOptionPane.showMessageDialog(null, "Registre estudiante primero"); return; }
        JOptionPane.showMessageDialog(null, "Promedio: " + e.calcularPromedio());
    }

    static void mostrarPromedio() {
        if (e == null) { JOptionPane.showMessageDialog(null, "Registre estudiante primero"); return; }
        int calif = 0;
        for (int i = 0; i < 3; i++) {
            if (e.getMaterias()[i].getCalificacion() != -1) calif++;
        }
        JOptionPane.showMessageDialog(null,
                e.getNombre() + " " + e.getApellido() + "\n" +
                        "Calificadas: " + calif + "/3\n" +
                        "Promedio: " + e.calcularPromedio());
    }

    public static String pDat(String txt) {
        return JOptionPane.showInputDialog(txt);
    }
}