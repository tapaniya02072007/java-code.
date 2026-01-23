class student_name
{
	String name="jenu";
	int age=21;
	
	public String toString()
	{
		return "student{name='"+name+"',age="+age+"}";
	}
	public static void main(String[] args)
	{
		student_name s=new student_name();
		System.out.println(s);
	}
}