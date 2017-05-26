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
public class PingDol extends JPanel{
    public static enum Image{BLANK, CIRCLE, CROSS};
    private static final String CROSS_IMAGE_FILE = "ping.gif";
    private static final String CIRCLE_IMAGE_FILE = "dil.gif";
    private static final String BLANK_IMAGE_FILE = "blank.gif";
    
    private JLabel content;
    private Point location;
    
    public PingDol(){
        this(null);
    }
    
    public PingDol(Point pt){
        ImageIcon initImage = new ImageIcon("blank.gif");
        
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        content = new JLabel(initImage);
        add(content);
        
        location = pt;
    }
    
    public Point getPosition(){
        return location;
    }
    
    public void setContent(Image image){
        switch(image){
            case CIRCLE: content.setIcon(new ImageIcon(CIRCLE_IMAGE_FILE));
            break;
            case CROSS: content.setIcon(new ImageIcon(CROSS_IMAGE_FILE));
            default: break;
        }
    }
    
    public static void main(String[] args) {
        System.err.println("tes");
    }
}
