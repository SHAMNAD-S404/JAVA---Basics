import java.util.Scanner;

public class PatternNum {
public static void main(String no[])
{
	Scanner input=new Scanner(System.in);
	System.out.println("ENTER THE LIMIT :");
	int limit=input.nextInt();
	for(int i=1;i<=limit;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" "+j);
		}
		System.out.print("\n");
	}
}
}
