package Unidad_2.Practica_4;

import javax.swing.*;

public class Practica_4_1 {
    public static class calculadora{
        int fn=0, n1=0,n2=0;

        public calculadora() {
            this.fn = fn;
            this.n1 = n1;
            this.n2 = n2;
        }

        public void setN1(int n1) {
            this.n1 = n1;
        }

        public void setN2(int n2) {
            this.n2 = n2;
        }

        public int getFn() {
            return fn;
        }

        public void setFn(int fn) {
            this.fn = fn;
        }
        public void suma (int n1, int n2){
            this.fn = n1 + n2;
        }
        public void resta (int n1, int n2){
            this.fn = n1 - n2;
        }
        public void multiplicacion (int n1, int n2){
            this.fn = n1 * n2;
        }
        public void division (int n1, int n2){
            if (n2 != 0) {
                this.fn = n1 / n2;
            }else{
                JOptionPane.showMessageDialog(null, "Error: es imposible dividir por 0");
            }
        }
    }
}
