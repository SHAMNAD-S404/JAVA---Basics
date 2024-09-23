import java.util.Scanner;

public class DayPrint {
 public static void main(String dy[])
 {
	 System.out.println("ENTER DAY NUMBER BW 1-7 :");
	 Scanner input=new Scanner(System.in);
	 int day=input.nextInt();
	 input.close();
	 switch(day)
	 {
	 case 1:
		 System.out.println("SUNDAY");
		 break;
	 case 2:
		 System.out.println("MONDAY");
		 break;
	 case 3:
		 System.out.println("TUESDAY");
		 break;
	 case 4:
		 System.out.println("WEDNESDAY");
		 break;
	 case 5:
		 System.out.println("THURSDAY");
		 break;
	 case 6:
		 System.out.println("FRIDAY");
		 break;
	 case 7:
		 System.out.println("SATURDAY");
		 break;
	 default:
		 System.out.println("ENETERED A INVALIDE NUMBER !!!");
		 
	 }
 }
}
