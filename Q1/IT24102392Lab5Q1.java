import java.util.Scanner;

public class IT24102392Lab5Q1 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int FirstNumber = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int SecondNumber = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int ThirdNumber = scanner.nextInt();

        int smallest = FirstNumber;
        if (SecondNumber < smallest) {
            smallest = SecondNumber;
        }
        if (ThirdNumber < smallest) {
            smallest = ThirdNumber;
        }

        int largest = FirstNumber;
        if (SecondNumber > largest) {
            largest = SecondNumber;
        }
        if (ThirdNumber > largest) {
            largest = ThirdNumber;
        }

        System.out.println("User entered numbers are : " + FirstNumber + " " + SecondNumber + " " + ThirdNumber);
        System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);

    
    }
}
