package Unidad_2.Practica_6;

public class Practica_6_1 {
    public static class libro{
        private int nPag;
        private String autor, titulo, ISBN;

        public String getISBN() {
            return ISBN;
        }

        public void setISBN(String ISBN) {
            this.ISBN = ISBN;
        }

        public int getnPag() {
            return nPag;
        }

        public void setnPag(int nPag) {
            this.nPag = nPag;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        @Override
        public String toString() {
            return "El libro " + titulo +
                    " con ISBN " + ISBN +
                    " creado por el autor " + autor +
                    " tiene " + nPag + " páginas.";
        }
    }
}
