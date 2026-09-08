import java.util.Scanner;

public class IT22091802Lab5Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int b = scanner.nextInt();
        System.out.print("Enter the third integer: ");
        int c = scanner.nextInt();

        System.out.println("User entered numbers are : " + a + " " + b + " " + c);

        int smallest = a;
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;

        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;

        System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);
    }
}