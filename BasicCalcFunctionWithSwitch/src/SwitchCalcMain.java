import java.util.Scanner;

public class SwitchCalcMain {
	public static void main(String ai[])
	{
	Scanner calc=new Scanner(System.in);
	Mathfun calculator=new Mathfun();
	int choice;
	
		System.out.println("PRESS 1 FOR ADDITION \nPRESS 2 FOR SUBSTRACTION \nPRESS 3 FOR MULTIPLICATION \nPRESS 4 FOR DIVISION \nENTER A CHOICE");
		choice=calc.nextInt();
		
		switch(choice)
		{
		case 1:
			calculator.addition();
			break;
		case 2:
			calculator.substraction();
			break;
		case 3:
			calculator.multiplication();
			break;
		case 4:
			calculator.division();
			break;
			default:
				System.out.println("YOU ENTERD A WRONG CHOICE !!!!");
				break;
		}
	calc.close();
	
	}

}
