package Unidad_2.Practica_1;

public class Practica_1_1 {
    public static class Matematicas {
        long fn=0;
        public long factorial(long numero) {
            long fctl = 1;
            for (long i = 1; i <= numero; i++) {
                fctl *= i;
            }
            return fctl;
        }
        public long suma(long numero, long numero2 ){
            fn = numero + numero2;
            return fn;
        }
        public double logaritmoNatural(double numero){
            double fn=0;
            fn = Math.log(numero);
            return fn;
        }
    }
}
