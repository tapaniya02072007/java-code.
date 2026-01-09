//method_overloading
class product
{
	public int multiply(int a, int b)
	{
		int prod=a*b;
		return prod;
	}
	public int multiply(int a, int b, int c)
	{
		int prod=a*b*c;
		return prod;
	}
	public static void main(String[] args)
	{
		product ob=new product();
		
		int prod1=ob.multiply(10,20);
		System.out.println("product of the two integer value:"+prod1);
		
		int prod2=ob.multiply(10,20,30);
		System.out.println("product of the three integer value:"+prod2);
	}
}