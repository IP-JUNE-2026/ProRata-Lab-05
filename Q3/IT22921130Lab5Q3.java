import java.util.Scanner;

public class IT22921130Lab5Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.00;

        int startDate, endDate, noOfDays;
        double totalAmount, discount = 0, finalAmount;

        System.out.print("Enter start date: ");
        startDate = input.nextInt();

        System.out.print("Enter end date: ");
        endDate = input.nextInt();

        // Validation 1
        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Error: Dates must be between 1 and 31");
            return;
        }

        // Validation 2
        if (startDate >= endDate) {

            System.out.println("Error: Start date should be less than end date");
            return;
        }

        noOfDays = endDate - startDate;

        // Calculate total amount
        totalAmount = noOfDays * ROOM_CHARGE;

        // Discount calculation
        if (noOfDays >= 3 && noOfDays <= 4) {
            discount = totalAmount * 0.10;
        }
        else if (noOfDays >= 5) {
            discount = totalAmount * 0.20;
        }

        finalAmount = totalAmount - discount;

        System.out.println("Number of days reserved: " + noOfDays);
        System.out.println("Total amount: Rs. " + totalAmount);
        System.out.println("Discount: Rs. " + discount);
        System.out.println("Amount to be paid: Rs. " + finalAmount);
    }
}