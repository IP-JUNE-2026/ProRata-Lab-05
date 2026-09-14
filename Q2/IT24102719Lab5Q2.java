import java.util.Scanner;

public class IT24102719Lab5Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of new members introduced: ");
        int members = sc.nextInt();

        System.out.println();

        if (members < 0) {
            System.out.println("Input must be a number 0 or greater");
        } else {
            // Cap at 5 for the switch, since 5 or more all get the same prize
            int switchValue = (members >= 5) ? 5 : members;

            switch (switchValue) {
                case 0:
                    System.out.println("No Prize");
                    break;
                case 1:
                    System.out.println("Prize is a : Pen");
                    break;
                case 2:
                    System.out.println("Prize is a : Umbrella");
                    break;
                case 3:
                    System.out.println("Prize is a : Bag");
                    break;
                case 4:
                    System.out.println("Prize is a : Travelling Chair");
                    break;
                case 5:
                    System.out.println("Prize is a : Headphone");
                    break;
            }
        }

        sc.close();
    }
}