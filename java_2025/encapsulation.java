class area
{
	int lergth;
	int breadth;
	void getdata()
	{
		int a=lergth*breadth;
		System.out.println("Rectangle +a area");
	}
}
class encapsulation
{
	public static void main(String[] args)
	{
		area ob=new area();
		ob.lergth=5;
		ob.breadth=7;
		ob.getdata();
	}
}