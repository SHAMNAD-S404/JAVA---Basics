import java.util.Scanner;

public class EvenNoPrint {
 public static void main(String ev[])
 {
	 System.out.println("ENTER THE LIMIT NUMBER YOU WANT TO PRINT :");
	 Scanner input=new Scanner(System.in);
	 int limit=input.nextInt();
	 input.close();
	 for(int i=2;i<=limit;i++)
	 {
		 if(i%2==0)
		 {
			System.out.println(+i);
		 }
	 }
 }
}
