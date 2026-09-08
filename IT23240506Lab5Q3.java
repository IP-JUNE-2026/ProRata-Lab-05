import java.util.Scanner;

public class IT23240506Lab5Q3 {
    public static void main(String[] args) {

        final double ROOM_CHARGE = 48000.0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = sc.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = sc.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int days = endDate - startDate;
        double discountRate = 0.0;

        if (days >= 5) {
            discountRate = 0.20;
        } else if (days >= 3) {
            discountRate = 0.10;
        }

        double totalAmount = days * ROOM_CHARGE * (1 - discountRate);

        System.out.println("");
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE + "/=");
        System.out.println("Number of Days Reserved: " + days);
        System.out.println("Total Amount to be Paid: " + totalAmount);

    }
}