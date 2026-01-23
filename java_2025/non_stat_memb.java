//non static member

class nsm
{
	public static int sum(int a, int b)
	{
		return a+b;
	}
}
class non_stat_memb
{
	public static void main(String[] args)
	{
		nsm n=new nsm();
		int a=n.sum(30,70);
		System.out.println(a);
	}
}