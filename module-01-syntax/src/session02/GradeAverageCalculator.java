package session02;

// Import the Scanner class to create a Scanner object and read input.
import java.util.Scanner;
/*
    * Study/Coding Session 1.2 (Module 01) - Operators
    * Pratical problem: Write a program that calculates a candidate's average of 3 grades, the percentage of correct answers on a 20-question test, and whether they passed (average ≥ 7 AND correct answers ≥ 60%). Display the results.
    * 
    * Applied concepts:
    * - Arithmetic operators: +, -, *, /, % (modulo/remainder);
    * - Assignment operators: =, +=, -=, *=, /=;
    * - Relational/comparison operators: ==, !=, >, <, >=, <=;
    * - Logical operators: && (AND), || (OR), ! (NOT), cast(type) / type casting;
    * - Operator precedence: Order of evaluation (which executes first).
    
    =============================================================================================
    
    * Study/Coding Session 1.3 (Module 01) - Conditional Structures
    * Pratical problem: Expand the program from Section 1.2: use if/else to classify the candidate as 'Failed', 'Approved with reservations', or 'Approved with distinction' based on the average. Use a switch statement to display the area of interest in a formatted way.
    * 
    * Applied concepts:
    * - if, else if, else;
    * - switch case;
    * - Ternary operation;
    * - Switch Expression (Java 14+);
    * - (Bônus): Input and output data classes in Java (Scanner and System.out).
*/

public class GradeAverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating the Scanner object.
        
        // Display initial screen to input grade data
        System.out.println("=========== GRADE ENTRY SYSTEM ===========\n");
        System.out.printf("Welcome to the system!%n%nPlease, insert your name: ");
        String name = scanner.nextLine();
        
        System.out.printf("%nSelect the number of your interest area from the following list: %n%n");
        System.out.println("1 - Backend Development");
        System.out.println("2 - Frontend Development");
        System.out.println("3 - Mobile Development");
        System.out.println("4 - Quality Assurance (QA)\n");

        int areaNumber = scanner.nextInt();
        scanner.nextLine();
        // A switch expression to store the interest area according to the case value.
        String interestArea = switch (areaNumber){
            case 1 -> "Backend Development";
            case 2 -> "Frontend Development";
            case 3 -> "Mobile Development";
            case 4 -> "Quality Assurance (QA)";
            default -> "Wrong number";
        };

        System.out.printf("%nInsert the 3 grades: ");

        // Setting grades to calculate the average (double to support decimals).
        double grade1 = scanner.nextDouble();
        scanner.nextLine();
        double grade2 = scanner.nextDouble();
        scanner.nextLine();
        double grade3 = scanner.nextDouble();
        scanner.nextLine();

        // Correct answers and total count (int, whole numbers).
        System.out.printf("%nNow input how many questions you answered correctly on the 20-question test (0-20): ");
        int correctAnswersCount = scanner.nextInt();

        // Calculates the three-grade average.
        double average = (grade1 + grade2 + grade3) / 3;

        // Calculates the 20-question test grade according to the total number of correct answers.
        double percentageCorrect = (correctAnswersCount / 20.0) * 100;

        // Indicates whether the student passed with an average above 7 and at least 60% correct answers on the test.
        // 'Failed', 'Approved with reservations', or 'Approved with distinction' based on the average.
        String studentApprovalStatus;
        boolean haspassed = false;
        if (average >= 7 && percentageCorrect >= 80){
            studentApprovalStatus = "Approved with distinction.";
            haspassed = true;
        } else if (average >= 5 || percentageCorrect >= 60){
            studentApprovalStatus = "Approved with reservations.";
            haspassed = true;
        } else {
            studentApprovalStatus = "Failed.";
        }

        System.out.println("=====================================\n");

        // Print the results
        System.out.println("=========== GRADE DISPLAY ===========\n");
        System.out.println("Let's do a quick review!\n");
        System.out.println("Your name is: [" + name + "] and your interest area is: [" + interestArea + "]");
        System.out.println("\nYour first three grades are: " + grade1 + ", " + grade2 + " and " + grade3);
        System.out.printf("\nWith that, you've got an average of %.1f\n", average);
        System.out.printf("------------");
        System.out.print("\nAnd now, about the 20 questions test, you got " + correctAnswersCount + " questions right. ");
        System.out.println("So, you've got " + percentageCorrect + "%");
        System.out.println("\nYou need an average grade of 7.0 AND 80% on the 20-question test to be \"Approved with distinction\"\n(or at least an average grade of 5.0 OR 60% on the 20-question test to be \"Approved with reservations\").");
        System.out.println("Here's your status: " + studentApprovalStatus);
        // Testing the ternary operator to show the results of approval or failure.
        System.out.println(haspassed ? "Congratulations! You Passed!" : "Sorry, but you failed...");
        System.out.println("\n=====================================");

        scanner.close();
    }
}
