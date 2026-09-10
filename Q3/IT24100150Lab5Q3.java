import java.util.Scanner;

public class IT24100150Lab5Q3{
	public static void main(String[] args){
		
		final double ROOM_CHARGE_PER_DAY = 48000.0;
		int startDate;
		int endDate;
		int daysReserved;
        double discountRate;
		double totalAmount;
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("Enter Start Date(1-31): ");
		startDate = scanner.nextInt();
		
		System.out.print("Enter End Date(1-31): ");
		endDate = scanner.nextInt();
		
		if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
			
            System.out.println("Error: Days must be between 1 and 31");
        } 
		
		else if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
        } 
		
		else {
			
            System.out.println(); 
            
           
            daysReserved = endDate - startDate;
            discountRate = 0.0; 

            if (daysReserved >= 3 && daysReserved <= 4) {
                discountRate = 0.10; 
				
            } 
			
			else if (daysReserved >= 5) {
                discountRate = 0.20; 
            }

            totalAmount = (daysReserved * ROOM_CHARGE_PER_DAY) * (1.0 - discountRate);

            
            System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
            System.out.println("Number of Days Reserved: " + daysReserved);
            System.out.println("Total Amount to be Paid: " + totalAmount);
        }
	}
}