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
public class NestedPanel1 extends JFrame{
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 350;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    
    public NestedPanel1(){
        Container contentPane;
        JPanel gamePanel;
        JPanel ControlPanel;
        JPanel scorePanel;
        
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setTitle("Contoh Program Panel Bersarang");
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
        
        contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        
        gamePanel = new JPanel();
        gamePanel.setBorder(BorderFactory.createLoweredBevelBorder());
        ControlPanel = new JPanel();
        ControlPanel.setLayout(new BorderLayout());
        
        contentPane.add(gamePanel,BorderLayout.CENTER);
        contentPane.add(ControlPanel,BorderLayout.EAST);
        
        scorePanel = new JPanel();
        scorePanel.setBorder(BorderFactory.createTitledBorder("Skor: "));
        
        scorePanel.setLayout(new GridLayout(2,2));
        scorePanel.add(new JLabel("Player 1: "));
        scorePanel.add(new JLabel("       0"));
        scorePanel.add(new JLabel("Player 2: "));
        scorePanel.add(new JLabel("       0"));
        
        ControlPanel.add(scorePanel, BorderLayout.NORTH);
        ControlPanel.add(new JButton("New Game"), BorderLayout.SOUTH);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        NestedPanel1 frame = new NestedPanel1();
        frame.setVisible(true);
    }

    private static class PingDolPanel {

        public PingDolPanel() {
        }
    }
}
