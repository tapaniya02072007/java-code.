//static member

class stat_memb
{
	public static int sum(int a, int b)
	{
		return a+b;
	}
}
class static_member
{
	public static void main(String[] args)
	{
		int n=33, m=66;
		int j=stat_memb.sum(n,m);
		System.out.println("sum is:-"+j);
	}
}