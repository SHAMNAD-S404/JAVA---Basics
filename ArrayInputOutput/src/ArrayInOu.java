import java.util.Scanner;

public class ArrayInOu {
public static void main(String iu[])
{
	Scanner input=new Scanner(System.in);
	System.out.println("ENTER THE ARRAY LIMIT :");
	int limit=input.nextInt();
	int a[]=new int[limit];
	System.out.println("ENTER THE VALUES");
	
	for(int i=0;i<limit;i++)
	{
		a[i]=input.nextInt();
	}
	System.out.println("YOU ENTERED VALUES ARE :");
	for(int i=0;i<limit;i++)
	{
		System.out.print("\t"+a[i]);
	}
	input.close();
	
}
}
