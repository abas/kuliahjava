import java.util.*;
class InputUmur{
	private static final String DEFAULT_MESSAGE = "umurmu: ";
	
	private Scanner scanner;

	public InputUmur(){
		scanner = new Scanner(System.in);
	}

	public int getUmur(){
		return getUmur(DEFAULT_MESSAGE);
	}

	public int getUmur(String prompt){
		System.out.print(prompt);
		int umur = scanner.nextInt();
		return umur;
	}
}