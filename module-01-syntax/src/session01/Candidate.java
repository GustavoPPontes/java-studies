package session01;

/*
    * Study/Coding Session 1.1 (Module 01) - Data Types, Variables and Keywords
    * Pratical problem: Create a program that declares variables to represent a candidate (name, age, exam score, whether they are approved or not, and interest area)
    * 
    * Applied concepts:
    * - Primitive variables: int, double, boolean, ...;
    * - Keywords: class, private, int, ...;
    * - Declaration, Inicialization and Assignment;
    * - Naming Conventions: camelCase, PascalCase;
*/

public class Candidate {
    public static void main(String[] args) {

        // Primitive variables and objects to represent a candidate
        String candidateName = "Stan Staminson"; // A string is not a primitive variable, but an object
        int candidateAge = 35; // Integer number
        double examScore = 9.5; // Floating-point number (decimal number - double precision)
        boolean isApproved = false; // Boolean value = true or false

        // Declaration without immediate initialization (separated assignment)
        String interestArea;
        interestArea = "Policy";

        // Building and printing the 'Candidate Page' using previous variables/objects
        System.out.println("=====================================================================");
        System.out.println("                    WELCOME TO THE CADIDATE PAGE");
        System.out.println("=====================================================================");
        System.out.println("                     Here's your profile status:\n");
        System.out.println("Name:                                                   " + candidateName);
        System.out.println("Age:                                                                " + candidateAge);
        System.out.println("Interest Area:                                                  " + interestArea);
        System.out.println("Your exam score is:                                                " + examScore);
        System.out.println("Since the minimum grade to pass is \"10\", your result is:         " + isApproved);
    }
}
