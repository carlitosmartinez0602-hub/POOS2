package Unidad_3.Practica_2;

public class Capitulo {
    private String titulo;
    private int paginas;

    public Capitulo() {
        titulo = "";
        paginas = 0;
    }

    public Capitulo(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Título: " + titulo +
                "\n No. de Páginas: " + paginas;
    }
}