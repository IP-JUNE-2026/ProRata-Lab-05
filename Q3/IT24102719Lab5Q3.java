import java.util.Scanner;

public class IT24102719Lab5Q3 {
    public static void main(String[] args) {
        final double ROOM_CHARGE_PER_DAY = 48000.0;
        final int MIN_DATE = 1;
        final int MAX_DATE = 31;
        final int NO_DISCOUNT_MAX_DAYS = 2;
        final int MEDIUM_DISCOUNT_MAX_DAYS = 4;
        final double MEDIUM_DISCOUNT_RATE = 0.10;
        final double HIGH_DISCOUNT_RATE = 0.20;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = sc.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = sc.nextInt();

        // Validation 1
        if (startDate < MIN_DATE || startDate > MAX_DATE || endDate < MIN_DATE || endDate > MAX_DATE) {
            System.out.println("Error: Days must be between 1 and 31");
            sc.close();
            return;
        }

        // Validation 2
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            sc.close();
            return;
        }

        int daysReserved = endDate - startDate;
        double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;

        if (daysReserved <= NO_DISCOUNT_MAX_DAYS) {
            // No discount
        } else if (daysReserved <= MEDIUM_DISCOUNT_MAX_DAYS) {
            totalAmount = totalAmount * (1 - MEDIUM_DISCOUNT_RATE);
        } else {
            totalAmount = totalAmount * (1 - HIGH_DISCOUNT_RATE);
        }

        System.out.println();
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmount);

        sc.close();
    }
}