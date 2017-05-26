/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanx;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType;

/**
 *
 * @author SDK PEMKOT 2
 */
public class CheckBox2 extends JFrame implements ActionListener, ItemListener{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    
    private JCheckBox[] checkBox;
    
    public CheckBox2(){
        Container contentPane;
        JPanel checkPanel,okPanel;
        
        JButton okButton;
        String[] btnText = {"Java","C++","Phytn","Pascal"};
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Program CheckBox2");
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
        
        contentPane.add(checkPanel,BorderLayout.CENTER);
        contentPane.add(okPanel, BorderLayout.SOUTH);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionListener event){
        StringBuffer skill = new ("Dapat diProgram in \n");
        for(int i=0;i<checkBox.length;i++){
            if(checkBox[i].isSelected()){
                skill.append(checkBox[i].getText()+"\n");
            }
        }
        JOptionPane.showMessageDialog(this, skill.toString());
    }
    
    public void itemStateChange(ItemEvent event){
        JCheckBox source(JCheckBox) event.getSource();
        String state;
        
        if(event.getStateChange()==ItemEvent.SELECTED){
            state = "enable";
        }else{
            state = "disable";
        }
        JOptionPane.showMessageDialog(this, "JCheckBox "+source.getText()+"");
    }
    
    public static void main(String[] args) {
        CheckBox2 frame = new CheckBox2();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
