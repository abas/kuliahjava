import java.util.*;
class InputUmurExcMain {
  public static void line(){
    System.out.println("|-------------------------|");
  }
  public static void lineMain(){
    System.out.println("|-----------MAIN----------|");
  }

  public static void main(String[] args) {
    try {
      int value,low, high;

      Scanner scanner = new Scanner(System.in);

      lineMain();

      System.out.print("| lowerBound: ");
      low = scanner.nextInt();

      System.out.print("| upperBound: ");
      high = scanner.nextInt();

      line();
      System.out.print("| input value between\n| range of Bound: ");
      value = scanner.nextInt();
      line();

      InputUmurException input = new InputUmurException(low,high,value);
      input = new InputUmurException("Cek!",low,high,value);

      System.out.println("| input valid!");
      line();
    }catch (Exception e) {
      line();
      System.out.println(e);
      line();
    }
  }
}
