package Dominio;

/**
 * Clase que representa el dinero del jugador.
 *
 * @author Equipo 1
 */
public class Dinero {

    /**
     * Cantidad de dinero
     */
    private double cantidad;

    /**
     * Constructor vacio
     */
    public Dinero() {
    }

    /**
     * constructor que iniciliaza la cantidad.
     *
     * @param cantidad
     */
    public Dinero(double cantidad) {
        this.cantidad = cantidad;
    }

///Metodos get, set y toString
    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

}
