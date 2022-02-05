package calcDoseFormula;
import java.util.Scanner;
/*
 * This is meant to be a super simple java dose calculator displayed in terminal/command-line, 
 * it uses the universal dose formula to calculate a dose based on the user's inputed values. 
 * I do not recommend using this to actually calculate real world doses of course, 
 * this is more meant as a demonstration of the code
 */
public class main {
	public static void main(String[] args) {
		double[] doseInfo = new double[3]; //0 is desiredDose, 1 is onHandDose, 2 is volume
		double calculatedDose = 0;
		
		getUserInput(doseInfo);
		calculatedDose = calculateAmount(doseInfo);
		displayCalcDosageAmount(calculatedDose);
			
	}//End of main
	
	public static void getUserInput (double[] doseInfo) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("~~~~ Welcome! ~~~~");
		System.out.println("This program uses the universal dose forumla to calcualte doses!");
		System.out.println();
		System.out.print("Enter desired amount: ");
		doseInfo[0] = keyboard.nextDouble();//get desired amount from user
		
		System.out.print("Enter the amount on hand: ");
		doseInfo[1] = keyboard.nextDouble();//get amount on hand from user
		
		System.out.print("Enter the volume: ");
		doseInfo[2] = keyboard.nextDouble();//get volume from user
		
	}//End of getUserInput
		
	public static double calculateAmount(double doseInfo[]) {
		double calculatedDose;
		
		calculatedDose = (doseInfo[0] / doseInfo[1]) * doseInfo[2];
		
		return calculatedDose;
	}//End of calculateAmount
	
	public static void displayCalcDosageAmount(double caluclatedDosage) {
		System.out.println("________________________");
		System.out.println("Your calculated dosage amount is: " + caluclatedDosage);
		System.out.println("________________________");
		
	}//End of displayCalcDosageAmount function
	
}
