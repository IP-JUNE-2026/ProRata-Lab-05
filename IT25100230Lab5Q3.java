import java.util.Scanner;

public class IT25100230Lab5Q3 {
    static final double ROOM_CHARGE_PER_DAY = 48000.00;
    static final int MIN_DAY = 1;
    static final int MAX_DAY = 31;
    static final double DISCOUNT_3_TO_4_DAYS = 10;
    static final double DISCOUNT_5_OR_MORE_DAYS = 20;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        // Validation 1
        if (startDate < MIN_DAY || startDate > MAX_DAY || endDate < MIN_DAY || endDate > MAX_DAY) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        // Validation 2
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int days = endDate - startDate;
        double total = days * ROOM_CHARGE_PER_DAY;

        if (days >= 5) {
            total = total - total * DISCOUNT_5_OR_MORE_DAYS / 100;
        } else if (days >= 3) {
            total = total - total * DISCOUNT_3_TO_4_DAYS / 100;
        }

        System.out.println();
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + days);
        System.out.println("Total Amount to be Paid: " + total);
    }
}