package javaPractice;
import java.util.Scanner;

public class SwitchPractice {
	
	public static void main(String[] args)
	
	{
		System.out.println("Enter the character to see abbrevations");
		Scanner sc= new Scanner(System.in); 
				
				char a= sc.next().charAt(0);
				switch(a)
				
				{
				case 'A':
					System.out.println(" Apple");
					break;
				case 'B':
					System.out.println(" Banana");
					break;
				case 'C':
					System.out.println(" Cherries");
					break;
				case 'D':
					System.out.println(" Dragon Fruit");
					break;
				case 'E':
					System.out.println(" ElderBerry");
					break;
				default:
					System.out.println("Not in fruit basket ");
					break;
					
				
				}
		
		
	}

}

/*Create a char variable for switch statement
Create Switch statement which accepts character A,B,C,D,E
If Char variable is A then print
 “Apple”, B = Banana, C = Cherries, D=Dragon Fruit, E=ElderBerry and
  print “Not in fruit basket” if other than those letters*/