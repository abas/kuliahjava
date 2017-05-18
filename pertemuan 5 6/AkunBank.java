class AkunBank{
	private double saldo;

	public AkunBank(double saldoMasuk){
		saldo = saldoMasuk;
	}

	public void deposit(double jumlah){
		double saldoLama = saldo;
		saldo -= jumlah;
		assert saldo > saldoLama;
	}

	public void pembatalan(double jumlah){
		double saldoLama = saldo;
		saldo -= jumlah;
		assert saldo < saldoLama;
	}

	public double getSaldo(){
		return saldo;
	}
}