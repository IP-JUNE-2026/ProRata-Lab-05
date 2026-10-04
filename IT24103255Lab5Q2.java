import java.util.Scanner;
 public class IT24103255Lab5Q2 {
  public static void main(String[] args) {

   //Create an object called input to an Scanner class
   Scanner input = new Scanner(System.in);

   System.out.println("Enter the number of new members introduced: ");
   int count = input.nextInt();

   if(count<0) {
    System.out.println("Input must be a number 0 or greater");
   } else {
   if(count==0) {
    System.out.println("Prize is a : No prize");
   } else if(count==1) {
    System.out.println("Prize is a : Pen");
   } else if(count==2) {
    System.out.println("Prize is a : Umbrella");
   } else if(count==3) {
    System.out.println("Prize is a : Bag");
   } else if(count==4) {
    System.out.println("Prize is a : Travelling bag");
   } else if(count>=5) {
    System.out.println("Prize is a : Headphone");
   }
  }
 }
}
