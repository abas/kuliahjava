import java.io.*;
class Ch12TestFileOutputStream{
  public static void main(String[] args) throws IOException {
    File outFile = new File("Sample.data");
    FileOutputStream outStream = new FileOutputStream(outFile);

    byte[] byteArray = {10,20,30,40,50,60,70,80};
    outStream.write(byteArray);
    outStream.close();
  }
}
