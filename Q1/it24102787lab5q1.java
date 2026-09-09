import java.util.Scanner;
public class it24102787lab5q1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        System.out.print("Enter third integer: ");
        int n3 = input.nextInt();

       System.out.println("user entered numbers are : "+n1+" "+n2+" "+n3);

       int smallest = Math.min(n1,Math.min(n2,n3));
       int largest = Math.max(n1,Math.max(n2,n3));

       System.out.println("smallest number is "+smallest);
       System.out.println("largest number is "+largest);

       input.close();


    }


}