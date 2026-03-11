package Unidad_2.Practica_7;

public class Practica_7_1 {
    public static class Alumno{
        private String matr, nomb, aPat, aMat;
        private int edad;

        public Alumno(String matr, String nomb, String aPat, String aMat, int edad) {
            this.matr = matr;
            this.nomb = nomb;
            this.aPat = aPat;
            this.aMat = aMat;
            this.edad = edad;
        }

        /*public Alumno() {
            this.matr = "";
            this.nomb = "";
            this.aPat = "";
            this.aMat = "";
            this.edad = 0;
        }*/

        public String getMatr() {
            return matr;
        }

        public void setMatr(String matr) {
            this.matr = matr;
        }

        public String getNomb() {
            return nomb;
        }

        public void setNomb(String nomb) {
            this.nomb = nomb;
        }

        public String getaPat() {
            return aPat;
        }

        public void setaPat(String aPat) {
            this.aPat = aPat;
        }

        public String getaMat() {
            return aMat;
        }

        public void setaMat(String aMat) {
            this.aMat = aMat;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        @Override
        public String toString() {
            return "Matricula: " + matr + '\'' +
                    "\nNombre: " + nomb + '\'' +
                    "\nApellido Paterno: " + aPat + '\'' +
                    "\nApellido Materno: " + aMat + '\'' +
                    "\nEdad: " + edad + "\n";
        }
    }
}
