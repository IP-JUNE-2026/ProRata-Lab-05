import java.util.Scanner;

public class IT23692046Lab5Q3 {
    // Define Constants for fixed values
    public static final double ROOM_CHARGE_PER_DAY = 48000.00;
    public static final double DISCOUNT_3_4_DAYS = 0.10; // 10%
    public static final double DISCOUNT_5_OR_MORE = 0.20; // 20%

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter start date and end date
        System.out.print("Enter Start Date (day): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter End Date (day): ");
        int endDate = scanner.nextInt();

        // Validation 1: Start date and end date cannot be less than 1 or greater than 31
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Start Date and End Date must be between 1 and 31.");
            return; // Exit from the program
        }

        // Validation 2: Start date should be less than the end date
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than the End Date.");
            return; // Exit from the program
        }

        // Calculate number of days reserved
        int noOfDays = endDate - startDate;
        double discountRate = 0.0;

        // Determine discount rate based on the number of days reserved
        if (noOfDays >= 3 && noOfDays <= 4) {
            discountRate = DISCOUNT_3_4_DAYS;
        } else if (noOfDays >= 5) {
            discountRate = DISCOUNT_5_OR_MORE;
        } else {
            discountRate = 0.0; // Less than 3 days: No discount
        }

        // Calculate total amount before discount, discount amount, and final amount to pay
        double totalBeforeDiscount = noOfDays * ROOM_CHARGE_PER_DAY;
        double discountAmount = totalBeforeDiscount * discountRate;
        double totalToPay = totalBeforeDiscount - discountAmount;

        // Display results
        System.out.println("\n--- Ransiri Resort Reservation Summary ---");
        System.out.println("Start Date:          " + startDate);
        System.out.println("End Date:            " + endDate);
        System.out.println("Number of Days:      " + noOfDays);
        System.out.printf("Total Amount to Pay: Rs. %.2f\n", totalToPay);

        scanner.close();
    }
}