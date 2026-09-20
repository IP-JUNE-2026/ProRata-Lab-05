import java.util.Scanner;

public class IT23249820Lab5Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int MIN_DATE = 1;
        final int MAX_DATE = 31;

        final double ROOM_CHARGE_PER_DAY = 48000.0;
        final double TEN_PERCENT_DISCOUNT = 0.10;
        final double TWENTY_PERCENT_DISCOUNT = 0.20;

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        if (startDate < MIN_DATE || startDate > MAX_DATE
                || endDate < MIN_DATE || endDate > MAX_DATE) {

            System.out.println(
                    "Error: Days must be between 1 and 31"
            );

        } else if (startDate >= endDate) {

            System.out.println(
                    "Error: Start Date must be less than End Date"
            );

        } else {

            int numberOfDays = endDate - startDate;

            double discountRate;

            if (numberOfDays >= 5) {
                discountRate = TWENTY_PERCENT_DISCOUNT;
            } else if (numberOfDays >= 3) {
                discountRate = TEN_PERCENT_DISCOUNT;
            } else {
                discountRate = 0.0;
            }

            double originalAmount =
                    numberOfDays * ROOM_CHARGE_PER_DAY;

            double discountAmount =
                    originalAmount * discountRate;

            double totalAmount =
                    originalAmount - discountAmount;

            System.out.println();
            System.out.println(
                    "Room Charge Per Day: Rs. "
                            + ROOM_CHARGE_PER_DAY + "/="
            );

            System.out.println(
                    "Number of Days Reserved: " + numberOfDays
            );

            System.out.println(
                    "Total Amount to be Paid: " + totalAmount
            );
        }

        input.close();
    }
}