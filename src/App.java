import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter your name: ");
        // String userName = scanner.nextLine();

        // System.out.print("Enter your age: ");
        // int userAge = scanner.nextInt();

        // System.out.print("Enter your hight: ");
        // double userHeight = scanner.nextDouble();

        // System.out.print("Are you a student? (true/false): ");
        // boolean isStudent = scanner.nextBoolean();

        // System.out.println("\nUser Information:");
        // System.out.println("Name: " + userName);
        // System.out.println("Age:" + userAge);
        // System.out.println("Height: " + userHeight);
        // System.out.println("Student: " + isStudent);

        ////////////////////////////////////////////////////////
        /// 
        /// Another code
        /// 
        
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter your name: ");
        // String userName = scanner.nextLine();

        // System.out.print("Enter your age: ");
        // int userAge = scanner.nextInt();

        // System.out.print("Do you hold a National ID? (Yes/No):");
        // String hasNationalId = scanner.next();

        // if (userAge > 18 && hasNationalId.equalsIgnoreCase("Yes".toLowerCase())){

        //     System.out.println(userName + ", are eligible to vote.");
        // } else {
        //     System.out.println(userName + ", are not eligible to vote.");
        // }

        ////////////////////////////////////////////////////////
        /// 
        /// Another code
        /// 
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Your Program Type:: ");
        System.out.println("S - Science");
        System.out.println("A - Arts");
        System.out.println("M - Mathematics");
        System.out.print("Enter your program type: ");
        String programType = scanner.nextLine();

        System.out.print("Enter your applicant GPA: ");
        double applicantGPA = scanner.nextDouble();

        System.out.print("Enter your entrance exam score: ");
        double examScore = scanner.nextDouble();

        System.out.print("Do you have an extracurricular achievement? (Yes/No): ");
        String hasExtracurricular = scanner.next();

        switch (programType.toUpperCase()) {

            case "S":
                if (applicantGPA >= 3.0 && examScore >= 75 && hasExtracurricular.equalsIgnoreCase("Yes".toLowerCase())) {
                    System.out.println("Admitted to Science program.");

                } else if (applicantGPA < 3.0 || examScore < 75 && hasExtracurricular.equalsIgnoreCase("Yes".toLowerCase())) {
                    System.out.println("Conditionally admitted to Science program.");

                } else {
                    System.out.println("Not admitted to Science program.");
                }
                break;

                case "A":
                if (applicantGPA >= 2.5 && examScore >= 60 && hasExtracurricular.equalsIgnoreCase("Yes".toLowerCase())) {
                    System.out.println("Admitted to Arts program.");

                } else if (applicantGPA < 2.5 || examScore < 60 && hasExtracurricular.equalsIgnoreCase("Yes".toLowerCase())) {
                    System.out.println("Conditionally admitted to Arts program.");

                } else {
                    System.out.println("Not admitted to Arts program.");
                }
                break;

                case "M":
                if (applicantGPA >= 3.5 && examScore >= 80 && hasExtracurricular.equalsIgnoreCase("Yes".toLowerCase())) {
                    System.out.println("Admitted to Mathematics program.");

                } else if (applicantGPA < 3.5 || examScore < 80 && hasExtracurricular.equalsIgnoreCase("Yes".toLowerCase())) {
                    System.out.println("Conditionally admitted to Mathematics program.");

                } else {
                    System.out.println("Not admitted to Mathematics program.");
                }
                break;

                default:
                System.out.println("Invalid program type entered.");
                break;
        }

    }
}
