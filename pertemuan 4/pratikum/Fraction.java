class Fraction{
	private int numerator;
	private int denominator;
	
	public Fraction(){
		this(0,1);
	}
	public Fraction(int number){
		this(number,1);
	}
	public Fraction(Fraction frac){
		this(frac.getNumerator(),frac.getDenominator());
	}
	public Fraction(int num,int denom){
		setNumerator(num);
		setDenominator(denom);
	}
	
	
	public int getDenominator(){
		return denominator;
	}
	public int getNumerator(){
		return numerator;
	}
	
	public void setDenominator(int denom){
		if(denom == 0){
			System.err.println("Fatal Error!");
			System.exit(1);
		}
		denominator = denom;
	}
	
	public void setNumerator(int num){
		numerator = num;
	}
	
	
	public void simplify(){
		int num = getNumerator();
		int denom = getDenominator();
		int gcd = gcd(num,denom);
		setNumerator(num/gcd);
		setDenominator(denom/gcd);
	}
	
	public int gcd(int m,int n){
		int r = n % m;
		while(r != 0){
			n = m;
			m = r;
			r = n % m;
		}
		return m;
	}
	
	public Fraction add(Fraction frac){
		int a,b,c,d;
		Fraction sum;
		a = this.getNumerator();
		b = this.getDenominator();
		c = frac.getNumerator();
		d = frac.getDenominator();
		
		sum = new Fraction(a*d + b+d, b*d);
		return sum;
	}
	
	public Fraction divide(Fraction frac) {
		int a, b, c, d;
		Fraction quotient;
		a = this.getNumerator();
		b = this.getDenominator();
		c = frac.getNumerator();
		d = frac.getDenominator();
		quotient = new Fraction(a*d, b*c);
		return quotient;
	}
	
	public Fraction multiply(Fraction frac){
		int a,b,c,d;
		Fraction product;
		a = this.getNumerator();
		b = this.getDenominator();
		c = frac.getNumerator();
		d = frac.getDenominator();
		product = new Fraction(a*c, b*d);
		return product;
	}
	
	public Fraction subtract(Fraction frac) {
		int a, b, c, d;
		Fraction diff;
		a = this.getNumerator();
		b = this.getDenominator();
		c = frac.getNumerator();
		d = frac.getDenominator();
		diff = new Fraction(a*d - b*c, b*d);
		return diff;
	}
	
	public String toString(){
		return getNumerator() + "/" + getDenominator();
	}
	
}