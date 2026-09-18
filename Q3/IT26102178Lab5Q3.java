import java.util.Scanner;

public class IT26102178Lab5Q3 {
public static void main (String args[]) {

final double ROOM_CHARGE_PER_DAY = 48000.00;
final double DISCOUNT_FOR_LESS_THAN_3_DAYS = 0.0;
final double DISCOUNT_FOR_3_TO_4_DAYS = 0.1;
final double DISCOUNT_FOR_5_OR_MORE_DAYS = 0.2;

int startdate, enddate, numofdays ;
double totalamount, discountrate ;

Scanner sc = new Scanner (System.in) ;
System.out.print ("Enter Start Date (1-31): ") ;
startdate = sc.nextInt() ;

System.out.print ("Enter End Date (1-31): ") ;
enddate = sc.nextInt() ;

if ((startdate < 0 || startdate > 31) || (enddate < 0 || enddate > 31)) {
System.out.println ("Error: Dates must be between 1 and 31") ;
return;
}

numofdays = enddate - startdate ;
if (numofdays < 0) {
System.out.println ("Error: Start Date must be less than End Date") ;
return;
}

System.out.println ("Room Charge Per Day: " + ROOM_CHARGE_PER_DAY ) ;
System.out.println ("Number of Days Reserved: " + numofdays) ;

discountrate = (numofdays < 3) ? DISCOUNT_FOR_LESS_THAN_3_DAYS :
                                  ((numofdays >= 3) && (numofdays <= 4)) ? DISCOUNT_FOR_3_TO_4_DAYS : DISCOUNT_FOR_5_OR_MORE_DAYS ;

totalamount = ROOM_CHARGE_PER_DAY * numofdays * discountrate ;
System.out.println ("Total Amount to be Paid: " + totalamount) ;

 sc.close();
}
}