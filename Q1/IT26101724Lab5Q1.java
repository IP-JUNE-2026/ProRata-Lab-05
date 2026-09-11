import java.util.Scanner;
public class IT26101724Lab5Q1{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the first integer:");
	int value_1=sc.nextInt();
	
	System.out.print("Enter the second integer:");
	int value_2=sc.nextInt();
	
	System.out.print("Enter the third integer:");
	int value_3=sc.nextInt();
	
	System.out.println();
	
	System.out.println("User entered numbers are:" +value_1+" "+value_2+" "+value_3);
	
	if(value_1 < value_2 && value_1 < value_3){
	   System.out.println("The Smallest number is:"+ value_1);
	}
	
	else if(value_2 < value_1 && value_2 < value_3){
		   System.out.println("The Smallest number is:"+ value_2);
	}
	
	else if(value_3 < value_1 && value_3 < value_2){
		    System.out.println("The Smallest number is:"+ value_3);
	}
	
	if(value_1 > value_2 && value_1 > value_3){
	   System.out.println("The Largest number is:"+ value_1);
	}
	
	else if(value_2 > value_1 && value_2 > value_3){
		   System.out.println("The Largest number is:"+ value_2);
	}
	
    else if(value_3 > value_1 && value_3 > value_2){
		    System.out.println("The Largest number is:"+ value_3);
	}	   
  }
}