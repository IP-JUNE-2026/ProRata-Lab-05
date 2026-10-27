import java.util.Scanner;

public class IT22908124Lab5Q3 {
    public static void main(String[] args) {
        final double ROOM_CHARGE_PER_DAY = 48000.0;
        final double DISCOUNT_3_TO_4_DAYS = 0.10;
        final double DISCOUNT_5_OR_MORE_DAYS = 0.20;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            scanner.close();
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            scanner.close();
            return;
        }

        int days = endDate - startDate;
        double discountRate = 0.0;

        if (days >= 5) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        } else if (days >= 3) {
            discountRate = DISCOUNT_3_TO_4_DAYS;
        }

        double totalAmount = (days * ROOM_CHARGE_PER_DAY) * (1.0 - discountRate);

        System.out.println();
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + days);
        System.out.println("Total Amount to be Paid: " + totalAmount);

        scanner.close();
    }
}
