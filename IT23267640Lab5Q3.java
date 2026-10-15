import java.util.Scanner;

public class IT23267640Lab5Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Constants
        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        int startDate, endDate, daysReserved;
        double totalAmount, discount, finalAmount;

        // Input
        System.out.print("Enter Start Date (1-31): ");
        startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        endDate = input.nextInt();

        // Validation 1
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
        }
        // Validation 2
        else if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
        }
        else {

            // Calculate number of reserved days
            daysReserved = endDate - startDate;

            // Calculate total amount
            totalAmount = daysReserved * ROOM_CHARGE;

            // Apply discount
            if (daysReserved < 3) {
                discount = 0;
            } else if (daysReserved <= 4) {
                discount = totalAmount * DISCOUNT_10;
            } else {
                discount = totalAmount * DISCOUNT_20;
            }

            finalAmount = totalAmount - discount;

            // Output
            System.out.println("\nRoom Charge Per Day: Rs. " + ROOM_CHARGE);
            System.out.println("Number of Days Reserved: " + daysReserved);
            System.out.println("Total Amount to be Paid: " + finalAmount);
        }

       
    }
}
