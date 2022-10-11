/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import Dominio.Casilla;
import Dominio.Jugador;
import Dominio.Tablero;

public class Control implements IControl {

    private static Control instanceControl;
    private Partida partida;

    @Override
    public void establecerJuego(String numeroPartida, int totalJugadores, int tamañoT) {
//        Partida.getPartida().establecerJuego(numeroPartida, totalJugadores, tamañoT);
        this.partida = Partida.getPartida();
        this.partida.establecerJuego(numeroPartida, totalJugadores, tamañoT);
    }

    private Control() {
    }

    public static Control getControl() {
        if (instanceControl == null) {
            instanceControl = new Control();
        }
        return instanceControl;
    }

    @Override
    public void destruirPartida() {
//        Partida.getPartida().destruirPartida();
        this.partida.destruirPartida();
    }

    @Override
    public boolean agregarJugador(String nombre, String color) {
//        return Partida.getPartida().agregarJugador(nombre, color);
        return this.partida.agregarJugador(nombre, color);
    }

    @Override
    public boolean verificarNombre(String nombre) {
//        return Partida.getPartida().verificarNombre(nombre);
 return  this.partida.verificarNombre(nombre);
    }

    @Override
    public boolean verificarColor(String color) {
//        return Partida.getPartida().verificarColor(color);
 return  this.partida.verificarColor(color);
    }

    @Override
    public boolean validarCreacion() {
//        return Partida.getPartida().validarCreacion();
         return  this.partida.validarCreacion();
    }

    @Override
    public boolean validarJugadores() {
//        return Partida.getPartida().validarJugadores();
         return  this.partida.validarJugadores();
    }

    @Override
    public int getTotalJugadores() {
//        return Partida.getPartida().getTotalJugadores();
 return  this.partida.getTotalJugadores();
    }

    @Override
    public int getTamañoTablero() {
//        return Partida.getPartida().getTamañoTablero();
 return  this.partida.getTamañoTablero();
    }

    @Override
    public Tablero getTablero() {
//        return Partida.getPartida().getTablero();
 return  this.partida.getTablero();
    }

    @Override
    public String getNumeroPartida() {
//        return Partida.getPartida().getNumeroPartida();
 return  this.partida.getNumeroPartida();
    }

    @Override
    public Turno getTurno() {
//        return Partida.getPartida().getTurno();
 return  this.partida.getTurno();
    }

}
