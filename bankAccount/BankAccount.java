package bankAccount;


public class BankAccount {
	
	private long accountNumber=123456789;
	private double accountBalance= 10000;
	private String phoneNumber = "9999999999";
	private String customerName = "Sravanthi";
	private String email = "sravanthi72@gmail.com";
	
	
	
	public double depositFunds(float DepAmount){
				
		this.accountBalance=this.accountBalance+DepAmount;
		return this.accountBalance;
		
		}
	public double withdrawFunds(float withdrawAmount)
	{
		if(withdrawAmount<this.accountBalance) 
		{
			this.accountBalance= this.accountBalance-withdrawAmount;
			return this.accountBalance;
			
		}
		else
		{
			System.out.println("OPERATION NOT POSSIBLE BECAUSE THE withdraw amount SPECIFIED IS MORE THan the balance");
			return this.accountBalance;
		}
		
	}
	public void printCustomerDetails()
	{
		System.out.println("accountNumber is"+ this.accountNumber);
		System.out.println("accountBalance is"+ this.accountBalance);
		System.out.println("phoneNumber is"+ this.phoneNumber);
		System.out.println("Name "+this.customerName);
		System.out.println("email "+this.email);
	}
}
