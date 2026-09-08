import java.util.Scanner;

public class IT23240506Lab5Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int n1 = sc.nextInt();

        System.out.print("Enter the second integer: ");
        int n2 = sc.nextInt();

        System.out.print("Enter the third integer: ");
        int n3 = sc.nextInt();

        int max = n1;
        if (n2 > max) {
            max = n2;
        }
        if (n3 > max) {
            max = n3;
        }

        int min = n1;
        if (n2 < min) {
            min = n2;
        }
        if (n3 < min) {
            min = n3;
        }

        System.out.println("");
        System.out.println("User entered numbers are : " + n1 + " " + n2 + " " + n3);
        System.out.println("The Smallest number is: " + min);
        System.out.println("The Largest number is: " + max);

    }
}