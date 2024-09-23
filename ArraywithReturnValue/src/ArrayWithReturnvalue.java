import java.util.Scanner;

public class ArrayWithReturnvalue {
	public static void main(String ai[])
{
	Scanner input=new Scanner(System.in);
	int result;
	result=sum();
	System.out.println(" "+result);
}
 static int sum()
 {
	 Scanner inp2=new Scanner(System.in);
	 int n2,sum;
	 System.out.println("enter 2 no:");
	 int n1=inp2.nextInt();
	 n2=inp2.nextInt();
	 sum=n1+n2;
	 return sum;
	 
 }
}
