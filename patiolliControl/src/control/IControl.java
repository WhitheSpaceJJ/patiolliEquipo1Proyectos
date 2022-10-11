/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package control;

import Dominio.Tablero;

/**
 *
 * @author Judi
 */
public interface IControl {

    public void establecerJuego(String numeroPartida, int totalJugadores, int tamañoT);

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

    public Turno getTurno();

}
