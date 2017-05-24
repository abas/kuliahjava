import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class flowLayout extends JFrame{
  private static final int FRAME_WIDTH = 300;
  private static final int FRAME_HEIGHT = 300;
  private static final int FRAME_X_ORIGIN = 150;
  private static final int FRAME_Y_ORIGIN = 250;

  //==========
  public flowLayout(){
    Container contentPane;
    JButton btn1,btn2,btn3,btn4,btn5;

    setSize(FRAME_WIDTH,FRAME_HEIGHT);
    setTitle("program contoh FlowLayout");
    setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);

    contentPane = getContentPane();
    contentPane.setBackground(Color.WHITE);
    contentPane.setLayout(new FlowLayout());

    btn1 = new JButton("button 1");
    btn2 = new JButton("button 2");
    btn3 = new JButton("button 3");
    btn4 = new JButton("button 4");
    btn5 = new JButton("button 5");

    contentPane.add(btn1);
    contentPane.add(btn2);
    contentPane.add(btn3);
    contentPane.add(btn4);
    contentPane.add(btn5);

    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
  //==========
  public static void main(String[] args) {
    flowLayout frame = new flowLayout();
    frame.setVisible(true);
  }
}
