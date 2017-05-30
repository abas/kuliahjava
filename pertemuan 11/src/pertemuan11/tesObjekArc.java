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
public class tesObjekArc extends JFrame{
    public static void main(String[] args) {
        JFrame frame = new JFrame("program object arc");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LinesRectsOvalsJPanel arcsJPanel = new LinesRectsOvalsJPanel();
        frame.add(arcsJPanel);
        frame.setSize(300,210);
        frame.setVisible(true);
    }
}
