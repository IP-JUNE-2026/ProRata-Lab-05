import java.util.Scanner;

public class IT25100726Lab5Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        System.out.print("Enter start date: ");
        int startDate = input.nextInt();

        System.out.print("Enter end date: ");
        int endDate = input.nextInt();

        // Validation 1
        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Error: Dates should be between 1 and 31.");
            return;
        }

        // Validation 2
        if (startDate >= endDate) {
            System.out.println("Error: Start date should be less than end date.");
            return;
        }

        int daysReserved = endDate - startDate;

        double discountRate;

        if (daysReserved < 3) {
            discountRate = 0;
        } else if (daysReserved <= 4) {
            discountRate = DISCOUNT_10;
        } else {
            discountRate = DISCOUNT_20;
        }

        double totalAmount = daysReserved * ROOM_CHARGE;
        double discount = totalAmount * discountRate;
        double amountToPay = totalAmount - discount;

        System.out.println("Number of days reserved = " + daysReserved);
        System.out.println("Room charge = Rs. " + totalAmount);
        System.out.println("Discount = Rs. " + discount);
        System.out.println("Total amount to be paid = Rs. " + amountToPay);
    }
}