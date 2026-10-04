import java.util.Scanner;
 public class IT24103255Lab5Q3 {
   public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
  
        System.out.print("Enter Start Date (1-31): ");
        int startDay = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDay = input.nextInt();

        if (startDay < 1 || startDay > 31 || endDay < 1 || endDay > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        if (startDay >= endDay) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int daysReserved = endDay - startDay;
        double totalCost = daysReserved * 48000.00;

        if (daysReserved >= 3 && daysReserved <= 4) {
            totalCost = totalCost * 0.9; // 10% discount
        } else if (daysReserved >= 5) {
            totalCost = totalCost * 0.8; // 20% discount
        }

        System.out.println("\nRoom Charge Per Day: Rs. 48000.0/=");
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be paid: " + totalCost);

        input.close();
    }
}