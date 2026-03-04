package Unidad_2.Practica_2;

public class Practica_2_1 {
    public static class persona{
        private String nomb, apMat, apPat ;
        private int id, edad;

        public persona(String nomb, String apMat, String apPat, int id, int edad) {
            this.nomb = nomb;
            this.apMat = apMat;
            this.apPat = apPat;
            this.id = id;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNomb() {
            return nomb;
        }

        public void setNomb(String nomb) {
            this.nomb = nomb;
        }

        public String getApMat() {
            return apMat;
        }

        public void setApMat(String apMat) {
            this.apMat = apMat;
        }

        public String getApPat() {
            return apPat;
        }

        public void setApPat(String apPat) {
            this.apPat = apPat;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "persona{" +
                    "nomb='" + nomb + '\'' +
                    ", apMat='" + apMat + '\'' +
                    ", apPat='" + apPat + '\'' +
                    ", id=" + id +
                    ", edad=" + edad +
                    '}';
        }
    }
}
