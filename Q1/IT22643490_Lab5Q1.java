
import java.util.Scanner;

public class IT22643490_Lab5Q1 {

    public static void main(String[]args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter the first number");

        int num1 = sc1.nextInt();

        System.out.println("Enter the second  number");

        int num2 = sc1.nextInt();

        System.out.println("Enter the third  number");

        int num3 = sc1.nextInt();

        int max = num1;

        if (num2 > max) {

            if (num2 > num3) {

                System.out.println("max number is " + num2);

            } else {
                System.out.println("max number is " + num3);
            }

        } else if (max > num3) {

            System.out.println("max number is " + num1);
        } else {
            System.out.println("max number is " + num3);
        }
		
		
		if (num2 < max) {

            if (num2 < num3) {

                System.out.println("min number is " + num2);

            } else {
                System.out.println("min number is " + num3);
            }

        } else if (max < num3) {

            System.out.println("min number is " + num1);
        } else {
            System.out.println("min number is " + num3);
        }
		
		
		

    }

}
