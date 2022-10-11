
package Dominio;

import java.util.ArrayList;


public class Jugador {

    private String nombre, color;
    private Dinero dinero;
    private ArrayList<Ficha> fichas = new ArrayList();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Jugador(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public Jugador() {
    }

    public void color(String color) {

    }

    public ArrayList<Ficha> getFichas() {
        return fichas;
    }

    public void setFichas(ArrayList<Ficha> fichas) {
        this.fichas = fichas;
    }

    @Override
    public String toString() {
        return "usuario{" + " nombre= " + nombre + ", color= " + color + '}';
    }

}
