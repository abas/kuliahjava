import java.util.*;
class InputUmur2{
	private static final String DEFAULT_MESSAGE = "umurmu: ";
	private static final int DEFAULT_LOWER_BOUND = 0;
	private static final int DEFAULT_UPPER_BOUND = 99;

	private int lowerBound;
	private int upperBound;

	private Scanner scanner;
	public InputUmur2( ) {
		init(DEFAULT_LOWER_BOUND, DEFAULT_UPPER_BOUND);
	}
	
	public InputUmur2(int low,int high) throws IllegalArgumentException{
		if(low > high){
			throw new IllegalArgumentException(
				" (" + low + ") " +
				"lebih besar daripada (" + high + ")");
		}else{
			init(low,high);
		}
	}

	public int getAge() throws Exception{
		return getAge(DEFAULT_MESSAGE);
	}

	public int getAge(String prompt) throws Exception{
		int age;
		while(true){
			System.out.print(prompt);
			try{
				age = scanner.nextInt();
				if (age < lowerBound || age > upperBound) {
					throw new Exception("Input out of bound");
				}
				return age;
			} catch (InputMismatchException e){
				scanner.next();
				System.out.println("Input salah.\n"+
					"Input harus dalam bentuk bilangan");
			}
		}
	}

	private void init(int low,int high){
		lowerBound = low;
		upperBound = high;
		scanner = new Scanner(System.in);
	}

}
