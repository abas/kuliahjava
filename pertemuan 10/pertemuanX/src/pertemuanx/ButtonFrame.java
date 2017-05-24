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
 * @author E
 */
public class ButtonFrame extends JFrame{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
<<<<<<< HEAD

    private static final int BUTTON_WIDTH = 1000;
    private static final int BUTTON_HEIGHT = 30;

    //============
    public ButtonFrame(){
        Container contentPane = getContentPane();

=======
    
    private static final int BUTTON_WIDTH = 1000;
    private static final int BUTTON_HEIGHT = 30;
    
    //============
    public ButtonFrame(){
        Container contentPane = getContentPane();
        
>>>>>>> e7150b21bc055325071e720abbb7e44f4c07e3a5
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setResizable(false);
        setTitle("Program button pada frame");
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
<<<<<<< HEAD

        contentPane.setLayout(new FlowLayout());

        JButton okButton = new JButton("OK");
        okButton.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT));
        contentPane.add(okButton);

        JButton cancelButton = new JButton("CANCEL");
        cancelButton.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(cancelButton);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    //============

=======
        
        contentPane.setLayout(new FlowLayout());
        
        JButton okButton = new JButton("OK");
        okButton.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT));
        contentPane.add(okButton);
        
        JButton cancelButton = new JButton("CANCEL");
        cancelButton.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(cancelButton);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    //============
    
>>>>>>> e7150b21bc055325071e720abbb7e44f4c07e3a5
    public static void main(String[] args) {
        ButtonFrame frame = new ButtonFrame();
        frame.setVisible(true);
    }
}
