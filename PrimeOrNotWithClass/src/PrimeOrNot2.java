import java.util.Scanner;

public class PrimeOrNot2 {
public static void main(String ai[])
{
	Scanner prime=new Scanner(System.in);
	System.out.println("ENTER THE NUMBER YOU WANT TO CHECK :");
	int number=prime.nextInt();
	primeclass as=new primeclass();
	as.primechecker(number);
	prime.close();
}
}
