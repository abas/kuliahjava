public class sum{
	private int a;
	private int b;

	public sum(){
		this.a = 0;
		this.b = 0;
	}
	public sum(int a,int b){
		this.a = a;
		this.b = b;
	}
	public int getSum(){
		int x = this.a + this.b;
		return x;
	}
	public void setSum(int a,int b){
		this.a = a;
		this.b = b;
	}
	public String toString(){
		return "jumlah : "+getSum();
	}
}