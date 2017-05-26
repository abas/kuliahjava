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
 * @author SDK PEMKOT 2
 */
public class CheckBox1 extends JFrame implements ActionListener{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    
    private JCheckBox[] checkBox;
    
    public CheckBox1(){
        Container contentPane;
        JPanel checkPanel,okPanel;
        JButton okButton;
        String[] btnText = {"Java", "C++", "Phyton", "Pascal"};

        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setTitle("Program Check Box");
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
        
        contentPane = getContentPane();
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(new BorderLayout());
        
        checkPanel = new JPanel(new GridLayout(0,1));
        checkPanel.setBorder(BorderFactory.createTitledBorder("Program Masuk??"));
        checkBox = new JCheckBox[btnText.length];
        
        for(int i=0;i<checkBox.length;i++){
            checkBox[i] = new JCheckBox(btnText[i]);
            checkPanel.add(checkBox[i]);
        }
        
        okPanel = new JPanel(new FlowLayout());
        okButton = new JButton("OK");
        okButton.addActionListener(this);
        okPanel.add(okButton);
        
        contentPane.add(checkPanel, BorderLayout.CENTER);
        contentPane.add(okPanel, BorderLayout.SOUTH);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent event){
        StringBuffer skill = new ("Dapat Diprogram in \n");
        for(int i=0;i<checkBox.length;i++){
            if(checkBox[i].isSelected()){
                skill.append(checkBox[i].getText()+"\n");
            }
        }
        JOptionPane.showMessageDialog(this, skill.toString());
    }
    
    public static void main(String[] args) {
        CheckBox1 frame = new CheckBox1();
        frame.setVisible(true);
    }
}
