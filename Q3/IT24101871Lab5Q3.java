import java.util.Scanner;
public class IT24101871Lab5Q3 {
	public static void main(String[] args) {
	
final int ROOM_CHARGE_PER_DAY = 48000;
final int PERCENTAGE = 100;
int numberOfDays , amount , discountRate;
	double discount, totalAmount;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter Start Date (1-31): ");
	int startDate = input.nextInt();
	System.out.print("Enter End Date (1-31): ");
	int endDate = input.nextInt();
	if ( (startDate < 1) || (startDate > 31)) {
		System.out.println("Error: Days must be between 1 and 31");
	}
	else if ( (endDate < 1) || (endDate > 31)) {
		System.out.println("Error: Days must be between 1 and 31");
	}
	else if (startDate >= endDate){
		System.out.println("Error: Start Date must be less than End Date");
	}
	else {
	numberOfDays = endDate - startDate;
	if (numberOfDays < 3) {
		discountRate = 0;
	}
	else if ((numberOfDays == 3) || (numberOfDays == 4))  {
		discountRate = 10;
	}
	else {
		discountRate = 20;
	}
	amount = ROOM_CHARGE_PER_DAY * numberOfDays;
	discount = amount * discountRate / PERCENTAGE;
	totalAmount = amount - discount;
		System.out.println("\nRoom Charge Per Day: Rs. 48000.0/=");
		System.out.println("Number of Days Reserved: " + numberOfDays );
		System.out.println("Total Amount to be Paid: " + totalAmount );
	}
		
		
	  }

        }