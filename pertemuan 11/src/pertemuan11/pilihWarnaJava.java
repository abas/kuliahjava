/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan11;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

import javax.swing.JPanel;
/**
 *
 * @author E
 */
public class pilihWarnaJava extends JFrame{
    private JButton changeColorJButton;
    private Color color = Color.LIGHT_GRAY;
    private JPanel colorPanel;
    
    public pilihWarnaJava(){
        super("penggunaa jcolor chooser");
        setSize(100,100);
        setLocation(250,200);
        JPanel colorJPanel = new JPanel();
        colorJPanel.setBackground(color);
        
        changeColorJButton = new JButton("ubah warna");
        changeColorJButton.addActionListener(
             new ActionListener(){
                 public void actionPerformed(ActionEvent event){
                     color = JColorChooser.showDialog(pilihWarnaJava.this,"pilih warna",color);
                     colorJPanel.setBackground(color);
                 }
             }
        );
        add(colorJPanel,BorderLayout.CENTER);
        add(changeColorJButton,BorderLayout.SOUTH);
    }
}
