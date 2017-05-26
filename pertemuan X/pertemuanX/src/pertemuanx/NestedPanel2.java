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
public class NestedPanel2 extends JFrame{
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 350;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    
    private final String ENTER = "Enter";
    private final String CANCEL = "Cancel";
    private final String BLANK = "";
    
    public NestedPanel2(){
        JPanel guessPanel, hintPanel, controlPanel, buttonPanel;
        JButton enterBtn,cancelBtn;
        JLabel hint;
        JTextField guessEntry;
        Container contentPane;
        
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setTitle("Program Panel Bersarang 2");
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
        
        contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(3,1));
        
        guessPanel = new JPanel();
        guessPanel.setBorder(BorderFactory.createTitledBorder("YourGuess"));
        guessPanel.add(guessEntry = new JTextField(10));
        
        hintPanel = new JPanel();
        guessPanel.setBorder(BorderFactory.createTitledBorder("Your Guess"));
        guessPanel.add(hint = new JLabel("permainan"));
        
        controlPanel = new JPanel(new BorderLayout());
        buttonPanel = new JPanel();
        buttonPanel.add(enterBtn = new JButton(ENTER));
        buttonPanel.add(cancelBtn = new JButton(CANCEL));
        controlPanel.add(buttonPanel, BorderLayout.SOUTH);
        
        contentPane.add(guessPanel);
        contentPane.add(hintPanel);
        contentPane.add(controlPanel);
        
    }
    
    public static void main(String[] args) {
        NestedPanel2 frame = new NestedPanel2();
        frame.setVisible(true);
    }
}
