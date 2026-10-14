import java.util.Scanner;

public class IT24104085Lab5Q3 {

    static final double ROOM_CHARGE_PER_DAY = 48000.0;
    static final int MIN_VALID_DATE = 1;
    static final int MAX_VALID_DATE = 31;
    static final double DISCOUNT_10_PERCENT = 0.1;
    static final double DISCOUNT_20_PERCENT = 0.2;
    
  public static void main(String[] args) {
     
    Scanner scanner = new Scanner(System.in);

    int StartDate, EndDate;
         
     System.out.print("Enter Start Date (1-31): ");
     StartDate = scanner.nextInt();
        
     System.out.print("Enter End Date (1-31): ");
     EndDate = scanner.nextInt( );

     if (StartDate >= MIN_VALID_DATE && StartDate <= MAX_VALID_DATE && EndDate >= MIN_VALID_DATE && EndDate <= MAX_VALID_DATE) {
            
            
     if (StartDate <= EndDate) {

        int numberOfDays = EndDate - StartDate ;
          System.out.print("\n");
           System.out.println("Room Charge Per Day: Rs."+ ROOM_CHARGE_PER_DAY);
           System.out.println("Number of day Reserved : " + numberOfDays);
        
        double TotalAmount = numberOfDays * ROOM_CHARGE_PER_DAY;

        double discountPercentage = 0;
        if (numberOfDays >= 3 && numberOfDays <= 4) {
            discountPercentage = DISCOUNT_10_PERCENT; 
        } else if (numberOfDays >= 5) {
            discountPercentage = DISCOUNT_20_PERCENT; 
        }

       double DiscountAmount = TotalAmount * discountPercentage;

       double finalAmount = TotalAmount - DiscountAmount;

       System.out.println("Total Amount to be paid: Rs " + finalAmount);
       
           }
         else{
           System.out.println("Error: Start Date must be less than End Date");
           }
            
           }
         else{
          System.out.println("Error: Days must be between 1 and 31");
            

          }

       }
}