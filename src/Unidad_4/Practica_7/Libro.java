package Unidad_4.Practica_7;

public class Libro extends Publicacion {
    private int numPaginas;

    public Libro(String titulo, double precio, int numPaginas) {
        super(titulo, precio);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "|-----Libro impreso-----|\n" +
                super.toString() +
                "\nNúmero de páginas: " + numPaginas;
    }
}