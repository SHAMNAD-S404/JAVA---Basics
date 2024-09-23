import java.util.Scanner;

public class FunctionSumofNum {
	public static void main(String a[])
	{
		Scanner number=new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
	int num=number.nextInt();
	int sum=0;
	for(int i=0;i<num;i++)
	{
		sum+=i;
	}
	System.out.println("TOTAL SUM :"+sum);
	number.close();
	}
	

}
