package Unidad_2.Practica_15;

public class Persona {
    private int id;
    private String nombre, apellidoPat, apellidoMat;

    public Persona(int id, String nombre, String apellidoPat, String apellidoMat) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPat = apellidoPat;
        this.apellidoMat = apellidoMat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws validarNombreException{
        if (nombre.equals("Marco")) {
            throw new validarNombreException("No se aceptan nombres de romanos");
        }
        this.nombre = nombre;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) throws validarNombreException {
        if (apellidoPat.equals("Moreno")) {
            throw new validarNombreException("No los queremos");
        }
        this.apellidoPat = apellidoPat;
    }

    public String getApellidoMat() throws validarNombreException{
        if (apellidoMat.equals("Patricio")) {
            throw new validarNombreException("Es apellido de tonotos");
        }
        return apellidoMat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    @Override
    public String toString() {
        return "Persona:\n" +
                "ID: \n" + id +
                "Nombre\n" + nombre +
                "Apellido Paterno: \n" + apellidoPat +
                "Apellido Materno: \n" + apellidoMat;
    }
}
