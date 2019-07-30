package bankAccount;


public class BankAccount {
	
	long accountNumber=123456789;
	double accountBalance= 10000;
	String phoneNumber = "9999999999";
	String customerName = "Sravanthi";
	String email = "sravanthi72@gmail.com";
	
	
	
	public double depositFunds(float DepAmount){
				
		this.accountBalance=this.accountBalance+DepAmount;
		return accountBalance;
		
		}
	public double withdrawFunds(float withdrawAmount)
	{
		if(withdrawAmount<this.accountBalance) 
		{
			this.accountBalance= this.accountBalance-withdrawAmount;
			return accountBalance;
			
		}
		else
		{
			System.out.println("operATION NOT POSSIBLE BCOZ THE withdraw amount IS LESS THan the balance");
			return accountBalance;
		}
		
	}
	public void printCustomerDetails()
	{
		System.out.println("accountNumber is"+ accountNumber);
		System.out.println("accountBalance is"+ accountBalance);
		System.out.println("phoneNumber is"+ phoneNumber);
		System.out.println("Name "+customerName);
		System.out.println("email "+email);
	}
}
