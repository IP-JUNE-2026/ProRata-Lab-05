import java.util.Scanner;

public class IT23210110Lab5Q2{
           public static void main(String[] args){
		        Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter number of new members introduced :");
				int members = sc.nextInt();
				
				if(members<0){
					System.out.println("Input must be a zero or greater");
					return;
				}
				
				switch(members)
				{
				 case 0 : System.out.println("No prize");
				          break;
						  
				 case 1 : System.out.println("Prize is a :Pen");
				          break;
						  
				 case 2 : System.out.println("Prize is a :Umbrella");
				          break;
						  
				 case 3 : System.out.println("Prize is a : Bag");
				          break;
						  
				 case 4 : System.out.println("Prize is a : Travelling Chair");
				          break;
						  
				 default : System.out.println("Prize is a : Headphone");
				          
						  
				 
				 }
				
				
				}

}