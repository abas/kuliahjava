import java.util.*;
class AkunBankMain{
	public static void main(String[] args){
		AkunBank acct = new AkunBank(200);
		acct.deposit(25);
		System.out.println("Saldo saat ini adalah "+acct.getSaldo());
	}
}