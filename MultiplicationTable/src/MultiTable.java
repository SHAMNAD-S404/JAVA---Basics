import java.util.Scanner;

public class MultiTable {
public static void main(String ai[])
{
	System.out.println("ENTER A NUMBER :");
	Scanner input=new Scanner(System.in);
	int i;
	int num=input.nextInt();
	System.out.println("MULTIPLICATION TABLE OF "+num);
	input.close();
	for(i=1;i<=12;i++)
	{
		System.out.println(" "+i+"X"+num+"= "+num*+i);
	}
}
}
