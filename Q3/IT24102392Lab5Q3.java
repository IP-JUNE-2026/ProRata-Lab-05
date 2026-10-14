import java.util.Scanner;

public class IT24102392Lab5Q3
 { 

    private static final double ROOM_CHARGE_PER_DAY = 48000.0;
    private static final int MIN_DAY = 1;
    private static final int MAX_DAY = 31;

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();

        if (startDate < MIN_DAY || startDate > MAX_DAY || endDate < MIN_DAY || endDate > MAX_DAY) {
            System.out.println("Error: Days must be between 1 and 31");
            return; 
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return; 
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

        double totalAmount = ROOM_CHARGE_PER_DAY * daysReserved;
        double discountAmount = totalAmount * (discountRate / 100);
        totalAmount =totalAmount - discountAmount;

        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/-");
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmount + "/-");

    }
}
