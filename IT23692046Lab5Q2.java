import java.util.Scanner;

public class IT23692046Lab5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of new members introduced
        System.out.print("Enter the number of new members introduced: ");
        int members = scanner.nextInt();

        // Validate that the number is greater than or equal to 0
        if (members < 0) {
            System.out.println("Input should be a number greater than or equal to 0.");
        } else {
            // Use a switch statement to determine the prize
            System.out.print("Entitled Prize: ");
            switch (members) {
                case 0:
                    System.out.println("No Prize");
                    break;
                case 1:
                    System.out.println("Pen");
                    break;
                case 2:
                    System.out.println("Umbrella");
                    break;
                case 3:
                    System.out.println("Bag");
                    break;
                case 4:
                    System.out.println("Travelling Chair");
                    break;
                default:
                    // Handles 5 or more new members
                    System.out.println("Headphone");
                    break;
            }
        }

        scanner.close();
    }
}