import java.util.Scanner;
public class IT24100061Lab5Q3 {

   static final double ROOM_CHARGE_PER_DAY = 48000.0;
   static final int MIN_DAYS = 1;
   static final int MAX_DAYS = 31;
   
   public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
      
	    System.out.println("Enter Start Date (1-31): ");
		int startDate = input.nextInt();
		
		System.out.print("Enter End Date (1-31): ");
		int endDate = input.nextInt();
		
		System.out.println();
		
		
        if (startDate < MIN_DAYS || startDate > MAX_DAYS || endDate < MIN_DAYS || endDate > MAX_DAYS) {
            System.out.println("Error: Days must be between 1 and 31");
            return; // exit the program
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return; // exit the program
        }

        
        int daysReserved = endDate - startDate;

        double discountRate;
        if (daysReserved < 3) {
            discountRate = 0;
        } else if (daysReserved <= 4) {
            discountRate = 10;
        } else {
            discountRate = 20;
        }

        
        double totalBeforeDiscount = daysReserved * ROOM_CHARGE_PER_DAY;
        double totalAmount = totalBeforeDiscount - (totalBeforeDiscount * discountRate / 100);

        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmount);
    }
}
	  
   
 