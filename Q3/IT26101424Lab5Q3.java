import java.util.Scanner;

public class IT26101424Lab5Q3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        final double Room_charge_per_day = 48000.0;
        final double Discount_3_to_4_days = 0.1;
        final double Discount_5_or_more_days = 0.2;
        
        int startDate, endDate, numberOfDaysReserved;
        double totalAmountBeforeDiscount, discountAmount, totalAmountToBePaid;
        double discountRate = 0;
        
        System.out.print("Enter Start Date (1-31): ");
        startDate = input.nextInt();
        
        System.out.print("Enter End Date (1-31): ");
        endDate = input.nextInt();
        
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return; 
        }
        
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date");
            return;
        }
        
        numberOfDaysReserved = endDate - startDate;
        
        if (numberOfDaysReserved >= 3 && numberOfDaysReserved <= 4) {
            discountRate = Discount_3_to_4_days;
        } 
        else if (numberOfDaysReserved >= 5) {
            discountRate = Discount_5_or_more_days;
        }
        
        totalAmountBeforeDiscount = numberOfDaysReserved * Room_charge_per_day;
        discountAmount = totalAmountBeforeDiscount * discountRate;
        totalAmountToBePaid = totalAmountBeforeDiscount - discountAmount;
        
        System.out.println();
        System.out.println("Room charge per day: Rs. " + Room_charge_per_day + "/=");
        System.out.println("Number of days Reserved: " + numberOfDaysReserved);
        System.out.println("Total amount to be paid: " + totalAmountToBePaid);
        
    
    }
}