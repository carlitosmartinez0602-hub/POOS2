package Unidad_2.Pre_ExamenP2;

public class Validaciones {
    public void validarHoras(int horas) throws HoraInvalidaException{
        if (horas <= 0) {
            throw new HoraInvalidaException("La hora no puede ser negativa o cero");
        }
    }
    public void validarTarifa(double cantidad) throws CantidadInvalidaException{
        if ( cantidad <= 0) {
            throw new CantidadInvalidaException("La tarifa no peude ser negativa");
        }
    }
    public void validarHorasEstacionadas(int horas) throws HoraInvalidaException{
        if (horas <= 0) {
            throw new HoraInvalidaException("La hora no puede ser negativa o cero");
        }
    }
    public boolean estaDentro(boolean dentro) throws VehiculoNoDentroException{
        if (dentro == false) {
            throw new VehiculoNoDentroException("El vehiculo no esta dentro");
        }
        return true;
    }
    public boolean noDentro(boolean dentro) throws VehiculoYaDentroException{
        if (dentro == true) {
            throw new VehiculoYaDentroException("Ese vehiculo ya esta dentro");
        }
        return false;
    }
}
