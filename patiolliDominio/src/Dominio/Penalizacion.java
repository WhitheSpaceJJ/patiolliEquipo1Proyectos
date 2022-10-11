
package Dominio;

//Clase que representa la penalizacion.
public class Penalizacion {
    //Cantidad a restar
  private double cantidad;
  //Jugador a penalizar
  private Jugador jugador;
 //Tipo de penalizacion
  private String tipo;
//Constructores 
    public Penalizacion() {
    }

    public Penalizacion(double cantidad, Jugador jugador, String tipo) {
        this.cantidad = cantidad;
        this.jugador = jugador;
        this.tipo = tipo;
    }
//Metodos get y set
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
//Metodos to String
    @Override
    public String toString() {
        return "Penalizacion{" + "cantidad=" + cantidad + ", jugador=" + jugador + ", tipo=" + tipo + '}';
    }
  
    
}
