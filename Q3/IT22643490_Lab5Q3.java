import java.util.Scanner;

public class IT22643490_Lab5Q3 {

    public static void main(String[]args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter the start date(1-31):");

        int start = sc1.nextInt();
		if(start>1 && start <31){
			
			
		}else{
			System.out.println("start date should be between the 1-31 rage");
			
		}
		
		

        System.out.println("Enter the end date(1-31):");

        int end = sc1.nextInt();
		
		if(end>1 && end <31){
			
			
		}else{
			System.out.println(" end date should be between the 1-31 rage");
			
		}
		

        int totaldays = end - start;

        if (start < end) {

            double roomcharge = 48000.00;

            double discount = 00;

            if (totaldays < 3) {
                System.out.println("No discount");

            } else if (totaldays <= 4 && totaldays >= 3) {
                System.out.println("10");
                discount = 10.00;

            } else if (totaldays >= 5) {
                System.out.println("20");
                discount = 20.00;

            }

            System.out.println("Number of days" + totaldays);

            System.out.println("Total amount of to be paid " + ((totaldays * roomcharge) - ((totaldays * roomcharge) * discount / 100)));

        }else{
			System.out.println("Enter the start date should less than the end date");
			
		}

    }

}
