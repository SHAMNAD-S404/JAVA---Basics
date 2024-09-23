import java.util.Scanner;

public class ArraySwaping {
public static void main(String as[])
{
	Scanner input=new Scanner(System.in);
	System.out.println("ENTER THE SIZE OF ARRAY :");
	int size=input.nextInt();
	int array1[]=new int[size];
	int array2[]=new int[size];
	int temp[]=new int[size];
	int i;
	System.out.println("ENTER THE VALUES IN ARRAY 1:");
	for(i=0;i<size;i++)
	{
		array1[i]=input.nextInt();
	}
	 	System.out.println("ENTER THE VALUES IN ARRAY 2:");
	
	for(i=0;i<size;i++)
	{
		array2[i]=input.nextInt();
	}
	
	System.out.print("\nARRAY BEFORE SWAPPING \nFIRST ARRAY :-");
	for(i=0;i<size;i++)
	{
		System.out.print("\t"+array1[i]);
	}
	System.out.print("\nSECOND ARRAY :-");
	for(i=0;i<size;i++)
	{
		System.out.print("\t"+array2[i]);
	}
	for(i=0;i<size;i++)
	{
		temp[i]=array1[i];
		array1[i]=array2[i];
		array2[i]=temp[i];
		
	}
	System.out.print("\nAFTHER ARRAY SWAPPED \nFIRST ARRAY :");
	for(i=0;i<size;i++)
	{
		System.out.print("\t"+array1[i]);
	}
	System.out.print("\nSECOND ARRAY :");
	for(i=0;i<size;i++)
	{
		System.out.print("\t"+array2[i]);
	}
	
	
}
}
