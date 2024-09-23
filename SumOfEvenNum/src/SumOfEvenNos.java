import java.util.Scanner;

public class SumOfEvenNos {
	public static void main(String we[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("ENTER THE LIMIT NUMBER :");
		int limit=input.nextInt();
		int i,sum=0;
		input.close();
		for(i=2;i<=limit;i+=2)
		{
			sum+=i;
		}
		System.out.println("THE TOTAL SUM OF EVEN NUMBER TILL "+limit+" IS :"+sum);
		
	}

}
