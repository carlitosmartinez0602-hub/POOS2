package Unidad_2.Pre_ExamenP;

public class Libro {
    private String titulo;
    private String  autor;
    private int disponibles;
    private Validaciones val;

    public Libro() {
        this.titulo = null;
        this.autor = null;
        this.disponibles = 0;
        this.val = new Validaciones();
    }

    public void registrarLibro(String nombreLibro, String nombreAutor, int cantidad){
        this.titulo = nombreLibro;
        this.autor = nombreAutor;
        this.disponibles = cantidad;
    }
    public int añadirLibro(int cantidad) throws CantidadInvalidaException{
        val.validarCantidad(cantidad);
        return this.disponibles += cantidad;
    }
    public int prestarLibro(int cantidad) throws StockInsuficienteException{
        val.validarStock(cantidad,disponibles);
        return disponibles -= cantidad;
    }
    public int devolverLibro(int cantidad) throws CantidadInvalidaException{
        val.validarCantidad(cantidad);
        return disponibles +=cantidad;
    }

    @Override
    public String toString() {
        return "Consulta:\n" +
                "Libro: " + titulo +
                "\nAutor: " + autor +
                "\nTomos disponibles: " + disponibles;
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

    public int getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(int disponibles) {
        this.disponibles = disponibles;
    }
}
