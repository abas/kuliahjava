/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanx;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.PrintStream;
/**
 *
 * @author xavier
 */
public class SketchPad extends JFrame implements MouseListener,MouseMotionListener{
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HIGHT = 300;
    private static final int FRAME_X_ORIGIN = 150; 
    private static final int FRAME_Y_ORIGIN = 250;
    
    private static final int DOUBLE_CLICK = 2;
    private PrintStream output;
    
    private int last_x;
    private int last_y;
    
    public SketchPad(){
        setTitle("Chapter 14 SketchPad");
        setSize(FRAME_WIDTH,FRAME_HIGHT);
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        last_x=last_y=0;
        
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    
    public void mousePressed(MouseEvent event){
        int x = event.getX();
        int y = event.getY();
        if(event.isMetaDown()){
            Graphics g = getGraphics();
            Rectangle r = getBounds();
            g.clearRect(0, 0, r.width, r.height);
            g.dispose();
        }else{
            last_x = x;
            last_y = y;
        }
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
    public void mouseReleased(MouseEvent event){}
    
    public void mouseDragged(MouseEvent event){
        int x = event.getX();
        int y = event.getY();
        if(!event.isMetaDown()){
            Graphics g = getGraphics();
            g.drawLine(last_x, last_y,x,y);
            g.dispose();
            last_x = x;
            last_y = y;
        }
    }
    
    public void mouseMoved(MouseEvent event){}
    public static void main(String[] args) {
        SketchPad frame = new SketchPad();
        frame.setVisible(true);
    }
}
