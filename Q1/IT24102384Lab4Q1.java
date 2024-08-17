import java.util.Scanner;

public class IT24102384Lab4Q1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int Number = scanner.nextInt();

		if (Number > 0) {
		System.out.print("The number is: Positive");
		
		} else if (Number < 0) {
		System.out.print("The number is: Negative");
		
		} else { 
		System.out.print("The number is: zero");

		}
	scanner.close();
	}
}

