/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan11;
import java.awt.Color;
import javax.swing.JFrame;
/**
 *
 * @author E
 */
public class tampilWarna extends JFrame{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pilihan Warna");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        warnaJava colorJPanel = new warnaJava();
        frame.add(colorJPanel);
        frame.setSize(400,180);
        frame.setVisible(true);
    }
}
