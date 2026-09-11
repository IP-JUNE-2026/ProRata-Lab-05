import java.util.Scanner;
public class IT26101724Lab5Q3{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	
	final double CHARGE_PER_DAY=48000.0;
	final double DISCOUNT_RATE1=0.1;
	final double DISCOUNT_RATE2=0.2;
	
	double Amount,Grand_total_1,Grand_total_2,Discount1,Discount2;
	int start_day,end_day,days;
	
	System.out.print("Enter Start Date(1-31):");
	start_day = sc.nextInt();
	
	System.out.print("Enter End Date(1-31):");
	end_day = sc.nextInt();
	
	if(start_day>=1 && start_day<=31 && end_day>=1 && end_day<=31){
		if(start_day<end_day){
			
			System.out.println();
			System.out.println("Room Charge Per Day: Rs." + CHARGE_PER_DAY + "/=");
			
			System.out.print("Number of Days Reserved:");
			
			days =sc.nextInt();
			
			Amount=(days*CHARGE_PER_DAY);
			
	        Discount1=(Amount*DISCOUNT_RATE1);
			
	        Grand_total_1=(Amount-Discount1);
			
	        Discount2=(Amount*DISCOUNT_RATE2);
			
	        Grand_total_2=(Amount- Discount2);
			
		    if(days<3){
			System.out.print("Total Amount to be Paid:"+Amount);
			return;
		    }
		    else if(days==3 || days==4){
			System.out.print("Total Amount to be Paid:"+Grand_total_1);
			return;
		    }
            else if(days>=5){
			System.out.print("Total Amount to be Paid:"+Grand_total_2);
			return;
		    }
		}
		    else{
			System.out.println("Error:Start Date muste be less than End Date");
			return;
	       }
	}
	 	
    else{
		System.out.println("Error:Days must be between 1 and 31");
		return;
		}
	}
}
	
 