package Unidad_2.Practica_3;

public class Practica_3_1 {
    public static class temperatura{
        double temp, gC, gF, fn;

        public temperatura(double temp, double gC, double gF, double fn) {
            this.temp = temp;
            this.gC = gC;
            this.gF = gF;
            this.fn = fn;
        }

        public double getTemp() {
            return temp;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }

        public double getgC() {

            return gC;
        }

        public void setgC(double gC) {
            this.gC = gC;
        }

        public double getgF() {
            return gF;
        }

        public void setgF(double gF) {
            this.gF = gF;
        }

        public double getFn() {
            return fn;
        }

        public void setFn(double fn) {
            this.fn = fn;
        }
    }
}
