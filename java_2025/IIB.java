// IIB :- instance initialization block

public class IIB
{
	{
		System.out.println("instance initialization block execute");
	}	
	public IIB()
	{
		System.out.println("constructer execute");
	}
	public static void main(String[] args)
	{
		IIB obj1=new IIB();
		IIB obj2=new IIB();
	}
}