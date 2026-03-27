package Unidad_2.Practica_16;
import javax.swing.*;

public class ValidarNombreSimple {
    static void main(String[] args) {
        String txt = JOptionPane.showInputDialog("Nombre");
        char[] vocales = {
                'a','e','i','o','u',
                'á','é','í','ó','ú',
                'A','E','I','O','U',
                'Á','É','Í','Ó','Ú'};
        int cont=0;

        for (int i = 0; i < txt.length(); i++) {
            for (int j = 0; j < vocales.length; j++) {
                char v = vocales[i];
                if (txt.charAt(i) == v) {
                    cont++;
                    break;
                }
            }
        }

        try {
            if (cont < 3) throw new TresVocalesException();
            JOptionPane.showMessageDialog(null, "El nombre es válido");
        } catch (TresVocalesException e) {
            JOptionPane.showMessageDialog(null, "Error, el nombre debe tener 3 vocales");
        }
    }
}
