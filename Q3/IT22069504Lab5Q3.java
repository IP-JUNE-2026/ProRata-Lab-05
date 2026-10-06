
import java.util.Scanner;

public class IT22069504Lab5Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.00;

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            input.close();
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            input.close();
            return;
        }

        int days = endDate - startDate;
        double totalAmount = days * ROOM_CHARGE;

        if (days >= 3 && days <= 4) {
            totalAmount = totalAmount * 0.90;
        } else if (days >= 5) {
            totalAmount = totalAmount * 0.80;
        }

        System.out.println();
        System.out.println("Room Charge Per Day: Rs. 48000.0/=");
        System.out.println("Number of Days Reserved: " + days);
        System.out.println("Total Amount to be Paid: " + totalAmount);

        input.close();
    }
}
