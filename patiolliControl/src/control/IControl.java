/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package control;

import Dominio.Jugador;
import Dominio.Tablero;

/**
 * Interface de controlador..
 * @author Equipo1
 */
public interface IControl {
    public void establecerJuego(String numeroPartida, int totalJugadores, int tamañoT,double penalización,double montoJugador);

    public void destruirPartida();

    public boolean agregarJugador(String nombre, String color);

    public boolean verificarNombre(String nombre);

    public boolean verificarColor(String color);

    public boolean validarCreacion();

    public boolean validarJugadores();

    public int getTotalJugadores();

    public int getTamañoTablero();

    public Tablero getTablero();

    public String getNumeroPartida();

    public Jugador getTurno();

}
