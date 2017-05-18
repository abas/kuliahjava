public class pointer{
	private int x;
	private int y;

	public pointer(){
		this.x = 0;
		this.y = 0;
	}
	public pointer(int x,int y){
		this.x = x;
		this.y = y;
	}
	public void change(int x,int y){
		this.x = 10;
		x = this.x;

		this.y = 20;
		y = this.y;
	}
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
}