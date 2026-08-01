package selectionprocessproject;

/*
    * Study/Coding Session 1.4 (Module 01) - Arrays and Loops
    * Pratical problem: 
Receive data from N candidates (name, test score, interview score)
Calculate the weighted average (test weight 6, interview weight 4)
Classify each candidate: Failed / Waiting list / Approved
Display a final report with: total candidates, approved, failed, class average
Indicate the candidate with the best performance
Commit: Push this project to the branch modulo-01/selection-process of the java-estudos repository.
*/

import java.util.Scanner;

public class SelectionSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfCandidates;

		System.out.println("=============== WELCOME TO THE SELECTION SYSTEM ===============");

		// Reads the candidates number (while it is > 0).
		do {
			System.out.println("Enter how many candidates will be evaluated today:");
			numberOfCandidates = scanner.nextInt();

			if (numberOfCandidates <= 0) {
				System.out.println("Negative numbers or 0 are not accepted, try again.");
			}
		} while (numberOfCandidates <= 0);

		scanner.nextLine(); // // Clear the buffer

		int approvedCount = 0;
		int waitingListCount = 0;
		int failedCount = 0;
		int highestIndex = 0;
		String[] candidateNames = new String[numberOfCandidates];
		String[] candidateClassifications = new String[numberOfCandidates];
		double[] candidateTestScores = new double[numberOfCandidates];
		double[] candidateInterviewScores = new double[numberOfCandidates];
		double[] weightedAverages = new double[numberOfCandidates];
		double currentTotalScore = 0.0;
		double sumOfAllScores = 0.0;
		double highestScore = weightedAverages[0];

		for (int i = 0; i < numberOfCandidates; i++) {
			System.out.println("\nEnter data for candidate #" + (i + 1) + ": ");

			System.out.print("Name: ");
			candidateNames[i] = scanner.nextLine();

			// Ensure that only positive numbers are accepted
			do {
				System.out.print("Test Score: ");
				candidateTestScores[i] = scanner.nextDouble();
				scanner.nextLine();

				if (candidateTestScores[i] < 0) {
					System.out.println("Negative numbers are not accepted, try again.");
				}
			} while (candidateTestScores[i] < 0);

			do {
				System.out.print("Interview Score: ");
				candidateInterviewScores[i] = scanner.nextDouble();
				scanner.nextLine();

				if (candidateInterviewScores[i] < 0) {
					System.out.println("Negative numbers are not accepted, try again.");
				}
			} while (candidateInterviewScores[i] < 0);

			// Weighted average: (test * 6 + interview * 4) / 10
			weightedAverages[i] = (candidateTestScores[i] * 6 + candidateInterviewScores[i] * 4) / 10.0;

			// Classify the candidate according to the weighted average.
			if (weightedAverages[i] >= 7.0) {
				candidateClassifications[i] = "Approved";
				approvedCount++;
			} else if (weightedAverages[i] >= 5) {
				candidateClassifications[i] = "Waiting List";
				waitingListCount++;
			} else {
				candidateClassifications[i] = "Failed";
				failedCount++;
			}

			// Sum all scores to calculate an overall class average later
			currentTotalScore = (candidateTestScores[i] + candidateInterviewScores[i]);
			sumOfAllScores += currentTotalScore;

			// Search for the highest score and assign the index of the respective candidate.
			if (weightedAverages[i] > highestScore) {
				highestScore = weightedAverages[i];
				highestIndex = i;
			}
		}

		System.out.println("\n===============================================================");

		// Individual Report
		for (int i = 0; i < numberOfCandidates; i++) {
			System.out.println("\n==================== CANDIDATE #" + (i+1) + " REPORT ======================");
			System.out.println("NAME: " + candidateNames[i]);
			System.out.println("TEST SCORE: " + candidateTestScores[i]);
			System.out.println("INTERVIEW SCORE: " + candidateInterviewScores[i]);
			System.out.printf("AVERAGE: %.2f", weightedAverages[i]);
			System.out.println("\nCLASSIFICATION: " + candidateClassifications[i]);
			System.out.println("===============================================================");
		}

		// Final Report
		System.out.println("\n======================== FINAL REPORT =========================");
		System.out.println("Total Candidates: " + numberOfCandidates);
		System.out.println("Total Approved (average >= 7): " + approvedCount);
		System.out.println("Total Waiting List (average >= 5): " + waitingListCount);
		System.out.println("Total Failed (average < 5): " + failedCount);
		System.out.println("Overall Class Average: " + (sumOfAllScores / (numberOfCandidates * 2)));
		System.out.println("And the candidate with the best performance is: " + candidateNames[highestIndex]);
		System.out.println("===============================================================");

		scanner.close();
	}
}
