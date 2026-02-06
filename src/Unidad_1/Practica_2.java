package Unidad_1;

public class Practica_2 {
    static void main() {
        String V = "Está erguido, ¡cual estatua romana! y así permanerá hasta" +
                "que la muerte lo convierta en mármol";
        char a = 'a';
        int pos = 0;
        int cont = 1;
        do {
            pos = V.indexOf(a, pos +1);
            if (pos != -1){
                System.out.println("Posición: " + cont + " || Index: " + pos);
                cont++;
            }

        }while(pos !=-1);
    }
}
