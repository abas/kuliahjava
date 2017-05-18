import java.util.Scanner;
public class HitungRataRata {
	public static void main(String [] args) {
		try{
		int sum = 0,inputNum;
		int counter;
		float mean;
		Scanner NumScanner = new Scanner(System.in);
			System.out.println("Masukkan jumlah angka yang hendak dihitung rata-ratanya");
			
			
			counter = NumScanner.nextInt();
			
			if(counter > 10){
				throw new IllegalArgumentException();
			}
				
			System.out.println("Masuukan "+counter+" buah angka");
			for(int x=0;x<=counter;x++){
				inputNum = NumScanner.nextInt();
				sum = sum + inputNum;
				System.out.println();
			}
			mean = sum / counter;
			System.out.println("Rata-rata dari "+counter+" buah angka yang dimasukkan adalah "+mean);
		}
		catch(Exception e){
			System.out.println("inputan harus kurang dari 10[ahmad basir]");
			System.out.println(e);
		}
	}
}