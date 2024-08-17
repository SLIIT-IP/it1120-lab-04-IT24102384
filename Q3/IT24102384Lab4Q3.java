import java.util.Scanner;

public class IT24102384Lab4Q3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
			System.out.print("Enter a number: ");
			int Number = scanner.nextInt();

			String output = (Number > 0) ? "Positive" :
                        (Number < 0) ? "Negative" :
                        "Zero";
		
			System.out.println("The number is " + output);

		scanner.close();
    }
}