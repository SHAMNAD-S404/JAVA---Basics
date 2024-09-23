import java.util.Scanner;

public class ifGrade {
 public static void main(String ma[])
 {
	 System.out.println("ENTER THE TOTAL SCORED MARK :");
	 Scanner input=new Scanner(System.in);
	 float mark=input.nextFloat();
	 input.close();
	 if(mark>=90)
	 {
		System.out.println("A GRADE WITH "+mark+" MARK"); 
	 }
	 else if(mark>=80)
	 {
		 System.out.println("B GRADE WITH "+mark+" MARK");
	 }
	 else if(mark>=70)
	 {
		 System.out.println("C GRADE WITH "+mark+" MARK");
	 }
	 else if(mark>=60)
	 {
		 System.out.println("D GRADE WITH "+mark+" MARK");
	 }
	 else if(mark>=50)
	 {
		 System.out.println("E GRADE WITH "+mark+" MARK");
	 }
	 else
	 {
		 System.out.println("YOU FAILED!!!!DONT LOSE HOPE TRY HARDER");
	 }
 }
}
