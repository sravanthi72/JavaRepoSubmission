package bankAccount;

import java.util.Scanner;


public class BankAccountEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any of the following choice 1.Show Balance and customer details "
		+ "2.DepositMoney 3.withdrawMoney 4.exit");
		Scanner sc= new Scanner(System.in);
		int i= sc.nextInt();
		System.out.println(i);
		BankAccount ba=new BankAccount();

		switch(i)
		{
		case 1:
			System.out.println("the balance in the customer details are");
			ba.printCustomerDetails();
			break;
		case 2:
			System.out.println("enter the money you want to deposit");
			float DepAmount=sc.nextFloat();
	
	//Scanner sc=nextInt();
			double totalBalanceAftrDeposit=ba.depositFunds(DepAmount);
			System.out.println("the total balance is "+totalBalanceAftrDeposit);
			break;
		case 3:
			System.out.println("enter the Amount you want to withdraw");
			float WithdrawAmount=sc.nextFloat();
			if ((WithdrawAmount)>500){
				System.out.println("you cannot withdraw more than 500");
			}
			else {
				double totalBalanceAfterWithdraw= ba.withdrawFunds(WithdrawAmount);
				System.out.println("the total balance  after withdrawing "+totalBalanceAfterWithdraw);
			}
			break;
		case 4:
			System.out.println("exiting out of the system");
			break;
		default:
		
		}
/*
		Give user options to Show Account Balance, Deposit Money, Withdraw Money and Exit out of program
		Add some System.out.println's in all methods above as well.
		deposit limit should be there */
	}

}
