package session04;

/*
    * Study/Coding Session 1.4 (Module 01) - Arrays and Loops
    * Pratical problem: Create a program that simulates a hiring process: read the grades of 10 candidates, calculate the overall average, count how many passed, and display the name of the candidate with the highest grade. (Use simple arrays for now.)
    * 
    * Applied concepts:
    * - Arrays;
    * - Classic for loop;
    * - while loop;
    * - do-while loop;
    * - for-each loop;
    * - break and continue.
*/

import java.util.Scanner;

public class SelectionProcess {
	static final int TOTAL_RANGE = 10; // Defines the total of candidates and grades to analyse.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] names = new String[TOTAL_RANGE]; // Declares a String array for "names".
		double[] grades = new double[TOTAL_RANGE]; // Declares a double array "grades".

		System.out.println("========== WELCOME TO THE SELECTION PROCESS SYSTEM ==========");
		// Reads the names and their respective grades while the grade is valid (0–10).
		for (int i = 0; i < TOTAL_RANGE; i++) {
			System.out.println("Write down the name of the " + (i + 1) + "º candidate: ");
			names[i] = scanner.nextLine();
			System.out.println("\nWrite down the " + (i + 1) + "º grade: ");
			double input = scanner.nextDouble();
			scanner.nextLine(); // Consume the "\n" in the buffer.
			System.out.println();

			// Keep looping until the user inputs a valid grade.
			while (input < 0.0 || input > 10.0) {
				System.out.println("Invalid grade detected. Please re-enter the " + (i + 1) + "º grade: ");
				input = scanner.nextDouble();
				scanner.nextLine(); // Consume the "\n" in the buffer.
				System.out.println();
			}
			// Save the valid grade into the array
			grades[i] = input;
		}

		double total = 0.0;
		// Sum the total grades of the candidates.
		for (int i = 0; i < grades.length; i++) {
			total += grades[i];
		}
		double average = total/grades.length; // Calculates the average of the 10 candidates.

		System.out.println("=============================================================");
		System.out.println("\n========================== RESULTS ==========================\n");

		System.out.printf("The average between the candidates is: %.1f", average);

		int countPassed = 0;
		// It counts how many students passed, given that the minimum passing grade is 7.
		for (double n : grades) {
			if (n < 7) {
				continue;
			}
			countPassed++;
		}

		System.out.println("\n" + countPassed + " candidates passed!");

		// Loops through all grades to find the highest grades.
		double highestGrade = grades[0];
		int largestIndex = 0;
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] > highestGrade) {
				highestGrade = grades[i];
				largestIndex = i; // Save the exact index of the highest grade
			}
		}
		System.out.println("The candidate \"" + names[largestIndex] + "\" had the highest grade between the candidates");
		System.out.println("\n========================== RESULTS ==========================\n");
		System.out.println("\n=============================================================");
		scanner.close();
	}
}
