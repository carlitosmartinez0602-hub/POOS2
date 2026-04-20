package Unidad_2.Pre_Examen3;

public class validaciones {
    public void validarCantidad(int cantidad) throws cantidadInvalidaException{
        if (cantidad < 0) {
            throw new cantidadInvalidaException("¡No puedes ingresar cantidades de producto negativas!");
        }
    }
    public void validarPrecio(int precio) throws precioInvalidoException{
        if (precio < 0) {
            throw new precioInvalidoException("¡No puedes ingresar precios negativos!");
        }
    }
    public void validarStock(int cantVenta, int stockDisponible)throws stockInsuficienteException{
        if (cantVenta > stockDisponible) {
            throw new stockInsuficienteException("¡No se puede vender más producto del disponible!" + stockDisponible);
        }
    }
}
