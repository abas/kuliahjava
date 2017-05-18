class subString {
	private String string;
	
	public subString(){
	}
	
	public void setsubString(String text){
		this.string = text;
	} 
	
	public String getString(){
		return this.string;
	}
	
	public String getSubString(String text,int x){
		this.string = text.substring(x,x+1);
		return this.string;
	}
	
	public int sumSubString(String text,int i){
		int c;
		int length = text.length();
		int temp =0;
		for(c=1;c<=length-i;c++){
			temp = temp +1;
		}
		return temp;
	}
}