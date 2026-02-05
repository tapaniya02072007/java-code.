//nested inner type

class outer_clas
{
	static int outer_x=100;
	int outer_y=200;
	private int outer_private=300;
	class innerclass
	{
		void display()
		{
			System.out.println("outer_x="+outer_x);
			System.out.println("outer_y="+outer_y);
			System.out.println("outer_private="+outer_private);
		}
	}
}
class nested_inner
{
	public static void main(String[] jns)
	{
		outer_clas outerobject = new outer_clas();          // outer object
        outer_clas.innerclass innerobject = outerobject.new innerclass(); // inner object
        innerobject.display();
	}
}
