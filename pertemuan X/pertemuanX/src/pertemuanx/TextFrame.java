/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanx;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author E
 */
public class TextFrame extends JFrame implements ActionListener{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 30;
    
    private JButton cancelButton;
    private JButton okButton;
    
    private JTextField inputLine;
    
    //=======
    public TextFrame(){
        Container contentPane;
        
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setResizable(false);
        setTitle("program TextFrame");
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
        
        contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        
        inputLine = new JTextField();
        inputLine.setColumns(22);
        contentPane.add(inputLine);
        
        inputLine.addActionListener(this);
        
        okButton = new JButton("OK");
        okButton.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(okButton);
        
        cancelButton = new JButton("CANCEL");
        cancelButton.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(cancelButton);
        
        cancelButton.addActionListener(this);
        okButton.addActionListener(this);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent event){
        if(event.getSource() instanceof JButton){
            JButton clickedButton = (JButton) event.getSource();
            String buttonText = clickedButton.getText();
            setTitle("Tombol "+buttonText+" telah di klik");
        }else{
            setTitle("kamu telah menginputkan kata "
                    +inputLine.getText()
                    +"---");
        }
    }
    //=======
    
    public static void main(String[] args) {
        TextFrame frame = new TextFrame();
        frame.setVisible(true);
    }    
}
