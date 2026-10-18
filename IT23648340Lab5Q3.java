import java.util.Scanner;

public class  IT23648340Lab5Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        final double ROOM_CHARGE_PER_DAY = 48000.00;
        final int MIN_DAY = 1;
        final int MAX_DAY = 31;

       
        System.out.print("Enter start date (day): ");
        int startDate = input.nextInt();

        System.out.print("Enter end date (day): ");
        int endDate = input.nextInt();

        
        if (startDate < MIN_DAY || startDate > MAX_DAY ||
            endDate < MIN_DAY || endDate > MAX_DAY) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return;
        }

       
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
            return;
        }

       
        int numberOfDays = endDate - startDate;

        
        double totalAmount = numberOfDays * ROOM_CHARGE_PER_DAY;

        double discountRate = 0;

        
        if (numberOfDays < 3) {
            discountRate = 0;
        } else if (numberOfDays <= 4) {
            discountRate = 10;
        } else {
            discountRate = 20;
        }

       
        double discountAmount = 0;
        if (numberOfDays > 3) {
            discountAmount = totalAmount * (discountRate / 100);
        }

        double finalAmount = totalAmount - discountAmount;

       
        System.out.println("\nNumber of days reserved: " + numberOfDays);
        System.out.println("Total amount before discount: Rs " + totalAmount);
        System.out.println("Discount applied: " + discountRate + "%");
        System.out.println("Final amount to be paid: Rs " + finalAmount);

        input.close();
    }
}