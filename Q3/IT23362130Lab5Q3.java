import java.util.Scanner;

public class IT23362130Lab5Q3 {
    public static void main(String[] args) {
        final double ROOM_CHARGE_PER_DAY = 48000.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int daysReserved = endDate - startDate;

        double discountRate;
        if (daysReserved >= 5) {
            discountRate = 0.20;
        } else if (daysReserved >= 3) {
            discountRate = 0.10;
        } else {
            discountRate = 0.0;
        }

        double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY * (1 - discountRate);

        System.out.println();
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmount);
    }
}