import java.util.*;

public class ArithmeticsToDouble {
	public static void main (String [] args) {
		
		Scanner input= new Scanner(System.in);
		int digit;
		int digit2;
		int sum=0;
				
		System.out.println("Please enter an integer:");
		digit= input.nextInt();
		
		System.out.println("Please enter another integer:");
		digit2= input.nextInt();
		
		sum= digit+digit2;
		double average= (double)sum/2; // (double) - casts int to double!
		
		System.out.println(digit +" + " +digit2+ " = " +sum);
		System.out.println(digit +" - "+ digit2 +" = " +(digit-digit2));
		System.out.println("The average of " + digit +" and " +digit2 + " is " + average);
	}
}
