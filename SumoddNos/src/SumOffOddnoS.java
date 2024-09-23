import java.util.Scanner;

public class SumOffOddnoS {
 public static void main(String ap[])
 {
	 System.out.println("ENTER THE LIMIT NUMBER :");
	 Scanner input=new Scanner(System.in);
	 int limit=input.nextInt();
	 int i, sum=0;
	 input.close();
	 for(i=1;i<=limit;i+=2)
	 {
		 sum+=i;
	 }
	 System.out.println("THE TOTAL SUM OF ODD NUMBER TILL "+limit+" IS :"+sum);
 }
}
