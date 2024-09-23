import java.util.Scanner;

public class IfConditionPositive {
	public static void main(String a[]) 
	{
	Scanner num=new Scanner(System.in);
	System.out.println("ENTER A NUMBER :");
	int n1=num.nextInt();
	if(n1<0)
	{
		System.out.println("THE NUMBER IS NEGATIVE "+n1);
	}
	else
	{
		System.out.println("THE NUMBER IS POSITIVE "+n1);
		num.close();
	}
	}
	
}
