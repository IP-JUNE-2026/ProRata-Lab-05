import java.util.Scanner;

public class IT23394124Lab5Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter The First Integer:");
        int first = input.nextInt();
          
        System.out.println("Enter The Second Integer:");
        int second = input.nextInt();
        
        System.out.println("Enter The Third Integer:");
        int third = input.nextInt();


        int smallest = Math.min(first, Math.min(second,third));
        int largest = Math.max(first, Math.max(second,third));

        System.out.println("User Enterd Numbers Are :"+first+""+second+""+third);
        System.out.println("Smallest Number is :"+smallest);
        System.out.println("Largest Number is:"+largest);

        input.close();
    }
}