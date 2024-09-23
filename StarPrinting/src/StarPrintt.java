import java.util.Scanner;

public class StarPrintt {
public static void main(String pt[])
{
	Scanner input=new Scanner(System.in);
	System.out.println("ENTER THE LIMIT :");
	int limit=input.nextInt();
	input.close();
	for(int i=1;i<=limit;i++)
	{
		for(int j=0;j<i;j++)

		{
			System.out.print(" *");
		}
		System.out.print("\n");
	}
}
}
