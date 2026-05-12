package Unidad_3.Practica_2;

public class Libro {
    private String titulo, autor, editorial, isbn;
    private Capitulo[] capitulos;
    private int contador;

    public Libro(String titulo, String autor, String editorial, String isbn)  throws DatosInvalidosException {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.isbn = isbn;
        capitulos = new Capitulo[4];
        contador = 0;
    }

    public void insertarCapitulo(Capitulo c) throws LimiteCapsException {
        if (contador >= 4) {
            throw new LimiteCapsException("Has sobrepasado el limite de capitulos (4)");
        }
        capitulos[contador] = c;
        contador++;
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

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getEditorial() { return editorial; }
    public String getIsbn() { return isbn; }
}