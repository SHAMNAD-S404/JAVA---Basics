
public class B extends A {
	int a;
	void display()
	{
		System.out.println("ITS B CLASS");
		  a=100;
		  super.a=200;
		  int c=a+super.a;
		  System.out.println("sum"+c);
	}
	void basedisplay()
	{
		super.display();
	}
	B()
	{
		System.out.println("ITS B CONSTRUCTER");
	}
	B(int a)
	{
		super(15);
		System.out.println("ITS B ARGUMENT CONSTRUCTER");
	}
	public static void main(String[] args) {
		B s=new B();
		//s.display();
		//s.basedisplay();
		
		
	}

}
