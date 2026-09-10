import java.util.Scanner;

public class IT21802812Lab5Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of new members introduced: ");
        int count = input.nextInt();

        if (count < 0) {
            System.out.println("Invalid input. Number of new members cannot be negative.");
            input.close();
            return;
        }

        // Cap the count at 5 so any value 5 or above falls into the same case
        int switchValue = (count >= 5) ? 5 : count;

        switch (switchValue) {
            case 0:
                System.out.println("Prize: No Prize");
                break;
            case 1:
                System.out.println("Prize: Pen");
                break;
            case 2:
                System.out.println("Prize: Umbrella");
                break;
            case 3:
                System.out.println("Prize: Bag");
                break;
            case 4:
                System.out.println("Prize: Travelling Chair");
                break;
            case 5:
                System.out.println("Prize: Headphone");
                break;
        }

        input.close();
    }
}