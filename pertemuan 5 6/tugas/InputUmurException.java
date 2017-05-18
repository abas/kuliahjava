class InputUmurException extends Exception {
  private static final String DEFAULT_MESSAGE = "input out bound";
  private int lowerBound;
  private int upperBound;
  private int value;

  public InputUmurException(int low,int high,int input){
    this(DEFAULT_MESSAGE,low,high,input);
  }

  public InputUmurException(String msg,int low,int high,int input){
    super(msg);
    if(low > high){
      System.out.println("| "+msg);
      System.out.println("| Invalid range Bound");
      throw new IllegalArgumentException();
    }
    lowerBound = low;
    upperBound = high;
    value = input;
    if (value < lowerBound || value > upperBound) {
      System.out.println("| "+msg);
      throw new IllegalArgumentException();
    }
  }

  public int lowerBound(){
    return lowerBound;
  }

  public int upperBound(){
    return upperBound;
  }

  public int value(){
    return value;
  }
}
