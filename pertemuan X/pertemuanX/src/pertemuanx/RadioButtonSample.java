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
public class RadioButtonSample extends JFrame implements ActionListener, ItemListener{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    
    private JRadioButton[] radioButton;
    
    public RadioButtonSample(){
        Container contentPane;
        JPanel radioPanel,okPanel;
        ButtonGroup languageGroup;
        
        JButton okButton;;
        String[] btnText = {"java","c++","python","pascal"};
        
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setTitle("program radio button");
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
        
        contentPane = getContentPane();
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(new BorderLayout());
        
        radioPanel = new JPanel(new GridLayout(0,1));
        radioPanel.setBorder(BorderFactory.createTitledBorder("pilih bahasa pemrograman:"));
        
        languageGroup = new ButtonGroup();
        radioButton = new JRadioButton[btnText.length];
        
        for(int i=0;i<radioButton.length;i++){
            radioButton[i] = new JRadioButton(btnText[i]);
            radioButton[i].addItemListener(this);
            languageGroup.add(radioButton[i]);
            radioPanel.add(radioButton[i]);
        }
        
        radioButton[0].setSelected(true);
        
        okPanel = new JPanel(new FlowLayout());
        okButton = new JButton("OK");
        okButton.addActionListener(this);
        okPanel.add(okButton);
        
        contentPane.add(radioPanel,BorderLayout.CENTER);
        contentPane.add(okPanel,BorderLayout.SOUTH);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent event){
        String favorite = null;
        
        int i=0;while (favorite == null) {
            if(radioButton[i].isSelected()){
                favorite = radioButton[i].getText();
            }
            i++;
        }
        JOptionPane.showMessageDialog(this, "bahasa pemrograman pilihan kmu adalah: "+favorite);
    }
    
    public void itemStateChanged(ItemEvent event){
        JRadioButton source = (JRadioButton) event.getSource();
        String state;
        if(event.getStateChange() == ItemEvent.SELECTED){
            state = " dipilih";
        }else{
            state = "dikeluarkan dari pilihan";
        }
        JOptionPane.showMessageDialog(this, "JRadioButton" + source.getText()+""+state);
    }
    
    public static void main(String[] args) {
        RadioButtonSample frame = new RadioButtonSample();
        frame.setVisible(true);
    }
}
