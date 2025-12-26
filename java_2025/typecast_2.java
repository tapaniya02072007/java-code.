class typecast_2
{
	public static void main(String[] args)
	{
		double d = 100.245;
		int i = (int)d;
		String s = String.valueOf(i);
		System.out.println("Original Value before Casting : " + d);
		System.out.println("Before Casting to Integer " + i);
		System.out.println("Before Casting to String " + s);
	}
}