/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan11;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author xavier
 */
public class LinesRectsOvalsJPanel extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        /*
        g.setColor(Color.red);
        g.drawRect(15,35,80,80);
        g.setColor(Color.BLACK);
        g.drawArc(15, 35, 80, 80, 0, 360);
        
        g.setColor(Color.red);
        g.drawRect(100, 35, 80, 80);
        g.setColor(Color.BLACK);
        g.drawArc(100, 35, 80, 80, 0, 110);
        */
        g.setColor(Color.red);
        g.drawRect(15, 35, 80, 80);
        g.setColor(Color.BLACK);
        g.drawLine(15, 35, 80, 80);
        g.drawLine(80, 80, 15, 115);
        g.drawLine(15, 115, 15, 35);
        /*
        g.fillArc(15, 120, 80, 40, 0, 360);
        g.fillArc(100, 120, 80, 40, 270, -90);
        */
    }
}
