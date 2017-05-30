/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan11;
import javax.swing.JFrame;
/**
 *
 * @author xavier
 */
public class tesFntMetrics extends JFrame{
    public static void main(String[] args) {
        JFrame frame = new JFrame("penggunaan fontMatrix");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        fntMetrics fontMatrix = new fntMetrics();
        frame.add(fontMatrix);
        frame.setSize(510,250);
        frame.setVisible(true);
    }
}
