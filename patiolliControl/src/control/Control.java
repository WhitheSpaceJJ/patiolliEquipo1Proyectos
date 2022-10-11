/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import Dominio.Casilla;
import Dominio.Jugador;
import Dominio.Tablero;

/**
 * Clase que gestiona el juego y conexion entre usuarios , pero se prentende que gestione las reglas de juego y de movimiento.
 *
 * @author Equipo 1.
 */
public class Control implements IControl {
//Control para realizar patron singleton

    private static Control instanceControl;
    //Partida que controla.
    private Partida partida;
//Contructores

    private Control() {
    }

    public static Control getControl() {
        if (instanceControl == null) {
            instanceControl = new Control();
        }
        return instanceControl;
    }

    //Andamos en proceso de colocar el monto,y la penalización de partida.
    /**
     * Clase que establecer o da inicio a una partida.
     * @param numeroPartida Numero de partida.
     * @param totalJugadores Total de jugadores.
     * @param tamañoT Tamalo del tablero
     * @param penalización Penalización por jugador
     * @param montoJugador Monto por jugador.
     */
    @Override
    public void establecerJuego(String numeroPartida, int totalJugadores, int tamañoT, double penalización, double montoJugador) {
//        Partida.getPartida().establecerJuego(numeroPartida, totalJugadores, tamañoT);
        this.partida = Partida.getPartida();
        this.partida.establecerJuego(numeroPartida, totalJugadores, tamañoT);
    }
/**
 * Metodo que finaliza la partida
 */
    @Override
    public void destruirPartida() {
//        Partida.getPartida().destruirPartida();
        this.partida.destruirPartida();
    }
/**
 * Metodo que solicita a la partida agregar un jugador..
 * @param nombre Nombre del jugador.
 * @param color Color del jugador.
 * @return  true si fue agregado, false en caso contrario.
 */
    @Override
    public boolean agregarJugador(String nombre, String color) {
//        return Partida.getPartida().agregarJugador(nombre, color);
        return this.partida.agregarJugador(nombre, color);
    }

    /**
     * Metodo que solicita a la partida verificar si el nombre sigue aun disponible.
     * @param nombre Nombre a verificar.
     * @return true si el nombre ya existe ,false en caso contrario.
     */
    @Override
    public boolean verificarNombre(String nombre) {
//        return Partida.getPartida().verificarNombre(nombre);
        return this.partida.verificarNombre(nombre);
    }
   /**
     * Metodo que solicita a la partida verificar si el color sigue aun disponible.
     * @param nombre color a verificar.
     * @return true si el nombre ya existe ,false en caso contrario.
     */
    @Override
    public boolean verificarColor(String color) {
//        return Partida.getPartida().verificarColor(color);
        return this.partida.verificarColor(color);
    }

    /**
     * Metodo que verifica si la partida ha sido creada.
     * @return  true si la partida fue creada. 
     */
    @Override
    public boolean validarCreacion() {
                this.partida = Partida.getPartida();
        return this.partida.validarCreacion();
    }
/**
 * Metodo que valida la cantida de jugadores.
 * @return  true si la partida
 */
    @Override
    public boolean validarJugadores() {
        return this.partida.validarJugadores();
    }
//Obtener total de jugadores.
    @Override
    public int getTotalJugadores() {
        return this.partida.getTotalJugadores();
    }
//Obtener tamaño de tablero.
    @Override
    public int getTamañoTablero() {
        return this.partida.getTamañoTablero();
    }
//Obtenr tablero.
    @Override
    public Tablero getTablero() {
        return this.partida.getTablero();
    }

    @Override
    public String getNumeroPartida() {
        return this.partida.getNumeroPartida();
    }
//Obtiene el turno actual.
    @Override
    public Jugador getTurno() {
        return this.partida.getTurno().getJugador();
    }

}
