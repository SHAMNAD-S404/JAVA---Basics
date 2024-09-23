import java.util.Scanner;

public class ObjectSum {
public static void main(String a[])
{
	Scanner number=new Scanner(System.in);
	System.out.println("ENTER 1ST DIGIT :");
	int numb1=number.nextInt();
	System.out.println("ENTER 2ND DIGIT :");
	int numb2=number.nextInt();	
	
	
	classSum obj1=new classSum();
	
	
	obj1.calculateSum(numb1, numb2);
	obj1.displaySum();
	number.close();
	
}

}
