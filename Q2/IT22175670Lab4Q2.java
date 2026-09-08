import java.util.Scanner;

public class IT22175670Lab4Q2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
        double exam_marks, lab_marks, precentage_exam, precentage_lab, final_mark ;
		
		
            System.out.print("Please enter the exam marks (out of 100):");
		    exam_marks = input.nextDouble();
			if (exam_marks<0 || exam_marks>100) {
				System.out.println("Invalid input for exam marks. Terminating program.");
				return;
			}
			
			System.out.print("Please enter lab submission marks (out of 100):");
			lab_marks = input.nextDouble();
            if (lab_marks<0||lab_marks>100) {
				System.out.println("Invalid input for lab marks. Terminating program.");
				return;
			}
			
			System.out.print("Please enter the precentage given for the exam :");
			precentage_exam = input.nextDouble();
			
			
			System.out.print("Please enter the precentage given for the lab submission :");
            precentage_lab = input.nextDouble();
			
			//calculation
			double precentage = precentage_exam + precentage_lab;
			
			if (precentage > 100)
			{
				System.out.print("The precentages must add up to 100. Terminating program.");
			}
			
			//calculation
			final_mark = (exam_marks*(precentage_exam/100)) + (lab_marks*(precentage_lab/100));
			
			System.out.println("Final exam marks :" + final_mark);
     }
}
			
			

 





