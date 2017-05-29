/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanx;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
/**
 *
 * @author xavier
 */
public class TrackMouse extends JFrame implements MouseListener{
    private static final int FRAME_WIDTH = 450;
    private static final int FRAME_HEIGHT = 300;
    private static final int FRAME_X_ORIGIN = 200;
    private static final int FRAME_Y_ORIGIN = 250;
    private static final int DOUBLE_CLICK = 2;
    private PrintStream output;
    
    public TrackMouse(){
        setTitle("Track MOuse Frame");
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        output =System.out;
        addMouseListener(this);
    }
    
    public void mouseClicked(MouseEvent event){
        if(event.getClickCount() == DOUBLE_CLICK){
            System.exit(0);
        }else{
            int x,y;
            x = event,getX();
            y = event.getY();
            output.println("["+x+","+y+"]");
        }
    }
    
    public void mouseEntered(MouseEvent event){}
    public void mouseExited(MouseEvent event){}
    public void mousePressed(MouseEvent event){
        output.println("Down");
    }
    public void mouseReleased(MouseEvent event){
        output.println("Up");
    }
    
    public static void main(String[] args) {
        TrackMouse frame = new TrackMouse();
        frame.setVisible(true);
    }
}
