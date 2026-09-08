import java.util.Scanner;

public class IT22091802Lab5Q3 {
    public static void main(String[] args) {
        final double ROOM_CHARGE = 48000.0;
        final int MIN_DAY = 1;
        final int MAX_DAY = 31;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();

        if (startDate < MIN_DAY || startDate > MAX_DAY || 
            endDate < MIN_DAY || endDate > MAX_DAY) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int days = endDate - startDate;
        double totalAmount;

        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE + "/=");
        System.out.println("Number of Days Reserved: " + days);

        if (days < 3) {
            totalAmount = days * ROOM_CHARGE;
        } else if (days <= 4) {
            totalAmount = days * ROOM_CHARGE * 0.90;
        } else {
            totalAmount = days * ROOM_CHARGE * 0.80;
        }

        System.out.println("Total Amount to be Paid: " + totalAmount);
    }
}