class ifsts
{
	public static void main(String[] args)
	{
		String name[]={"abc","pwd","xyz"};
		int roll[]={1,2,3};
		
		if(name[0]=="abc"&&roll[0]==1)
		{
			System.out.println("info about abc");
		}
		else if(name[1]=="pwd"&&roll[0]==2)
		{
			System.out.println("info about pwd");
		}
		else if(name[0]=="xyz"&&roll[1]==3)
		{
			System.out.println("info about xyz");
		}
		else
		{
			System.out.println("incorrect");
		}
	
	}
}
