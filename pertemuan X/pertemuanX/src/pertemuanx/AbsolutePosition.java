/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanx;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author SDK PEMKOT 2
 */
public class AbsolutePosition extends JFrame{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 30;
    
    private final JButton cancelButton;
    private final JButton okButton;
    
    public AbsolutePosition(){
        Container ContentPane;
        JButton btn1,btn2,btn3,btn4,btn5;
        
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setTitle("Contoh Program Flow Layout");
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
        
        ContentPane = getContentPane();
        ContentPane.setLayout(null);
        ContentPane.setBackground(Color.WHITE);
        
        okButton = new JButton("OK");
        okButton.setBounds(70,25,BUTTON_WIDTH,BUTTON_HEIGHT);
        ContentPane.add(okButton);
        
        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(160,25,BUTTON_WIDTH,BUTTON_HEIGHT);
        ContentPane.add(cancelButton);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        AbsolutePosition frame = new AbsolutePosition();
        frame.setVisible(true);
    }
}
