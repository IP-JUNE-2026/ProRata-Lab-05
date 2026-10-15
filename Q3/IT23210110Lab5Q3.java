import java.util.Scanner;

public class IT23210110Lab5Q3{
          public static void main(String[] args){
		  Scanner sc = new Scanner(System.in);
		  
		  final double rCharge = 48000.00;
		  final double discount_10 = 0.10;
		  final double discount_20 = 0.20;
		  
		  System.out.println("Enter start date (1-31) :");
		  int startDate = sc.nextInt();
		  
		  System.out.println("Enter End date(1-31) :");
		  int endDate = sc.nextInt();
		  
		  if(startDate<1 || startDate>31 || endDate<1 || endDate>31){
		     System.out.println("Start date and end date cannot be less than 1 or greater than 31");
			 return;
			 }
			 
		  if(startDate>endDate){
		      System.out.println("Start date should be less than End date");
			  return;
			  }
			  
			  int days = endDate - startDate;
			  double total = rCharge * days;
			  double discount;
		  
		  if(days<3){
		     discount = 0;
		     System.out.println("No discount");
			 }
			 else if(days<=4){
			   discount = total * 0.10;
			 }
			 else{
			  discount = total * 0.20;
			  }
			 
			 double finalAmount = total - discount;
			 
			 System.out.println("Room charge per day : Rs."+rCharge);
			 System.out.println("Number of days reserved :"+days);
			 System.out.println("Total amount before discount : Rs."+total);
			 System.out.println("Discount :"+discount);
			 System.out.println("Total amount to be paid :"+finalAmount);
		  
		  }
		 }