package Unidad_2.Practica_3;

public class Practica_3_1 {
    public static class temperatura {
        private double temp;

        public temperatura() {
            this.temp = temp;
        }

        public double getTemp() {
            return temp;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }
        public double getgCK(){
            return temp + 32;
        }
        public double getgCF(){
            return (temp * 9/5) +32;
        }
    }
}
