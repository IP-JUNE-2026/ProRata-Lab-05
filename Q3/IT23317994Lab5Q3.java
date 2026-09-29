import java.util.Scanner;

public class IT23317994Lab5Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_10 = 10.0;
        final double DISCOUNT_20 = 20.0;

        System.out.print("Enter start date: ");
        int startDate = input.nextInt();

        System.out.print("Enter end date: ");
        int endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Error: Date should be between 1 and 31");
            return;
        }

        if (startDate >= endDate) {

            System.out.println("Error: Start date should be less than end date");
            return;
        }

        int days = endDate - startDate;

        double discountRate;

        if (days < 3) {
            discountRate = 0;
        }
        else if (days <= 4) {
            discountRate = DISCOUNT_10;
        }
        else {
            discountRate = DISCOUNT_20;
        }

        double total = days * ROOM_CHARGE;

        double discount = total * discountRate / 100;

        double amountToPay = total - discount;

        System.out.println("Number of days = " + days);
        System.out.println("Discount = " + discountRate + "%");
        System.out.println("Total amount to pay = Rs. " + amountToPay);
    }
}