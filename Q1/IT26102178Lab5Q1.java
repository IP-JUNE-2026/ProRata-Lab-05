import java.util.Scanner;

public class IT26102178Lab5Q1 {
     public static void main (String args[]) {
        int num1, num2, num3 ;
 
         Scanner sc = new Scanner(System.in);

         System.out.print ("Enter the first integer: ");
		   num1 = sc.nextInt(); 

         System.out.print ("Enter the second integer: ");
		   num2 = sc.nextInt(); 

         System.out.print ("Enter the third integer: ");
		   num3 = sc.nextInt(); 

         int smallest = Math.min (num1, Math.min (num2, num3)); 
         int largest = Math.max (num1, Math.max (num2, num3));             

         System.out.println ("User entered numbers are : " + num1 +" " + num2 +" " + num3) ;
         System.out.println ("The Smallest number is: " + smallest ) ;
         System.out.println ("The Largest number is: " + largest ) ; 
         
         sc.close();
     }
   }