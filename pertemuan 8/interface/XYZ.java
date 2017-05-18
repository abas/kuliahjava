class XYZ implements Myinterface{
  public void method1(){
    System.out.println("jalankan method1");
  }
  public void method2(){
    System.out.println("jalankan method2");
  }
  public static void main(String[] args) {
    Myinterface obj = new XYZ();
    obj.method1();
  }
}
