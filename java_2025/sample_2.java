// basic for exception handaling

class sample_2
{
	public static void main(String[] jns)
	{
		int a=3;
		int b=0;
		try
		{
			int ans=a/b;
			System.out.println(ans);
		}
		catch(Exception e)
		{
			System.out.println("something went critical"+e);
		}
	}
}