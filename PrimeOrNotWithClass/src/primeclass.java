
public class primeclass {
	int i;
	int flag=0;
	void primechecker(int num)
	{
		for(i=2;i<num/2;i++)
			
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("NUMBER IS PRIME ");
		}
		else
		{
			System.out.println("NOT A PRIME NUMBER !!!");
		}
	}

}
