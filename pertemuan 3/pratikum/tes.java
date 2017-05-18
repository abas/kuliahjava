import java.util.Scanner;
public class tes{
	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	}  
	public static String LINE()
	{return "::::::::::::::::::::::::::::::::::::::::";}
	public static String STRIP()
	{return "----------------------------------------";}
	
	public static void main(String[] args){
		clearScreen();
		Scanner input = new Scanner(System.in);
		int num,denom,cek;

		System.out.print(LINE());

		System.out.print("\ninput nilai num   : ");
		num = input.nextInt();
		System.out.print("input nilai denom : ");
		denom = input.nextInt();
		
		System.out.println(STRIP());

		Fraction f1 = new Fraction(num,denom);
		int getNum = f1.getNumerator();
		int getDenom = f1.getDenominator();
		f1.simplify();

		System.out.print("Numerator ["+getNum+"]");
		System.out.println(" :: Denominator ["+getDenom+"]");
		System.out.println("gcd hasil -> "+f1.gcd(getNum,getDenom));
		System.out.println("hasil Fraction f1 -> "+f1);
		System.out.println(f1.cekNumDenom(f1));


		System.out.println(LINE());
		System.out.println(STRIP());
		System.out.println(LINE());
		Fraction f2 = new Fraction(f1);
		System.out.println("Clone hasil Fraction f1 to f2");
		getNum = f2.getNumerator();
		getDenom = f2.getDenominator();

		System.out.print("Numerator ["+getNum+"]");
		System.out.println(" :: Denominator ["+getDenom+"]");
		System.out.println("gcd hasil -> "+f1.gcd(getNum,getDenom));
		System.out.println("hasil Fraction f2 -> "+f2);
		
		System.out.println(STRIP());

		f2.setNumerator(getNum+5);
		f2.setDenominator(getDenom-5);
		getNum = f2.getNumerator();
		getDenom = f2.getDenominator();
		f2 = new Fraction(getNum,getDenom);
		f2.simplify();

		System.out.println("set:Numerator + 5 || set:Denominator-5");
		System.out.println("Numerator ["+getNum+"]"+" :: Denominator ["+getDenom+"]");
		System.out.println("gcd hasil -> "+f2.gcd(getNum,getDenom));
		System.out.println("hasil Fraction f2 *-> "+f2);
		
		System.out.println(LINE());
		System.out.println(STRIP());
		System.out.println(LINE());

		Fraction f3 = new Fraction();
		Fraction f4 = new Fraction();
		Fraction f5 = new Fraction();
		Fraction f6 = new Fraction();
		System.out.println("make new Fraction [f3,f4,f5,f6]\n");
		
		System.out.println("f3 add(f2).method : ");
		f3 = f3.add(f2);
		if(f3.getDenominator()==0){
			System.out.println("Denominator : 0, so I change that to:");
			System.out.println("Denominator = num + 2");
			f3.setDenominator(f3.getNumerator()+2);
		}else if(f3.getNumerator()==0){
			System.out.println("Numerator : 0, so I change that to:");
			System.out.println("Numerator = denom + 2");
			f3.setNumerator(2);
		}
		System.out.println("cek num denom : "+f3.cekNumDenom(f3));
		f3.simplify();
		System.out.println("gcd -> "+f3.gcd(f3.getNumerator(),f3.getDenominator()));
		System.out.println("hasil Fraction : "+f3+"\n");

		/*
		System.out.print("f4 divide(f2).method : \n");
		f4 = f4.divide(f2);
		if(f4.getNumerator() == 0){
			System.out.println("Numerator : 0, so I change that to:");
			System.out.println("Numerator = denom / 2");
			f4.setNumerator(f4.getDenominator()/2);
		}
		System.out.println("gcd -> "+f4.gcd(f4.getNumerator(),f4.getDenominator()));
		f4.simplify();
		System.out.println("hasil Fraction : "+f4+"\n");

		System.out.print("f5 multiply(f2).method : \n");
		f5 =f5.multiply(f2);
		if(f5.getNumerator() == 0){
			System.out.println("Numerator : 0, so I change that to:");
			System.out.println("Numerator = denom * 2");
			f5.setNumerator(f5.getDenominator()*2);
		}
		System.out.println("gcd -> "+f5.gcd(f5.getNumerator(),f5.getDenominator()));
		f5.simplify();
		System.out.println("hasil Fraction : "+f5+"\n");

		System.out.print("f6 subtract(f2).method : \n");
		f6 = f6.subtract(f2);
		if(f6.getNumerator() == 0){
			System.out.println("Numerator : 0, so I change that to:");
			System.out.println("Numerator = denom - 2");
			f6.setNumerator(f6.getDenominator()-2);
		}
		System.out.println("gcd -> "+f6.gcd(f6.getNumerator(),f6.getDenominator()));
		f6.simplify();
		System.out.println("hasil Fraction : "+f6+"\n");
		System.out.println(LINE());
		*/
	}
}