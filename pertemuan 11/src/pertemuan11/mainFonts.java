/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan11;
import javax.swing.JFrame;
/**
 *
 * @author E
 */
public class mainFonts extends JFrame{
    public static void main(String[] args) {
        JFrame frame = new JFrame("penggunaa Font");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        kostumFont fontJPanel = new kostumFont();
        frame.add(fontJPanel);
        frame.setSize(420,170);
        frame.setLocation(350,250);
        frame.setVisible(true);
    }
}
