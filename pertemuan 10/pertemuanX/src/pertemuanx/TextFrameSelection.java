import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TextFrameSelection extends JFrame implements ActionListener {
  private static final int FRAME_WIDTH = 300;
  private static final int FRAME_HEIGHT = 300;
  private static final int FRAME_X_ORIGIN = 150;
  private static final int FRAME_Y_ORIGIN = 250;

  private static final int BUTTON_WIDTH = 80;
  private static final int BUTTON_HEIGHT = 30;

  private static final String EMPTY_STRING = "";
  private static final String NEWLINE = System.getProperty("line.separator");

  private JButton clearButton;
  private JButton addButton;
  private JTextField inputLine;
  private JTextArea textArea;

  //============
  public TextFrameSelection(){
    Container contentPane;

    setSize(FRAME_WIDTH,FRAME_HEIGHT);
    setResizable(false);
    setTitle("Program seleksi text");
    setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);

    contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());

    textArea = new JTextArea();
    textArea.setColumns(22);
    textArea.setRows(8);
    textArea.setBorder(BorderFactory.createLineBorder(Color.RED));

    textArea.setEditable(false);
    contentPane.add(textArea);

    inputLine = new JTextField();
    inputLine.setColumns(22);
    contentPane.add(inputLine);

    inputLine.addActionListener(this);

    addButton = new JButton("Tambah");
    addButton.setSize(BUTTON_WIDTH,BUTTON_HEIGHT);
    contentPane.add(addButton);

    clearButton = new JButton("Clear");
    clearButton.setSize(BUTTON_WIDTH,BUTTON_HEIGHT);
    contentPane.add(clearButton);

    clearButton.addActionListener(this);
    addButton.addActionListener(this);

    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  private void addText(String newline){
    textArea.append(newline = NEWLINE);
    inputLine.setText("asvcaj");
  }

  private void clearText(){
    textArea.setText(EMPTY_STRING);
    inputLine.setText(EMPTY_STRING);
  }

  public void actionPerformed(ActionEvent event){
    if(event.getSource() instanceof JButton){
      JButton clickedButton = (JButton) event.getSource();
      if(clickedButton == addButton){
        addText(inputLine.getText());
      }else if(clickedButton == clearButton){
        clearText();
      }else{
        addText(inputLine.getText());
      }
    }
  }
  //============

  public static void main(String[] args) {
    TextFrameSelection frame = new TextFrameSelection();
    frame.setVisible(true);
  }
}
