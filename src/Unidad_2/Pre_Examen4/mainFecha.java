package Unidad_2.Pre_Examen4;

public class mainFecha {
    static void main(String[] args) {
        Fecha f = new Fecha();
        f.leer();

        MetodosAuxiliares.dInf("Corta: " + f.corta() + "\n" +
                "Mediana: " + f.mediana() + "\n" +
                "Larga: " + f.larga() + "\n" +
                "Días Transcurridos: " + f.diasTranscurridos() + "\n" +
                "Día de la semana: " + f.diaSemana() + "\n" +
                "¿Es bisiesto?: " + f.bisiesto());

        f.siguiente();
        MetodosAuxiliares.dInf("Un día después: " + f.corta());

        f.anterior();
        MetodosAuxiliares.dInf("Un día antes: " + f.corta());

        Fecha otra = new Fecha();
        MetodosAuxiliares.dInf("Fecha a comparar con la original");
        otra.leer();
        MetodosAuxiliares.dInf("Comparando: " + otra.corta() + ":\n" +
                "¿Es igual?: " + f.igualQue(otra) + "\n" +
                "¿Es menor?: " + f.menorQue(otra) + "\n" +
                "¿Es mayor?: " + f.mayorQue(otra) + "\n" +
                "Días entre ambas: " + Math.abs(f.diasEntre(otra)));
    }
}