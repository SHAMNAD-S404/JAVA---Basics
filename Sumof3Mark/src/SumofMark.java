import java.util.Scanner;

public class SumofMark {
	public static void main(String ai[]) 
	{
		Scanner mark=new Scanner(System.in);
		System.out.println("ENTER THE MARK 1 :");
		int mark1=mark.nextInt();
		System.out.println("ENTER THE MARK 2 :");
		int mark2=mark.nextInt();
		System.out.println("ENTER THE MARK 3 :");
		int mark3=mark.nextInt();
		mark.close();
		int tottal=mark1+mark2+mark3;
		System.out.println("TOTTAL MARK SCORED :"+tottal);
	}

}
