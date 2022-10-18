package control;

import Dominio.Casilla;
import Dominio.Jugador;
import Dominio.Tablero;
import Dominio.Tablero;
import java.util.ArrayList;
import java.util.List;
/**
 * Clase que representa la partida.
 * @author Partida
 */
class Partida {

    private static Partida instancePartida;
    private static Tablero tablero;
    private int totalJugadores;
    private int tamañoTablero;
    private String numeroPartida;
    private Turno turno ;
    private int contadorTurno;

    private Partida() {
       this.turno = new Turno();
       this.contadorTurno=0;
    }
//Obtener partida
    public static Partida getPartida() {
        if (instancePartida == null) {
            instancePartida = new Partida();
            tablero = new Tablero();
        }
        return instancePartida;
    }
//Establcer partida.Penalizacion monto por jugador, tamaño detablero, casilla.
    public void establecerJuego(String numeroPartida, int totalJugadores, int tamañoT) {
        this.numeroPartida = numeroPartida;
        this.tamañoTablero = tamañoT;
        this.totalJugadores = totalJugadores;
        switch (tamañoTablero) {
            case 14:
                //Añadir casillas 60 casillas
                tablero.getCasillas().add(new Casilla("Entrada/Salida"));
                tablero.getCasillas().add(new Casilla("Normal"));
                
                break;
            case 12:
                //Añadir casillas 52 casillas
                tablero.getCasillas().add(new Casilla("Entrada/Salida"));
                tablero.getCasillas().add(new Casilla("Normal"));
                break;
            case 10:
                //Añadir casillas 44 casillas
                tablero.getCasillas().add(new Casilla("Entrada/Salida"));
                tablero.getCasillas().add(new Casilla("Normal"));
                break;
            default:
                break;
        }
        this.tamañoTablero = tamañoT;
        this.totalJugadores = totalJugadores;
    }
//Termina la partida.
    public void destruirPartida() {
        instancePartida = null;
    }
//Agrega jugador a la partida.
    public boolean agregarJugador(Jugador jugador) {
        if (tablero.getJugadores().size() < this.totalJugadores) {
            tablero.getJugadores().add(jugador);
            return true;
        }
        return false;
    }
//Verifica si el nombre aun sigue disponible
    public boolean verificarNombre(String nombre) {
        for (int i = 0; i < tablero.getJugadores().size(); i++) {
            String nombreJugador = tablero.getJugadores().get(i).getNombre();
            if (nombre.equalsIgnoreCase(nombreJugador)) {
                return true;
            }
        }
        return false;
    }
//Verifica si el color aun sigue disponible
    public boolean verificarColor(String color) {
        for (int i = 0; i < tablero.getJugadores().size(); i++) {
            String colorJugador = tablero.getJugadores().get(i).getColor();
            if (color.equalsIgnoreCase(colorJugador)) {
                return true;
            }
        }
        return false;
    }
//Valida si el la paartida ha sido creada, o esatablecida(Tablero).
    public boolean validarCreacion() {
        return tablero.getCasillas().isEmpty();
    }
//Valida la disponibilidad de jugadores, si el juego aun no esta completo..
    public boolean validarJugadores() {
        return tablero.getJugadores().size() == this.totalJugadores;
    }
//Obtiene el total de jugadores.
    public int getTotalJugadores() {
        return totalJugadores;
    }
//Obtiene el tamaño del tablero.
    public int getTamañoTablero() {
        return tamañoTablero;
    }
//Obtener el tablero de la partida.
    public Tablero getTablero() {
        return tablero;
    }
//Obtener el numero de partida
    public String getNumeroPartida() {
        return numeroPartida;
    }
//Establecer el numero de partida.
    public void setNumeroPartida(String numeroPartida) {
        this.numeroPartida = numeroPartida;
    }
//Establecer total de jugadores.
    public void setTotalJugadores(int totalJugadores) {
        this.totalJugadores = totalJugadores;
    }
//Establecer el tamaño del tablero
    public void setTamañoTablero(int tamañoTablero) {
        this.tamañoTablero = tamañoTablero;
    }
//Obtener turno actual y establecer el siguiente turno.
//Sigue en proceso.    
    public Turno getTurno() {
        if (tablero.getJugadores().size() - 1 == contadorTurno) {
            contadorTurno = 0;
        }
        turno.setJugador(tablero.getJugadores().get(contadorTurno));
        return turno;
    }

}
