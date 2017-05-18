import java.util.Scanner;
public class CariSubstring {
	public static void main(String[] args){
		subString string = new subString();
		String sub,text;
		int i, c, length;

		Scanner in = new Scanner(System.in);

		System.out.println("Masukkan sebuah string");
		text = in.nextLine();
		string.setsubString(text);

		length = text.length();

		System.out.println("Substring dari "+string.getString()+" adalah: ");


		// 	NO 4.a
		for(c=0;c<length;c++){
			for(i=1;i<=length-c;i++){
				sub = string.getSubString(text,c);
				System.out.print(sub);
			}
			System.out.print("\n");
		}


		// NO 4.b
		for(c=0;c<length;c++){
			System.out.printf("jumlah subString dari string ke %d\n",c+1);
			System.out.printf("adalah : %d\n\n",string.sumSubString(text,c));
		}
	}
}
