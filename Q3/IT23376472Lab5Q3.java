import java.util.Scanner;
public class IT23376472Lab5Q3 {

    private static final double ROOM_CHARGES_PER_DAY_IS_RS = 48000.00;
	private static final int DISCOUNT_3_4_DAYS = 10;
	private static final int DISCOUNT_5_OR_MORE_DAYS = 20;
		
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Start Date (1-31) :");
        int SDate = input.nextInt();

        System.out.print("Enter End Date (1-31) :");
        int EDate = input.nextInt();

        if(SDate < 1 || SDate > 31 || EDate < 1 || EDate > 31) {
			System.out.println("Error: Days must be between 1 and 31");
			
			return;
		}
		
		if(SDate >=  EDate){
			System.out.println("Error: Start Date must be less than End Date:");
			
			return;
		}
		
		int NumberOfDaysReserved = EDate - SDate;
		
		double totalcharge = NumberOfDaysReserved * ROOM_CHARGES_PER_DAY_IS_RS;
		
		int discountRate = 10;
		if(NumberOfDaysReserved >= 3 && NumberOfDaysReserved <= 4) {
			 discountRate = DISCOUNT_3_4_DAYS;
			
		}   else if(NumberOfDaysReserved >= 5) {
			     discountRate = DISCOUNT_5_OR_MORE_DAYS;
			}
		
		double discountAmount = (totalcharge * discountRate)/100;
		double finalAmount = totalcharge - discountAmount;
		
		System.out.println("Room Charge Per Day : " + ROOM_CHARGES_PER_DAY_IS_RS);
		System.out.println("Number of Days Reserved : "+ NumberOfDaysReserved);
		System.out.println("Total Amount to be Paid : " + finalAmount);
	
	}
}
					
					
		
		
		
		
			
          			