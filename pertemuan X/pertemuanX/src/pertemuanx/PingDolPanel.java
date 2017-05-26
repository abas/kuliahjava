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
public class PingDolPanel extends JPanel implements MouseListener{
    private boolean circle;
    
    public PingDolPanel(){
        this(3);
    }
    
    public PingDolPanel(int size){
        PingDolPanel cell;
        
        setLayout(new GridLayout(size,size));
        
        for(int row=0;row<size;row++){
            for(int col=0;col<size;col++){
                cell = new PingDol();
                
                cell.addMouseListener(this);
                add(cell);
            }
        }
        
        circle = true;
    }
    
    public void mouseClicked(MouseEvent event){
        PingDol cell = (PingDol) event.getSource();
        if(circle){
            cell.setContent(PingDol.Image.CIRCLE);
        }else{
            cell.setContent(PingDol.Image.CROSS);
        }
        circle = !circle;
    }
    
    public void mouseEntered(MouseEvent event){}
    public void mouseExited(MouseEvent event){}
    public void mousePressed(MouseEvent event){}
    public void mouseReleased(MouseEvent event){}
    
    public static void main(String[] args) {
        System.err.println("tes");
    }
}
