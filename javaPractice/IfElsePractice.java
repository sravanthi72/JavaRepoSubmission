package javaPractice;

public class IfElsePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int 	 a=20;
		int b=80;
		int c= (a+b)*25;
		System.out.println("After Adding both numbers up and multiply by 25 "+c);
	
		int remainder= c  % 40;
		System.out.println("Remainder after divided by 40 is  "+remainder);
		
		if(remainder <= 20)
		{
			System.out.println("Total was over the limit");
		}
	

	}

}

/*Create a double variable with the value 20
Create a second variable of type double with the value 80
Add both numbers up and multiply by 25
Print the total of #3
Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
Write an "if" statement that displays a message "Total was over the limit” if the remaining total (#4) is equal to 20 or less.*/