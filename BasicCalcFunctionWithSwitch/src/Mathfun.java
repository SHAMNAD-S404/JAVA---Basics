import java.util.Scanner;

public class Mathfun {
public void addition()
{
	Scanner input=new Scanner(System.in);
	System.out.println("ENTER 1ST DIGIT :");
	int num1=input.nextInt();
	System.out.println("ENTER 2ND DIGIT :");
	int num2=input.nextInt();
	int result=num1+num2;
	System.out.println("RESULT :"+result);
	
}
public void substraction()
{
	Scanner input=new Scanner(System.in);
	System.out.println("ENTER 1ST DIGIT :");
	int num1=input.nextInt();
	System.out.println("ENTER 2ND DIGIT :");
	int num2=input.nextInt();
	int result=num1-num2;
	System.out.println("RESULT :"+result);	
}
public void multiplication()
{
	Scanner input=new Scanner(System.in);
	System.out.println("ENTER 1ST DIGIT :");
	int num1=input.nextInt();
	System.out.println("ENTER 2ND DIGIT :");
	int num2=input.nextInt();
	int result=num1*num2;
	System.out.println("RESULT :"+result);
}
public void division()
{
	Scanner input=new Scanner(System.in);
	System.out.println("ENTER 1ST DIGIT :");
	int num1=input.nextInt();
	System.out.println("ENTER 2ND DIGIT :");
	float num2=input.nextFloat();
	float result=num1/num2;
	System.out.println("RESULT :"+result);
}
}
