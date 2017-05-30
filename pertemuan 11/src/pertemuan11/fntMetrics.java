/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan11;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.Serializable;
/**
 *
 * @author xavier
 */
public class fntMetrics extends JPanel implements Serializable{
    /*
    public int getAscent(){return 5;}
    public int getDescent(){return 5;}
    public int getHeight(){return 5;}
    public int getLeading(){return 5;}
    
    public fntMetrics(){}
    */
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setFont(new Font("SansSerif",Font.BOLD,12));
        g.setColor(Color.blue);
        
        FontMetrics metrics = g.getFontMetrics();
        g.drawString("Font: "+metrics.getFont(),10,40);
        g.drawString("Ascent: "+metrics.getAscent(),10,55);
        g.drawString("Descent: "+metrics.getDescent(), 10, 70);
        g.drawString("Height: "+metrics.getHeight(),10,85);
        g.drawString("Leading: "+metrics.getLeading(),10,100);
  
    }
}
