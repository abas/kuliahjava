/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan11;
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author E
 */
public class kostumFont extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setFont(new Font("Serif",Font.BOLD,12));
        g.drawString("Serif 12 point bold", 20, 50);
        
        g.setFont(new Font("Monospaced",Font.ITALIC,24));
        
        g.drawString("Monospaced 24 point italic",20,70);
    }
}
