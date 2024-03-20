package oops.abstraction;

public class BankUser {

	public static void main(String[] args) {
		
		
		RBI bank = new SBIbank();
		
		 BankUser bank1 = new BankUser ();
		 bank1.bankFeatures(bank);
		 
	
	}

	public void bankFeatures (RBI bank)
	{
		bank.savingAccount();
		bank.currentAccount();
		bank.creditCard();
		bank.debitCard();
	}
}
