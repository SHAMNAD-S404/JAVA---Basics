
public class Devside extends Hello{

	void onText(String Text) 
	{
	System.out.println(Text);
	}
	Devside()
	{
		Testscanner ts=new Testscanner(this);
		ts.scan();
	}
	public static void main(String[] args) {
		Devside ds=new Devside();
		}
	

}
