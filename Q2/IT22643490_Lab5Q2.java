import java.util.Scanner;

public class IT22643490_Lab5Q2 {

    public static void main(String[]args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.println("input the number of new members");

        int a = sc1.nextInt();

        if (a >= 0) {

            switch (a) {

            case 0:

                System.out.println("No Prize");
                break;

            case 1:

                System.out.println("Pen");
                break;

            case 2:

                System.out.println("Umbrella");
                break;

            case 3:

                System.out.println("Bag");
                break;

            case 4:

                System.out.println("Travelling Chair");
                break;

           
            default:
                System.out.println("Headphone");

            }
        } else {
			System.out.println("Enter the number that greater than or equal to zero");
			
		}

    }

}
