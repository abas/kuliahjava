/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanx;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
import javafx.scene.chart.XYChart;
/**
 *
 * @author xavier
 */
public class javaSlider extends JFrame implements ChangeListener{
    private static final int FRAME_WIDTH = 450;
    private static final int FRAME_HEIGHT = 250;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private static final int MIN_COLOR = 0;
    private static final int MAX_COLOR = 255;
    
    private JSlider redSlider;
    private JSlider greenSlider;
    private JSlider blueSlider;
    
    private JPanel colorPanel;
    
    public javaSlider(){
        Container contentPane;
        JPanel sliderPanel;
        
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setTitle("Program contoh list");
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
        
        contentPane = getContentPane();
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(new BorderLayout());
        
        sliderPanel = new JPanel(new FlowLayout());
        sliderPanel.setBorder(BorderFactory.createTitledBorder("RGB color selection"));
        
        redSlider = createSlider(MAX_COLOR);
        greenSlider = createSlider(MAX_COLOR);
        blueSlider = createSlider(MAX_COLOR);
        
        sliderPanel.add(redSlider);
        sliderPanel.add(greenSlider);
        sliderPanel.add(blueSlider);
        
        colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);
        colorPanel.setBorder(BorderFactory.createLoweredBevelBorder());
        
        contentPane.add(colorPanel, BorderLayout.CENTER);
        contentPane.add(sliderPanel, BorderLayout.SOUTH);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void stateChanged(ChangeEvent event){
        int R,G,B;
        R = redSlider.getValue();
        G = greenSlider.getValue();
        B = blueSlider.getValue();
        colorPanel.setBackground(new Color(R,G,B));
    }
    
    private JSlider createSlider(int value){
        JSlider slider = new JSlider();
        slider.setOrientation(JSlider.VERTICAL);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setMinimum(MIN_COLOR);
        slider.setMaximum(MAX_COLOR);
        slider.setValue(value);
        slider.setMajorTickSpacing(50);
        slider.setMajorTickSpacing(25);
        slider.addChangeListener(this);
        return slider;
    }
    
    public static void main(String[] args) {
        javaSlider frame = new javaSlider();
        frame.setVisible(true);
    }
}
