package Unidad_2.Practica_5;

import javax.swing.*;

public class Practica_5_1 {
    public static class Calculadora{
        private int n1,n2,fn;

        public Calculadora() {
            this.n1 = 0;
            this.n2 = 0;
            this.fn = 0;
        }
        public void suma(){
            this.fn = this.n1 + this.n2;
        }
        public void resta(){
            this.fn = this.n1 - this.n2;
        }
        public void multiplicacion(){
            this.fn = this.n1 * this.n2;
        }
        public void division() {
            if (n2 != 0) {
                this.fn = this.n1 / this.n2;
            }else{
                JOptionPane.showMessageDialog(null,"Error: es imposible dividir por 0");
            }
        }

        public void setN1(int n1) {
            this.n1 = n1;
        }

        public void setN2(int n2) {
            this.n2 = n2;
        }

        public int getFn(){
            return fn;
        }
    }
}
