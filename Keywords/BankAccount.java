class BankAccount{
	static String bankName = "CBI";
	static int acoounts;
	String accountHolderName;
	final long accountNumber;
	
	static void getTotalAcounts(){
		System.out.println(acoounts);
	}
	
	BankAccount(String accountHolderName, long accountNumber){
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		acoounts++;
	}
	void acountDetailsDisplay(){
		System.out.println(bankName);
		System.out.println(accountHolderName);
		System.out.println(accountNumber);
	}
	
	public static void main(String[] args){
		BankAccount account1 = new BankAccount("Sandeep", 766867865745746l);
	
		if(account1 instanceof BankAccount){
			account1.acountDetailsDisplay();
		}
		BankAccount.getTotalAcounts();
		
	}
	
	
}