import java.util.Scanner;
 public class IT24103255Lab5Q1{
  public static void main(String[] args) {
  
   Scanner input = new Scanner(System.in);

   System.out.print("Enter the first integer: ");
   int n1 = input.nextInt();

   System.out.print("Enter the second integer: ");
   int n2 = input.nextInt();

   System.out.print("Enter thr third integer: ");
   int n3 = input.nextInt();

   int max,min;

   if(n1 > n2) {
      max = n1;
      min = n2;
   } else {
      max = n2;
      min = n1;
   }

   if(n3 > max) { 
      max = n3;
   }

   if(n3 < min) {
      min = n3;
   }

   System.out.println("\nUser entered numbers are : " + n1 + " " + n2 + " " + n3);
   System.out.println("The smallest number is : " + min);
   System.out.println("The Largest number is : " + max);
 }
}