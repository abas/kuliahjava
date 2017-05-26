/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanx;

/**
 *
 * @author SDK PEMKOT 2
 */
import javax.swing.*;
import java.awt.*;

public class borderLayout extends JFrame{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    
    public borderLayout(){
        Container contentPane;
        JButton btn1,btn2,btn3,btn4,btn5;
        
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setTitle("Program Contoh Border Layout");
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
        
        contentPane = getContentPane();
        contentPane.setBackground(Color.BLUE);
        contentPane.setLayout(new BorderLayout());
        
        btn1 = new JButton("button 1");
        btn2 = new JButton("button 2");
        btn3 = new JButton("button 3");
        btn4 = new JButton("button 4");
        btn5 = new JButton("button 5");
        
        contentPane.add(btn1, BorderLayout.NORTH);
        contentPane.add(btn2, BorderLayout.SOUTH);
        contentPane.add(btn3, BorderLayout.EAST);
        contentPane.add(btn4, BorderLayout.WEST);
        contentPane.add(btn5, BorderLayout.CENTER);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        borderLayout frame = new borderLayout();
        frame.setVisible(true);
    }
}
