import java.io.*;
class Ch12TestPrintWriter {
  public static void main(String[] args) throws IOException {
    File outFile = new File("sample3.data");
    FileOutputStream outFileStream = new FileOutputStream(outFile);
    PrintWriter outStream = new PrintWriter(outFileStream);

    outStream.println(987654321);
    outStream.println(11111111L);
    outStream.println(22222222F);
    outStream.println(33333333D);
    outStream.println('A');
    outStream.println(true);

    outStream.close();
  }
}
