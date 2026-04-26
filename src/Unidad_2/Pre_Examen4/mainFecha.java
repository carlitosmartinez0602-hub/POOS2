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
                "¿Es bisiesto?: " + f.bisiesto() + "\n");
    }
}
