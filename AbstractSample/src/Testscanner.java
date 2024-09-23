
public class Testscanner {
	Hello obj;
	public Testscanner(Hello obj) {
		this.obj=obj;
		
	}
	void scan()
	{
		String text="Scanned text !";
		obj.onText(text);
	}

}
