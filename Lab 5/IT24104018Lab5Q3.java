import java.util.Scanner;

public class IT24104018Lab5Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Constants
        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        // Input dates
        System.out.print("Enter start date: ");
        int startDate = input.nextInt();

        System.out.print("Enter end date: ");
        int endDate = input.nextInt();

        // Validation 1
        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Error: Dates must be between 1 and 31.");
            input.close();
            return;
        }

        // Validation 2
        if (startDate >= endDate) {

            System.out.println("Error: Start date should be less than end date.");
            input.close();
            return;
        }

        // Calculate number of days
        int numberOfDays = endDate - startDate;

        double discountRate;

        // Find discount rate
        if (numberOfDays < 3) {
            discountRate = 0;
        }
        else if (numberOfDays <= 4) {
            discountRate = DISCOUNT_10;
        }
        else {
            discountRate = DISCOUNT_20;
        }

        // Calculate bill
        double totalAmount = numberOfDays * ROOM_CHARGE;
        double discountAmount = totalAmount * discountRate;
        double finalAmount = totalAmount - discountAmount;

        // Display results
        System.out.println("Number of days reserved = " + numberOfDays);
        System.out.println("Total before discount = Rs. " + totalAmount);
        System.out.println("Discount = Rs. " + discountAmount);
        System.out.println("Total amount to be paid = Rs. " + finalAmount);

        input.close();
    }
}