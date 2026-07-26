package session02;

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
*/

public class GradeAverageCalculator {
    public static void main(String[] args) {
        // Setting grades to calculate the average (double to support decimals).
        double grade1 = 8.0;
        double grade2 = 7.0;
        double grade3 = 7.5;

        // Correct answers and total count (int, whole numbers).
        int totalQuestions = 20;
        int correctAnswersCount = 10;

        // Calculates the three-grade average.
        double average = (grade1 + grade2 + grade3) / 3;

        // Calculates the 20-question test grade according to the total number of correct answers.
        double percentageCorrect = (double) correctAnswersCount / totalQuestions * 100;

        // Indicates whether the student passed with an average above 7 and at least 60% correct answers on the test.
        boolean hasPassed = (average >= 7) && (percentageCorrect >= 60);

        // Print the results
        System.out.println("=========== GRADE DISPLAY ===========\n");
        System.out.println("Here are your first three grades:");
        System.out.println("1º Grade: " + grade1);
        System.out.println("2º Grade: " + grade2);
        System.out.println("3º Grade: " + grade3);
        System.out.printf("\nWith that, you've got an average of %.1f\n", average);
        System.out.print("\nAnd now, about the 20 questions test, you got " + correctAnswersCount + " questions right. ");
        System.out.println("So, you've got " + percentageCorrect + "%");
        System.out.println("\nYou need an average grade of 7.0 AND at least 60% on the 20-question test.");
        System.out.println("This shows whether you passed or not: " + hasPassed);
        System.out.println("\n=====================================");
    }
}
