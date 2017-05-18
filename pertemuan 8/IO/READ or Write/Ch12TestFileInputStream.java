import java.io.*;
class Ch12TestFileInputStream{
  public static void main(String[] args) throws IOException{
    File inFile = new File("Sample.data");
    FileInputStream inStream = new FileInputStream(inFile);

    int filesize = (int) inFile.length();
    byte[] byteArray = new byte[filesize];

    inStream.read(byteArray);
    for(int i=0;i<filesize;i++){
      System.out.println(byteArray[i]);
    }

    inStream.close();
  }
}
