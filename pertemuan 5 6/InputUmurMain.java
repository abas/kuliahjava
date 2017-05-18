import java.util.*;
class InputUmurMain{
	public static void main(String[] args){
			GregorianCalendar today;
			int age, thisYear, bornYr;
			String answer;

			try{
			Scanner scanner = new Scanner(System.in);
			InputUmur2 input = new InputUmur2();


			age = input.getAge("sudah berapakah umurmu?");
			today = new GregorianCalendar();
			thisYear = today.get(Calendar.YEAR);

			bornYr = thisYear - age;

			System.out.print("Apakah kamu sudah ultah tahun ini? [Y/T]");
			answer = scanner.next();
			if(answer.equals("T") || answer.equals("t")){
				bornYr--;
			}
			System.out.println("\nkamu lahir tahun "+bornYr);

		}catch(Exception e){
			System.out.println(e);
		}
	}
}
