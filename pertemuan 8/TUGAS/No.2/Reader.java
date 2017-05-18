import java.io.*;
import javax.swing.*;
import java.util.Scanner;

class Reader{
  public static void main(String[] args) {
    JFileChooser chooser;
    File file, directory;
    int status;
    chooser = new JFileChooser();
    status = chooser.showOpenDialog(null);

    if (status == JFileChooser.APPROVE_OPTION){
      file = chooser.getSelectedFile();
      directory = chooser.getCurrentDirectory();
      System.out.println("Directory: " + directory.getName());
      System.out.println("File selected to open: " + file.getName());
      System.out.println("Full path name: " + file.getAbsolutePath());
    }
    else {
      System.out.println("Open File dialog canceled");
    }

    try {
        Scanner input = new Scanner(System.in);
        file = chooser.getSelectedFile();
        input = new Scanner(file);
        while (input.hasNextLine()) {
            String line = input.nextLine();
            System.out.println(line);
        }
        input.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
  }
}
