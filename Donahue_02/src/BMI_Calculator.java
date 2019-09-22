import java.util.Scanner;

public class BMI_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		double userWeightLbs, userHeightInches;
		double userWeightKgs, userHeightMeters;
		double userAnswer, userBMI;
		
		System.out.println("Press 1 to use: BMI = 703 * weightInPounds / heightInInches^2");
		System.out.println("Press 2 to use: BMI = weightinKilograms / heightInMeters^2");
		userAnswer = scnr.nextInt();
		
		if(userAnswer == 1) {
			System.out.println("You entered 1.");
			System.out.println("Please enter your weight in pounds: ");
			userWeightLbs = scnr.nextDouble();
			System.out.println("Please enter your height in inches: ");
			userHeightInches = scnr.nextDouble();
			userBMI = (703 * userWeightLbs) / Math.pow(userHeightInches, 2);
			System.out.printf("Your BMI is: %.1f", userBMI);
			
			System.out.println("BMI Categories: ");
			System.out.println("Underweight:   < 18.5");
			System.out.println("Normal Weight: 18.5 - 24.9");
			System.out.println("Overweight:    25 - 29.9");
			System.out.println("Obese:         30 +");
		}
		else if(userAnswer == 2) {
			System.out.println("You entered 2.");
			System.out.println("Please enter your weight in kilograms: ");
			userWeightKgs = scnr.nextDouble();
			System.out.println("Please enter your height in meters: ");
			userHeightMeters = scnr.nextDouble();
			userBMI = userWeightKgs / Math.pow(userHeightMeters, 2);
			System.out.printf("Your BMI is: %.1f", userBMI);
			
			System.out.println("BMI Categories: ");
			System.out.println("Underweight:   < 18.5");
			System.out.println("Normal Weight: 18.5 - 24.9");
			System.out.println("Overweight:    25 - 29.9");
			System.out.println("Obese:         30 +");
		}
		else {
			System.out.println("Sorry, that was not a valid entry.");
		}
	}

}