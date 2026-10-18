import java.util.Scanner;
public class  IT23648340LAb5Q1{
  public static void main(String[]args){

 Scanner input = new Scanner(System.in);
 System.out.print("enter a first integer:");
  int num1 =input.nextInt();
 System.out.print("enter a second integer:");
  int num2 =input.nextInt();
 System.out.print("enter a third integer:");
  int num3 =input.nextInt();
  int smallest =num1;
  int largest=num2;
  if(num2<smallest){
	  smallest =num2;
  }
  if(num3<smallest){
	  smallest =num3;
  }
  if(num2<largest){
	  largest =num2;
  }
  if(num3<largest){
	  largest =num3;
  }
  System.out.println("smallest number:" +smallest);
  System.out.println("largest number:" +largest);
  
  input.close();
  }
}
  