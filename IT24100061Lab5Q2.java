import java.util.Scanner;
public class IT24100061Lab5Q2 {
   public static void main (String[] args) {
   
     int member;
	 String prize;
	 
     Scanner input = new Scanner(System.in);
	 
	System.out.println("Enter the number of new members:");
	member = input.nextInt();
	
	if(member<0){
	  System.out.println("Input must be a number 0 or greater");
	} else {
        
        switch(member) {
            case 0 :
               	prize = "No Prize";
                break;
            case 1 :
                prize = "Pen";
                break;
			case 2 :
			    prize = "Umbrella";
				break;
			case 3 :
			    prize = "Bag";
				break;
			case 4 :
			    prize = "Travelling Chair";
				break;
			default :
                prize = "Headphone";
				break;
		 }
		System.out.println("Prize is a :" + prize) ;
	  }
   }
 }
 
	
   	