package Unidad_2.Pre_ExamenP;

public class Validaciones {
    public void validarCantidad(int cantidad) throws CantidadInvalidaException{
        if (cantidad <= 0 ) {
            throw new CantidadInvalidaException("No puedes ingresar cantidades negativas");
        }
    }
    public void validarStock(int cantidad, int disponibles) throws StockInsuficienteException{
        if (cantidad > disponibles) {
            throw new StockInsuficienteException("Stock insuficiente");
        }
    }
}
