import java.util.Scanner;

public class Program {
    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in); // Initialise Scanner class.
        double degreesUnit = 0.0; // Initial values of Degrees Unit.
        double cels2Fahren = degreesUnit * 9/5 + 32; // Degrees Celsius to Fahrenheit calculation
        double fahren2Cels = (degreesUnit - 32) * 5/9; // Fahrenheit to Degrees Celsius calculation

        System.out.println("System input printline:\n" +
                "Choice of temperature measuring unit:\n" +
                "Degrees Celsius [Keyboard Input: C] or Fahrenheit? [Keyboard Input: F]\n([Q]/[q] to System Exit.)");
        String conditionalVal = userInput.nextLine(); // scanner class keyboard input is copied into another variable.

        switch (conditionalVal) { // using the user input as a string-type condition/parameter in a switch-case statement
            case "C": // If the keyboard input is a capital "C". `case "C":` doesn't have a body
                // - because the condition can go into the switch-case body below it.
            case "c": // If the keyboard input is a lowercase "c"
                System.out.println("Commencing Degrees Conversion:\nInput your double-type value... [Awaiting user input...]");
                userInput.nextDouble(); // makes sure the input is a double-type value
                System.out.println("Degrees to Fahrenheit  conversion:\t" + cels2Fahren + "F");
                userInput.next("Input [F]/[f] for Fahrenheit\n or [Q]/[q] to System exit.");
                break;
            case "F":
            case "f":
                System.out.println("Commencing Fahrenheit Conversion:\nInput your double-type value... [Awaiting user input...]");
                userInput.nextDouble();
                System.out.println("Fahrenheit to Degrees conversion:\t" + fahren2Cels + "C");
                userInput.next("Input [C]/[c] for Celcius\n or [Q]/[q] to System exit.");
                break;
            case "Q":
            case "q":
                System.exit(0); // exit the console with a good result
            default:
                System.out.println("Exiting out ...");
                System.exit(1); // exits the console with an error
        }
    }
}

/* By Daniel David Sansano Surla. S3729065.
*
* Attribution(s):
* Available: Tutorial Practical Weeks 1 - 3, Programming 1 - Resource Materials. Royal Melbourne Institute of Technology.
* Available: [online] https://stackoverflow.com/a/27969556.
* "Converting Celsius to Fahrenheit using variables C or F". Ankush Soni. user4458695.
*
* */