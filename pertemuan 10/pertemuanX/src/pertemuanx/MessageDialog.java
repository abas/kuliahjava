/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanx;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author E
 */
public class MessageDialog {
    public static void main(String[] args){
        JFrame jFrame;
        
        jFrame = new JFrame();
        jFrame.setSize(400,300);
        jFrame.setVisible(false);
        
        JOptionPane.showMessageDialog(jFrame, "bro/sis gimana kabarmu?");
        JOptionPane.showMessageDialog(null,"udah dulu ya");
    }
}
