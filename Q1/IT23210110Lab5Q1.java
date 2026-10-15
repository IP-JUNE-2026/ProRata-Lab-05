import java.util.Scanner;

public class IT23210110Lab5Q1{
	  public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the first Intger :");
				int num1 = sc.nextInt();
				
				System.out.println("Enter the second Intger :");
				int num2 = sc.nextInt();
				
				System.out.println("Enter the first Intger :");
				int num3 = sc.nextInt();
				
				System.out.println("User entered numbers are :" +num1 +" " +num2 +" " +num3);
				
				int largest = num2;
				int smallest = num2;
				
				if(num1 > largest){
				    largest = num2;
					}
					if(num3 > largest){
					   largest = num3;
					   }
					   if(num1 < smallest){
					     smallest = num2;
						 }
						 if(num3 < smallest){
						   smallest = num3;
						   }
				System.out.println("Smallest number is :"+smallest);
				System.out.println("Largest number is :"+largest);
				
				
				}
				
			}
				
				
				