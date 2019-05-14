import java.util.Scanner;

public class TestScore {
	public static void main(String[] args) {
		/*
		 * Write a Java program that: 
		 * Asks the user to enter 3 test scores
		 * Calculates the average score
		 *  Output the average to the screen 
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter score for test 1 :");
		int input1=sc.nextInt();
		System.out.println("Enter score for test 2 :");
		int input2=sc.nextInt();
		System.out.println("Enter score for test 3 :");
		int input3=sc.nextInt();
		System.out.println("Total score is : "+input1+input2+input3);
		System.out.println("Commit on new branch");

	}

}
