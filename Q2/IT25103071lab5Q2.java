import java.util.Scanner;

   public class IT25103071Lab5Q2{
     public static void main(String[]args){
	 
	  Scanner input = new Scanner(System.in);
	  
	  int members;
	  
	  System.out.println("Enter the number of new members introduced: ");
	   members = input.nextInt();
	  
	  if(members < 0){
		  System.out.println("Input must be a number 0 or greater");
	  }
	  
	  else{
	  
	   switch(members)
	  {
	     case 0 : System.out.print("No Prize");
			      break; 
				  
		 case 1	: System.out.print("Price is a : Pen");
			      break;
				  
		 case 2	:  System.out.print("Price is a : Umbrella");
			      break;
				  
		 case 3 : System.out.print("Price is a : Bag");
			      break;
				  
		 case 4 : System.out.print("Price is a : Travelling chair");
		 	      break;
				  
		 default: System.out.print("Price is a : Haedphone");
	  }
	  
	  }
	 }
   }	 
	  