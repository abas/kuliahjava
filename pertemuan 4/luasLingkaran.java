import java.text.*;
class luasLingkaran{
	public static void main(String[] args){
		final double PI = 3.14159;
		final String TAB = "\t";
		final String NEWLINE = "\n";
		
		double jarijari,luas,keliling;
		
		DecimalFormat df = new DecimalFormat("0.000");
		
		jarijari = 2.35;
		
		luas = PI * jarijari * jarijari;
		keliling = 2.0 * PI * jarijari;
		
		System.out.println("untuk jari-jari dengan panjang" + TAB + df.format(jarijari) + " cm" + NEWLINE + "dihasilkan luas " + TAB + df.format(luas) + NEWLINE + "dan keliling " + TAB + df.format(keliling));
	}
}