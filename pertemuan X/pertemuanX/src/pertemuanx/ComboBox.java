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
public class ComboBox extends JFrame implements ActionListener,ItemListener{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    
    private JComboBox comboBox;
    
    public ComboBox(){
        Container contentPane;
        JPanel comboPanel,okPanel;
        JButton okButton;
        
        String[] comboBoxItem = {"java","c++","python","pascal"};
        
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setTitle("program combo box");
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
        
        contentPane = getContentPane();
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(new BorderLayout());
        
        comboPanel = new JPanel(new FlowLayout());
        comboPanel.setBorder(BorderFactory.createTitledBorder("pick your favorite"));
        comboBox = new JComboBox(comboBoxItem);
        comboBox.addItemListener(this);
        comboPanel.add(comboBox);
        
        okPanel = new JPanel(new FlowLayout());
        okButton = new JButton("OK");
        okPanel.add(okButton);
        contentPane.add(comboPanel,BorderLayout.CENTER);
        contentPane.add(okPanel,BorderLayout.SOUTH);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent event){
        String favorite;
        int loc;
        favorite = (String) comboBox.getSelectedItem();
        loc = comboBox.getSelectedIndex();
        JOptionPane.showMessageDialog(this, "Currently selected item '"
                +favorite+"' is at index position "+loc);
    }
    
    public void itemStateChanged(ItemEvent event){
        String state;
        if(event.getStateChange() == ItemEvent.SELECTED){
            state = "dipilih";
        }else{
            state = "tidak dipilih";
        }
        JOptionPane.showMessageDialog(this, "JComboBox Item '"
                +event.getItem()+"' "+state);
    }
    
    public static void main(String[] args) {
        ComboBox frame = new ComboBox();
        frame.setVisible(true);
    }

}
