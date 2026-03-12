package Unidad_2.Practica_8;

public class libro {
    private String titulo, autor, genero;
    private int a;

    public libro(String titulo, String autor, String genero, int a) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.a = a;
    }
    public libro() {
        this.titulo = null;
        this.autor = null;
        this.genero = null;
        this.a = 0;
    }
    public libro(String titulo) {
        this.titulo = titulo;
        this.autor = null;
        this.genero = null;
        this.a = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
