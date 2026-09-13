import java.util.Scanner;
public class IT24101871Lab5Q1 {
	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 
	 System.out.print("Enter the frist integer: ");
	int number1= input.nextInt();
	 System.out.print("Enter the second integer: ");
	int number2= input.nextInt();
	 System.out.print("Enter the third integer: ");
	int number3= input.nextInt();
	 System.out.println("\nUser entered numbers are: " + number1 + " " + number2 + " " +number3);

	int smallestNumber=number1;
	if(number2<smallestNumber) {
	 smallestNumber=number2; }
	if(number3<smallestNumber) {
	 smallestNumber=number3; }
	System.out.println("The Smallest number is: "+smallestNumber);
	
	int largestNumber=number3;
	if(number1>largestNumber) {
	 largestNumber=number1; }
	if(number2>largestNumber) {
	 largestNumber=number2; }
	System.out.println("The Largest number is: "+largestNumber);

   }

}