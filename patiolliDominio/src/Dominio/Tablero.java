/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.util.ArrayList;


public class Tablero {

    private String numeroTablero;
    private ArrayList<Casilla> casillas = new ArrayList();
    private ArrayList<Jugador> jugadores = new ArrayList();

    public Tablero() {
    }

    public Tablero(String numeroTablero) {
        this.numeroTablero = numeroTablero;
    }

    public String getNumeroTablero() {
        return numeroTablero;
    }

    public void setNumeroTablero(String numeroTablero) {
        this.numeroTablero = numeroTablero;
    }

    public ArrayList<Casilla> getCasillas() {
        return casillas;
    }

    public void setCasillas(ArrayList<Casilla> casillas) {
        this.casillas = casillas;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    


    @Override
    public String toString() {
        return "Tablero{" + "numeroTablero=" + numeroTablero + ", casillas=" + casillas + ", jugadores=" + jugadores + '}';
    }

}
