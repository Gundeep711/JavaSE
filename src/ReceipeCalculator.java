import java.util.Scanner;

public class ReceipeCalculator {

	public static void main(String[] args) {
		
		/*
		 * To make 48 Timbits, you need 1.5 cups of sugar 1 cup of butter 2.75
		 * cups of flour Write a Java program to calculate how much sugar,
		 * butter, and flour you need to create a batch of Timbits. Your program
		 * should: Ask the user to enter how many Timbits she wants to make
		 * Output the amount of sugar, butter, and flour that is needed
		 * 
		 */
		int timbits;
		double sugar,butter,flour;
		double sugarx=1.5/48;
		double butterx=1/48;
		double flourx=2.75/48;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of timbits you want :");
		timbits=sc.nextInt();
		sugar=sugar*sugarx;
		butter=butter*butterx;
		flour=flour*flourx;
		
		System.out.println("sugar needed for "+timbits+" is "+sugar );
		System.out.println("butter needed for "+timbits+" is "+butter );
		System.out.println("flour needed for "+timbits+" is "+flour );
		

	}

}
