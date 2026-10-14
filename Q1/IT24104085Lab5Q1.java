import java.util.Scanner;

public class IT24104085Lab5Q1 {
 
  public static void main(String[] args) {
  
   int numberOne , numberTwo ,numberThree ,smallest , largest;
   
Scanner input =new Scanner(System.in);

System.out.println("Enter the first integer: ");
numberOne = input.nextInt();

System.out.println("Enter the second integer: ");
numberTwo = input.nextInt();

System.out.println("Enter the third integer:");
numberThree = input.nextInt();

smallest = numberOne;
largest = numberOne;

 if (numberTwo < smallest) {
   smallest = numberTwo;
}
 if (numberTwo >largest) {
   largest = numberTwo; 

}

 if (numberThree < smallest) {
    smallest = numberThree;
}

 if (numberThree > largest) {
   largest = numberThree;
}

  System.out.println();
  System.out.println("User entered number are : " + numberOne + " " + numberTwo + " " + numberThree );
  System.out.println("The Smallest number is : " + smallest);
  System.out.println("The largesbnumber is: " + largest);

   }

}