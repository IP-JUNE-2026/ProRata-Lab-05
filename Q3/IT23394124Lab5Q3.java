import java.util.Scanner;

public class IT23394124Lab5Q3 {
    public static void main(String[] args) {

        final double chargerperday = 48000.00;
        final int minday = 1;
        final int maxday = 31;
        final double DISCOUNT_3_TO_4_DAYS = 10;
        final double DISCOUNT_5_OR_MORE_DAYS = 20;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Start date(1-31):");
        int startdate = input.nextInt();
 
        System.out.println("Enter the End date(1-31) :");
        int enddate = input.nextInt();

        if(startdate<minday || startdate>maxday || enddate<minday || enddate>maxday){
 
         System.out.println("Dates must be between 1 and 31. Terminating program.");
         return;

        }
        if (startdate >= enddate) {
            System.out.println("Start date must be less than the end date. Terminating program.");
            return;
        }
        
        int days = enddate - startdate ;
        double discountrate ;

        if (days < 3) {
            discountrate = 0;
        } else if (days <= 4) {
            discountrate = DISCOUNT_3_TO_4_DAYS;
        } else {
            discountrate = DISCOUNT_5_OR_MORE_DAYS;
        }

        double total = days * chargerperday;
        double discount = total * discountrate / 100;
        double amountToPay = total - discount;

        System.out.println();
        System.out.println("Number of days reserved: " + days);
        System.out.println("Discount rate: " + discountrate + "%");
        System.out.println("Total amount to be paid: Rs " + amountToPay);


        input.close();
    }
}