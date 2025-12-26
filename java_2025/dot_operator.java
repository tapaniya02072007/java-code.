class person
{
		String name;
		int age;
}
public class dot_operator
{
	public static void main(String[] args)
	{
		person p = new person();
		p.name = "jenu tapaniya";
		p.age = 19;
		System.out.println("Name:" + p.name);
		System.out.println("Name:" + p.age);
	}
}