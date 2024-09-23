import java.util.Scanner;

public class ArraySort {
public static void main(String ai[])
{
	Scanner input=new Scanner(System.in);
	int i,j;
	int temp[]=new int[100];
	System.out.println("ENTER THE SIZE OF ARRAY :");
	int size=input.nextInt();
	int values[]=new int[100];
	System.out.println("ENTER THE VALUES :");
	for(i=0;i<size;i++)
	{
		values[i]=input.nextInt();
	}
	for(i=0;i<size-1;i++)
	{
		for(j=i+1;j<size;j++)
		{
			if(values[i]>values[j])
			{
				temp[i]=values[i];
				values[i]=values[j];
				values[j]=temp[i];
			}
		}
		
	}
	System.out.println("THE SORTED VALUES ARE :");
	for(i=0;i<size;i++)
	{
		System.out.print("\t"+values[i]);
	}
	
	
	
}
}
