//default access specifier

class car
{
	String model;
}
public class car_model
{
	public static void main(String[] args)
	{
		car c=new car();
		c.model="tesla";
		System.out.println(c.model);
	}
}