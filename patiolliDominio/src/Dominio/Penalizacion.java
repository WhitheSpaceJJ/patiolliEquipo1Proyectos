
package Dominio;


public class Penalizacion {
  private double cantidad;
  private Jugador jugador;
  private String tipo;

    public Penalizacion() {
    }

    public Penalizacion(double cantidad, Jugador jugador, String tipo) {
        this.cantidad = cantidad;
        this.jugador = jugador;
        this.tipo = tipo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Penalizacion{" + "cantidad=" + cantidad + ", jugador=" + jugador + ", tipo=" + tipo + '}';
    }
  
    
}
