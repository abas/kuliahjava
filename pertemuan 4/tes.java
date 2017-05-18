public class tes{
	public static void main(String[] args){
		int one = 30;
		
		Question q = new Question();
		q.myMethod(one);
		System.out.println(one);
		
		Tester tester;
		int x,y;
		x = 10;
		y = 20;
		tester = new Tester();
		tester.myMethod(x,y);
		System.out.println(x + " " + y);
	}
}