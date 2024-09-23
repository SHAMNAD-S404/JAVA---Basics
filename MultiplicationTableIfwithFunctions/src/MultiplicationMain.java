import java.util.Scanner;
public class MultiplicationMain {
	public static void main(String cal[])
	{
		Scanner calc=new Scanner(System.in);
		System.out.println("ENTER THE 1ST NUMBER :");
		int num1=calc.nextInt();
		System.out.println("ENTER THE SECOND NUMBER :");
		int num2=calc.nextInt();
		Addittion ad=new Addittion();
		Substraction sub= new Substraction();
		Multiplication multi= new Multiplication();
		Division div=new Division();
		ad.foraddition(num1,num2);
		sub.forsubstraction(num1,num2);
		multi.formultiplication(num1,num2);
		div.fordiv(num1, num2);
		System.out.println("PRESS 1 FOR ADDITION \nPRESS 2 FOR SUBSTRACTION \nPRESS 3 FOR MULTIPLICATION \nPRESS 4 FOR DIVISION \nPRESS ONE NUMBER");
		int choice=calc.nextInt();
		calc.close();
		if(choice==1)
		{
			ad.display();
		}
		else if(choice==2)
		{
			sub.display();
		}
		else if(choice==3)
		{
			multi.display();
		}
		else if(choice==4)
		{
			div.display();
		}
		else
		{
			System.out.println("YOU ENTERED A WRONG CHOICE !!!");
		}
		
	}

}
