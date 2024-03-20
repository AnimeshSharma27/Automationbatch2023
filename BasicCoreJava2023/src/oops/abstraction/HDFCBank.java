package oops.abstraction;

public class HDFCBank implements RBI, StateLaws {

	public void savingAccount() {
		
		System.out.println("HDFC Saving Account");
	}

	public void currentAccount() {
		
		System.out.println("HDFC Current Account");
	}

	
	public void creditCard() {
		
		System.out.println("HDFC Credit Card");
	}

	
	public void debitCard() {
		
		System.out.println("HDFC Debit Card");
	}

}
