//nested outer type

class outer_clas
{
	static int outer_x=100;
	int outer_y=200;
	private int outer_private=300;
	static class staticNestedclass
	{
		void display(outer_clas o)
		{
			System.out.println("outer_x="+outer_x);
			System.out.println("outer_y="+o.outer_y);
			System.out.println("outer_private="+o.outer_private);
		}
	}
}
class nested_outer
{
	public static void main(String[] jns)
	{
          outer_clas outerObj = new outer_clas();
        outer_clas.staticNestedclass nestedObj =
                new outer_clas.staticNestedclass();

        nestedObj.display(outerObj);
	}
}
