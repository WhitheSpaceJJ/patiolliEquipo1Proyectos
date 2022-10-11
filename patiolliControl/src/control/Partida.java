package control;

import Dominio.Casilla;
import Dominio.Jugador;
import Dominio.Tablero;
import Dominio.Tablero;
import java.util.ArrayList;
import java.util.List;

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

    public static Partida getPartida() {
        if (instancePartida == null) {
            instancePartida = new Partida();
            tablero = new Tablero();
        }
        return instancePartida;
    }

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

    public void destruirPartida() {
        instancePartida = null;
    }

    public boolean agregarJugador(String nombre, String color) {
        if (tablero.getJugadores().size() < this.totalJugadores) {
            tablero.getJugadores().add(new Jugador(nombre, color));
            return true;
        }
        return false;
    }

    public boolean verificarNombre(String nombre) {
        for (int i = 0; i < tablero.getJugadores().size(); i++) {
            String nombreJugador = tablero.getJugadores().get(i).getNombre();
            if (nombre.equalsIgnoreCase(nombreJugador)) {
                return true;
            }
        }
        return false;
    }

    public boolean verificarColor(String color) {
        for (int i = 0; i < tablero.getJugadores().size(); i++) {
            String colorJugador = tablero.getJugadores().get(i).getColor();
            if (color.equalsIgnoreCase(colorJugador)) {
                return true;
            }
        }
        return false;
    }

    public boolean validarCreacion() {
        return tablero.getCasillas().isEmpty();
    }

    public boolean validarJugadores() {
        return tablero.getJugadores().size() == this.totalJugadores;
    }

    public int getTotalJugadores() {
        return totalJugadores;
    }

    public int getTamañoTablero() {
        return tamañoTablero;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public String getNumeroPartida() {
        return numeroPartida;
    }

    public void setNumeroPartida(String numeroPartida) {
        this.numeroPartida = numeroPartida;
    }

    public void setTotalJugadores(int totalJugadores) {
        this.totalJugadores = totalJugadores;
    }

    public void setTamañoTablero(int tamañoTablero) {
        this.tamañoTablero = tamañoTablero;
    }

    
    
    
    public Turno getTurno() {
        if (tablero.getJugadores().size() - 1 == contadorTurno) {
            contadorTurno = 0;
        }
        turno.setJugador(tablero.getJugadores().get(contadorTurno));
        return turno;
    }

}
