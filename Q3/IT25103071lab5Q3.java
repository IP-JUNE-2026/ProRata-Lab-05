import java.util.Scanner;
    public class IT25103071Lab5Q3 {
		
		static final double ROOM_CHARGE_PER_DAY = 48000.0;
		static final int MIN_DATE = 1;
		static final int MAX_DATE = 31;
		static final int MIN_DAYS_FOR_DISCOUNT_LEVEL1 = 3;
		static final int MIN_DAYS_FOR_DISCOUNT_LEVEL2 = 5;
		static final double DISCOUNT_RATE_LEVEL1 = 10.0;
		static final double DISCOUNT_RATE_LEVEL2 = 20.0;
		
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Start Date(1-31): ");
		int startdate = input.nextInt();
		
		System.out.println("Enter End Date(1-31): ");
		int enddate = input.nextInt();
		
		if(startdate < MIN_DATE || startdate > MAX_DATE || enddate < MIN_DATE || enddate > MAX_DATE){
			System.out.println("Days must be between 1 and 31");
			return;
		}
		if(startdate > enddate){
			System.out.println("Start date must be less than end date");
			return;
		}
		System.out.println("Room charge per day: Rs.48000.0/=");
		
		int daysreserved = enddate - startdate;
		double discountrate;
		
		System.out.println("Numbers of days reserved: " + daysreserved);
		
		if(daysreserved < MIN_DAYS_FOR_DISCOUNT_LEVEL1){
			discountrate = 0.0;
		}
		else if(daysreserved < MIN_DAYS_FOR_DISCOUNT_LEVEL2){
			discountrate = DISCOUNT_RATE_LEVEL1;
		}
		else{
			discountrate = DISCOUNT_RATE_LEVEL2;
		}
		
		double amount = ROOM_CHARGE_PER_DAY * daysreserved;
		double discamount = (amount * discountrate)/100;
		double finalamount = amount - discamount;
		
		System.out.println("Total Amount to be paid: " + finalamount);
		
		}
		
	}