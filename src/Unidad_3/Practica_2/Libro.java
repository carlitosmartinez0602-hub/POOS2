package Unidad_3.Practica_2;

public class Libro {
    private String titulo;
    private String autor;
    private String editorial;
    private String isbn;

    private Capitulo[] capitulos;
    private int contador;

    public Libro() {
        titulo = "";
        autor = "";
        editorial = "";
        isbn = "";
        capitulos = new Capitulo[4];
        contador = 0;
    }

    public Libro(String titulo, String autor, String editorial, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.isbn = isbn;
        capitulos = new Capitulo[4];
        contador = 0;
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

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void insertarCapitulo(Capitulo c) {
        if (contador < 4) {
            capitulos[contador] = c;
            contador++;
        }
    }

    public String mostrarLibro() {
        String txt = "|-----Datos Libro-----|" +
                "\nTítulo: " + titulo +
                "\nAutor: " + autor +
                "\nEditorial: " + editorial +
                "\nISBN: " + isbn +
                "\n\n|-----Capítulos-----| ";

        for (int i = 0; i < contador; i++) {
            txt += "\n\nCapítulo " + (i + 1) + "\n";
            txt += capitulos[i].toString();
        }
        return txt;
    }

    public void eliminarLibro() {
        for (int i = 0; i < contador; i++) {
            capitulos[i] = null;
        }
        contador = 0;
    }
}