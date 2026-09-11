import java.util.Scanner;
public class IT24100061Lab5Q1 {
   public static void main (String[] args) {
      
	   int num1,num2,num3;
	   
	 Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the first integer:");
    num1 = input.nextInt();

    System.out.println("Enter the second integer:");
    num2 = input.nextInt();
	
	System.out.println("Enter the third integer:");
    num3 = input.nextInt();
	
	System. out.println();
	System.out.println("User entered numbers are:"+ num1+" "+num2+" "+num3);
	
	int smallest = num1;
	int largest = num1;
	int count = 1;
	
	while(count<=2){
	   int current = (count==1)? num2 : num3;
	   
	   if(current<smallest){
	      smallest=current;
		}

		if(current>largest){
		largest=current;
		}
		
		count++;
	}
		
		System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);
		}
	}
	