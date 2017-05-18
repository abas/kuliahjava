import java.io.*;
class Ch12TestBufferedReader {
  public static void main(String[] args) throws IOException {
    File inFile = new File("sample3.data");
    FileReader fileReader = new FileReader(inFile);
    BufferedReader bufReader = new BufferedReader(fileReader);
    String str;

    str = bufReader.readLine();
    int i = Integer.parseInt(str);

    str = bufReader.readLine();
    long l = Long.parseLong(str);

    str = bufReader.readLine();
    float f = Float.parseFloat(str);

    str = bufReader.readLine();
    double d = Double.parseDouble(str);

    str = bufReader.readLine();
    char c = str.charAt(0);

    str = bufReader.readLine();
    Boolean boolObj = new Boolean(str);
    boolean b = boolObj.booleanValue();

    System.out.println(i);
    System.out.println(l);
    System.out.println(f);
    System.out.println(d);
    System.out.println(c);
    System.out.println(b);

    bufReader.close();
  }
}
