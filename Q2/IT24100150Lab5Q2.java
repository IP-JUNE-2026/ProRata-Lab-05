import java.util.Scanner;

public class IT24100150Lab5Q2{
	public static void main(String[] args){
		
		int numOfNewMembers;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of new members introduced: ");
		numOfNewMembers = scanner.nextInt();
		
		if(numOfNewMembers < 0){
			System.out.println("Input must be a number 0 or greater");
		}
		else{
			System.out.println();
			
			switch(numOfNewMembers){
			
				case 0 : System.out.println("No Prize");
						 break;	
			
				case 1 : System.out.println("Price is a: Pen");
					     break;	
					  
				case 2 : System.out.println("Price is a: Umbrella");
					     break;
					  
				case 3 : System.out.println("Price is a: Bag");
					     break;
					  
				case 4 : System.out.println("Price is a: Travelling Chair");
					     break;
					  
				default : System.out.println("Price is a: Headphone");
			
			}
						
		
		}
		
		
	}
}