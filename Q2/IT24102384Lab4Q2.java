import java.util.Scanner;

public class IT24102384Lab4Q2 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter exam marks (out of 100): ");
		int Exammarks = scanner.nextInt();
		if (Exammarks >= 0 && Exammarks <= 100) {
		} else {
		System.out.print("Invalid input for exam marks. Terminating program");
		return;
		}

		System.out.print("Please enter lab submission marks (out of 100): ");
		int Labmarks = scanner.nextInt();
		if (Labmarks >= 0 && Labmarks <= 100) {
		} else {
		System.out.print("Invalid input for Lab marks. Terminating program");
		return;
		}

		System.out.print("Please enter the percentage given for the exam: ");
		int Exampercentage = scanner.nextInt();
		
		System.out.print("Please enter the percentage given for the lab: ");
		int Labpercentage = scanner.nextInt();
		
		if (Exampercentage + Labpercentage == 100) {
		double Finalmarks = (Exammarks  + Labmarks) / 2;
		System.out.println("Final Exam Marks is: " + Finalmarks);
		} else {
		System.out.print("The percentage must add up to 100. Terminating program");
		}
	scanner.close();
	}
}

		

		


		
