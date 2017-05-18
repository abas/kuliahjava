public class luasPersegi{
	private int x;
	private int y;
	private int luas;

	public luasPersegi(){
		this.x = 2;
		this.y = 2;
		this.luas = this.x*this.y;
	}

	public luasPersegi(int a,int b){
		this.x = a;
		this.y = b;
		this.luas = this.x*this.y;
	}
	public void setLuas(int a,int b){
		this.x = a;
		this.y = b;
		this.luas = this.x*this.y;
	}
	public int getLuas(){
		return this.luas;
	}
	public int getx(){
		return this.x;
	}
	public int gety(){
		return this.y;
	}

	public String toString(){
		return "Luas Persegi :"+this.x+"x"+this.y+":"+getLuas();
	}
}