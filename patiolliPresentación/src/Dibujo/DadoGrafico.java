/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dibujo;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DadoGrafico extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        //Cordeandas de fichas Circulos ahi las tengo en la libreta
        Figura f1 = new Dado(35, 35, 70, 105, false, g, "f1");
        Figura f2 = new Dado(140, 35, 70, 105, false, g, "f1");
        Figura f3 = new Dado(245, 35, 70, 105, false, g, "f1");
        Figura f4 = new Dado(70, 175, 70, 105, false, g, "f1");
        Figura f5 = new Dado(210, 175, 70, 105, false, g, "f1");
        CompositorCasilla dados = new CompositorCasilla("dados");
        dados.addElemento(f1);
        dados.addElemento(f2);
        dados.addElemento(f3);
        dados.addElemento(f4);
        dados.addElemento(f5);
        dados.dibujar();
    }
        //Falta hacer que dibuje random , con una lista de 0 y 1
     @Override
    public void paint(Graphics g) {
        //Cordeandas de fichas Circulos ahi las tengo en la libreta
        Figura f1 = new Dado(35, 35, 70, 105, false, g, "f1");
        Figura f2 = new Dado(140, 35, 70, 105, false, g, "f1");
        Figura f3 = new Dado(245, 35, 70, 105, false, g, "f1");
        Figura f4 = new Dado(70, 175, 70, 105, false, g, "f1");
        Figura f5 = new Dado(210, 175, 70, 105, false, g, "f1");
        CompositorCasilla dados = new CompositorCasilla("dados");
        dados.addElemento(f1);
        dados.addElemento(f2);
        dados.addElemento(f3);
        dados.addElemento(f4);
        dados.addElemento(f5);
        dados.dibujar();
        //Dibujar Circulos con generador Randow en base a lista crear metodo que restableza la lista
         g.drawOval(227, 227, 35, 35);
    }

}
