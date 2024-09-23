import java.util.Scanner;

public class FunctionWithArgumenfReturnValue {
public static void main(String a[])
{
	System.out.println("ENTER THE TWO NUMBERS :");
	Scanner fn=new Scanner(System.in);
	int num1=fn.nextInt();
	int num2=fn.nextInt();
	int result=sum(num1,num2);
	System.out.println("RESULT :"+result);
}
	static int sum(int n1,int n2)
	{
		int total=n1+n2;
		return total;
	}
}
