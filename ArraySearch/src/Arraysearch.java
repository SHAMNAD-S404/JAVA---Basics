import java.util.Scanner;

public class Arraysearch {
public static void main(String ah[])
{
	Scanner input=new Scanner(System.in);
	int i,flag=0,searchkey;
	System.out.println("ENTER THE SIZE OF ARRAY :");
	int size=input.nextInt();
	int values[]=new int[100];
	System.out.println("ENTER THE VALUES :");
	for(i=0;i<size;i++)
	{
		values[i]=input.nextInt();
	}
	System.out.println("ENTER THE VALUE YOU WANT TO SEARCH :");
	searchkey=input.nextInt();
	for(i=0;i<size;i++)
	{
		if(searchkey==values[i])
		{
			flag=1;
			break;
		}
	}
	if(flag==1)
	{
		int key=i+1;
		System.out.println("THE SEARCH VALUE FOUND AT THE POSITION OF "+key);
	}
	else
	{
		System.out.println("VALUE NOT FOUND YET !!!");
	}
	
}

}
