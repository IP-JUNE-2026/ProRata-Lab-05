import java.util.Scanner;
public class IT24101871Lab5Q2 {
	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of new members introduced: ");
		int numberOfMembers = input.nextInt();
		if (numberOfMembers < 0) {
			System.out.println("Input must be a number 0 or greater");
		}
		else {
			switch (numberOfMembers) {
				case 0 :
					System.out.println("\nNO Prize");
					break;
				case 1 :
					System.out.println("\nPrize is a : Pen");
					break;
				case 2 :
					System.out.println("\nPrize is a : Umbrella");
					break;
				case 3 :
					System.out.println("\nPrize is a : Bag");
					break;
				case 4 :
					System.out.println("\nPrize is a : Travelling Chair");
					break;
				default:
					System.out.println("\nPrize is a : Headphone");
			}		
		}
		
		
	}
}