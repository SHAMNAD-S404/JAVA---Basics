import java.util.Scanner;

public class ArrayEvCount {
public static void main(String pq[])
{
	Scanner input=new Scanner(System.in);
	System.out.println("ENTER THE SIZE OF ARRAY :");
	int limit=input.nextInt();
	int a[]=new int[limit];
	int i,odd = 0,even=0;
	System.out.println("ENTER THE VALUES :");
	for(i=0;i<limit;i++)
	{
		a[i]=input.nextInt();
	}
	for(i=0;i<limit;i++)
		
	{
		if(a[i]%2==0)
			even++;
			else
			odd++;
			
	}
	
	System.out.println("EVEN NUMBERS IN ARRAY :"+even);
	System.out.println("ODD NUMBERS IN ARRAY :"+odd);
}
}
