import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String ai[])
	{
		Scanner prime=new Scanner(System.in);
		
		System.out.println("ENTER THE NUMBER YOU WANT TO CHECK :");
		int i,flag=0;
		int number=prime.nextInt();
		prime.close();
		for(i=2;i<number/2;i++)
		{
			if(number%i==0)
			{
				flag=1;
				break;
			}
		}
		
		if(flag==0)
		{
			System.out.println("THE NUMBER IS PRIME ");
		}
		else
		{
			System.out.println("NOT A PRIME NUMBER !!!");
			
		}
			
		}
	
}
