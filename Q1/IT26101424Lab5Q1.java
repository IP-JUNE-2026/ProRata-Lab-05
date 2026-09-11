import java.util.Scanner;

public class IT26101424Lab5Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();

       
        int min = Math.min(num1, Math.min(num2, num3));

        
        int max = Math.max(num1, Math.max(num2, num3));

     
        System.out.println("\nUser entered numbers are : " + num1 + " " + num2 + " " + num3);
        System.out.println("The Smallest number is: " + min);
        System.out.println("The Largest number is: " + max);

    }
}