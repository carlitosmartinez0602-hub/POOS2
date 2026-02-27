package Unidad_2.Practica_1;

public class Practica_1_1 {
    public static class Matematicas {
        long fn=0;
        String fnS;
        public long factorial(long numero) {
            long fctl = 1;
            for (long i = 1; i <= numero; i++) {
                fctl *= i;
            }
            return fctl;
        }
        public long resta(long numero, long numero2){
            fn = numero - numero2;
            return fn;
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
        public long mayorDosNumeros(long numero, long numero2){
            if (numero > numero2){
                fn = numero;
            }else{
                fn = numero2;
            }
            return fn;
        }
        public String esPar(long numero){
            String par="Par", impar="Impar";
            if (numero % 2 == 0) {
                fnS = par;
            }else {
                fnS = impar;
            }
            return fnS;
        }
        public String esPrimo(long numero){

            String primo = " Es Primo", noPrimo=" No es Primo";
            boolean esPrimo = true;
            if (numero <= 1) {
                esPrimo = false;
            } else {
                for (int i = 2; i < Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }

            if (esPrimo) {
                fnS = primo;
            } else {
                fnS = noPrimo;
            }
            return fnS;
        }
        public long calcularPromedio(long numero, long numero2, long numero3){
            fn = (numero + numero2 + numero3)/3;
            return fn;
        }
    }
}
