import java.util.Scanner;

public class IT24100150Lab5Q1{
	public static void main(String[] args){
		int num1;
		int num2;
		int num3;
		int min;
		int max;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first integer: ");
		num1 = scanner.nextInt();
		
		System.out.print("Enter the second integer: ");
		num2 = scanner.nextInt();
		
		System.out.print("Enter the third integer: ");
		num3 = scanner.nextInt();
		
		System.out.println();
		
		System.out.println("User entered numbers are: " + num1 + " " + num2 + " " + num3);
		
		
		min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }

       
        max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        
        System.out.println("The Smallest number is: " + min);
		
        System.out.println("The Largest number is: " + max);
		
		
	} 
}