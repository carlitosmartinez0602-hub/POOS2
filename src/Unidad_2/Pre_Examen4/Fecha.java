package Unidad_2.Pre_Examen4;

public class Fecha {
    private static final int ANIO_MIN = 1900;
    private static final int ANIO_MAX = 2050;
    private int dia;
    private int mes;
    private int año;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.año = 1900;
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        validar();
    }
    public void leer(){
        int d = Integer.parseInt(MetodosAuxiliares.pDat("Ingresa el día: "));
        int m = Integer.parseInt(MetodosAuxiliares.pDat("Ingresa el mes: "));
        int a = Integer.parseInt(MetodosAuxiliares.pDat("Ingresa el año: "));
        this.dia =d;
        this.mes =m;
        this.año =a;
        validar();
    }
    private void validar(){
        if (año < ANIO_MIN || año > ANIO_MAX) {
            año = 1900;
        }
        if (mes < 1 || mes > 12) {
            mes = 1;
        }
        int maxDias = diasMes(mes);
        if (dia < 1 || dia > maxDias) {
            dia = 1;
        }
    }
        public boolean bisiesto(){
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
    public int diasMes(int mes){
        switch (mes){
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 2:
                if (bisiesto()) {
                    return 29;
                }else {
                    return 28;
                }
            case 4, 6, 9, 11:
                return 30;
            default:
                return 0;
        }
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public String corta(){
        return String.format("%02d-%02d-%04d", dia, mes, año);
    }
    public String mediana(){
        return dia + " de " + MetodosAuxiliares.obtenerNombreMes(mes) + " de " + año;
    }
    public String larga(){
        return MetodosAuxiliares.obtenerNombreDia(diaSemana()) + " " + dia + " de " +
                MetodosAuxiliares.obtenerNombreMes(mes) + " de " + año;
    }
    public int diasTranscurridos() {
        int total = 0;
        for (int i = 1900; i < año; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                total += 366;
            } else {
                total += 365;
            }
        }
        for (int i = 1; i < mes; i++) {
            total += diasMes(i);
        }
        total += dia;
        return total - 1;
    }
    public int diaSemana(){
        int dias = diasTranscurridos();
        int diasemana = dias % 7;
        return diasemana;
    }
    public int diasEntre(Fecha o){
        int diasEsta = this.diasTranscurridos();
        int diasOtra = o.diasTranscurridos();

        return diasEsta - diasOtra;
    }
    public void siguiente(){
        dia++;
        if (dia > diasMes(mes)) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                año++;
            }
        }
        if (año > ANIO_MAX) {
            año = ANIO_MAX;
            dia = 31;
            mes = 12;
        }
    }
    public void anterior() {
        dia--;
        if (dia < 1) {
            mes--;
            if (mes < 1) {
                mes = 12;
                año--;
            }
            dia = diasMes(mes);
        }
        if (año < ANIO_MIN) {
            año = ANIO_MIN;
            dia = 1;
            mes = 1;
        }
    }
    public boolean igualQue(Fecha o){
        return this.dia == o.getDia() && this.mes == o.getMes() && this.año == o.getAño();
    }
    public boolean menorQue(Fecha o){
        return this.diasTranscurridos() < o.diasTranscurridos();
    }
    public boolean mayorQue(Fecha o){
        return this.diasTranscurridos() > o.diasTranscurridos();
    }

}
