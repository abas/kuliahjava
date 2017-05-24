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
 * @author E
 */
class BackGroundBiru extends JFrame{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    
    public BackGroundBiru(){
        setTitle("BackGround Biru Pada Program Java GUI");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        changeBkColor();
    }
    
    private void changeBkColor(){
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.BLUE);
        
    }
    
    public static void main(String[] args) {
        BackGroundBiru frame = new BackGroundBiru();
        frame.setVisible(true);
    }
    
}
