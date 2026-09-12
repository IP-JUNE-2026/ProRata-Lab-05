import java.util.Scanner;

public class IT26101572Lab5Q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, num3;
        int smallest, largest;

        System.out.print("Enter the first integer: ");
        num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        num2 = input.nextInt();

        System.out.print("Enter the third integer: ");
        num3 = input.nextInt();

        // Find the smallest number
        smallest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }

        if (num3 < smallest) {
            smallest = num3;
        }

        // Find the largest number
        largest = num1;

        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }

        // Display results
        System.out.println();
        System.out.println("User entered numbers are : "
                + num1 + " " + num2 + " " + num3);

        System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);

        input.close();
    }
}