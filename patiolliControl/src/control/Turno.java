/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import Dominio.Jugador;

//Clase que representa el turno de la partida.
class Turno {
    private Jugador jugador;
 //Obtiene el jugador
    public Jugador getJugador() {
        return jugador;
    }
 //Establece el turno.
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    
}
