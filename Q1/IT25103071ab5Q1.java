import java.util.Scanner;
    public class IT25103071Lab5Q1{
	  public static void main(String[] args){
		  
		  int firstinteger , secondinteger , thirdinteger , smallest , largest;
		 
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter the first integer: ");
		 firstinteger = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		 secondinteger = input.nextInt();
		
		System.out.print("Enter the third integer: ");
	     thirdinteger = input.nextInt();
		
		System.out.println("\nUser entered numbers are : " + firstinteger +" "+ secondinteger + " "+ thirdinteger);
		
		smallest = firstinteger;
		largest = firstinteger;
		
		if(secondinteger < smallest){
			smallest = secondinteger;
			
		}
		
		if(thirdinteger < smallest){
			smallest = thirdinteger;
			
		}
		
		if(secondinteger > largest){
			largest = secondinteger;
			
		}
		
		if(thirdinteger > largest){
			largest = thirdinteger;
		}
		
			System.out.println("The Smallest number is: " + smallest);
			
			System.out.println("The Largest number is: " + largest);
			
	  }
	}
				