import java.util.Scanner;

public class IT24100463Lab5Q3 {

    static final double ROOM_CHARGE_PER_DAY = 48000.00;
    static final int MIN_DATE = 1;
    static final int MAX_DATE = 31;
    static final int LOW_DISCOUNT_DAYS = 3;   // 3–4 days
    static final int HIGH_DISCOUNT_DAYS = 5;  // 5 or more
    static final double LOW_DISCOUNT_RATE = 0.10;
    static final double HIGH_DISCOUNT_RATE = 0.20;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = sc.nextInt();
        System.out.print("Enter End Date (1-31): ");
        int endDate = sc.nextInt();

        // Validation 1
        if (startDate < MIN_DATE || startDate > MAX_DATE ||
            endDate < MIN_DATE || endDate > MAX_DATE) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        // Validation 2
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int daysReserved = endDate - startDate;

        double discountRate = 0.0;
        if (daysReserved >= HIGH_DISCOUNT_DAYS) {
            discountRate = HIGH_DISCOUNT_RATE;
        } else if (daysReserved >= LOW_DISCOUNT_DAYS) {
            discountRate = LOW_DISCOUNT_RATE;
        }

        double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;
        totalAmount = totalAmount - (totalAmount * discountRate);

        System.out.println();
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmount);
    }
}