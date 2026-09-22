import java.util.Scanner;

public class IT25102116Lab5Q3 {

    public static final double ROOM_CHARGE_PER_DAY = 48000.00;
    public static final double DISCOUNT_10 = 10.0;
    public static final double DISCOUNT_20 = 20.0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter start date: ");
        int startDate = input.nextInt();

        System.out.print("Enter end date: ");
        int endDate = input.nextInt();

        // Validation 1
        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Invalid date. Date should be between 1 and 31.");
            return;
        }

        // Validation 2
        if (startDate >= endDate) {
            System.out.println("Invalid dates. Start date should be less than end date.");
            return;
        }

        int numberOfDays = endDate - startDate;

        double discountRate;

        if (numberOfDays < 3) {
            discountRate = 0;
        }
        else if (numberOfDays <= 4) {
            discountRate = DISCOUNT_10;
        }
        else {
            discountRate = DISCOUNT_20;
        }

        double totalAmount = numberOfDays * ROOM_CHARGE_PER_DAY;

        double discountAmount =
                totalAmount * discountRate / 100;

        double finalAmount =
                totalAmount - discountAmount;

        System.out.println("Number of days reserved = " + numberOfDays);
        System.out.println("Discount = " + discountRate + "%");
        System.out.println("Total amount to be paid = Rs. " + finalAmount);
    }
}