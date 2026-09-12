import java.util.Scanner;

public class IT26101572Lab5Q3 {

    // Constants
    static final double ROOM_CHARGE_PER_DAY = 48000.00;
    static final double DISCOUNT_10 = 10.0;
    static final double DISCOUNT_20 = 20.0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int startDate, endDate;
        int daysReserved;
        double discountRate = 0.0;
        double totalAmount;

        System.out.print("Enter Start Date (1-31): ");
        startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        endDate = input.nextInt();

        // Validation 1
        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        // Validation 2
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        // Calculate number of days reserved
        daysReserved = endDate - startDate + 1;

        // Determine discount
        if (daysReserved < 3) {
            discountRate = 0;
        } else if (daysReserved <= 4) {
            discountRate = DISCOUNT_10;
        } else {
            discountRate = DISCOUNT_20;
        }

        // Calculate total amount
        double amountBeforeDiscount =
                daysReserved * ROOM_CHARGE_PER_DAY;

        double discountAmount =
                amountBeforeDiscount * discountRate / 100;

        totalAmount =
                amountBeforeDiscount - discountAmount;

        // Display output
        System.out.printf("\nRoom Charge Per Day: Rs. %.2f%n",
                ROOM_CHARGE_PER_DAY);
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.printf("Total Amount to be Paid: Rs. %.2f%n",
                totalAmount);

        input.close();
    }
}