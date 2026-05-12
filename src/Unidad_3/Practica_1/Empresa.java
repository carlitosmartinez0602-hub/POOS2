package Unidad_3.Practica_1;

public class Empresa {
    private String rfc;
    private String razonSocial;
    private String nombreGerente;
    private Departamento[] departamentos;
    private int contador;

    public Empresa() {
        rfc = "";
        razonSocial = "";
        nombreGerente = "";
        departamentos = new Departamento[4];
        contador = 0;
    }

    public Empresa(String rfc, String razonSocial, String nombreGerente) {
        this.rfc = rfc;
        this.razonSocial = razonSocial;
        this.nombreGerente = nombreGerente;
        departamentos = new Departamento[4];
        contador = 0;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreGerente() {
        return nombreGerente;
    }

    public void setNombreGerente(String nombreGerente) {
        this.nombreGerente = nombreGerente;
    }

    public void insertarDepartamento(Departamento d) {
        if (contador < 4) {
            departamentos[contador] = d;
            contador++;
        }
    }

    public String mostrarEmpresa() {
        String txt = "|-----Datos Departamento-----|" +
                "\nRFC: " + rfc +
                "\nRazón Social: " + razonSocial +
                "\nGerente: " + nombreGerente +
                "\n\n|-----Departamento-----| ";

        for (int i = 0; i < contador; i++) {

            txt += "\n\nDepartamento " + (i + 1) + "\n";
            txt += departamentos[i].mostrarDepartamento();
        }
        return txt;
    }

    public void eliminarEmpresa() {
        for (int i = 0; i < contador; i++) {
            departamentos[i] = null;
        }
        contador = 0;
    }
}