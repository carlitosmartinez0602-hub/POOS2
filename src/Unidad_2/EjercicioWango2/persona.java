package Unidad_2.EjercicioWango2;

public class persona {
    private String nombre, dni;

    public persona(String nombre, String dni) throws dniInvalidoException {
        this.nombre = nombre;
        setDni(dni);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    private boolean validarDNI(String dni) {
        if (dni == null || dni.length() != 9) {
            return false;
        }

        char[] caracteres = dni.toCharArray();
        for (int i = 0; i < 8; i++) {
            if (!Character.isDigit(caracteres[i])) {
                return false;
            }
        }
        return Character.isUpperCase(caracteres[8]) && Character.isLetter(caracteres[8]);
    }
}
