package sampleedd;

import java.util.Scanner;

public class HelloSample {
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("ENTER 1st NUMBER :");	
		int n1=s.nextInt();
		System.out.println("ENTER 2nd NUMBER :");	
		int n2=s.nextInt();
		int sum=n1+n2;
		System.out.println("RESULT :"+sum);
	}

}
