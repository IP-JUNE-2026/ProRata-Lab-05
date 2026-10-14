import java.util.Scanner;

public class IT24102392Lab5Q2 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		int NewMembers;
		String prize;

        System.out.print("Enter the number of new members introduced: ");
        NewMembers = scanner.nextInt();

        if (NewMembers < 0) {
            System.out.println("Input must be a number 0 or greater");
			return;
        } 
            
			
            switch (NewMembers) 
			{
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Traveling Chair";
                    break;
                default:
                    prize = "Headphone";
                    break;
			}		
            
            System.out.println("Prize is a: " + prize);
        

  
    }
}
