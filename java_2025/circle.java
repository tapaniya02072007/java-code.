class circle
{
	String model;
	int year;
	circle()
	{
		year=2006;
		model="alpha";
	}
	circle(int year)
	{
		this.year=year;
		model="beta";
	}
	circle(int year, String model)
	{
		this.year=year;
		this.model=model;
	}
	void display()
	{
		System.out.println("year=="+year+"model=="+model);
	}
	public static void main(String[] args)
	{
		circle c1=new circle();
		circle c2=new circle(2007);
		circle c3=new circle(2008,"gamma");
		
		c1.display();
		c2.display();
		c3.display();
	}
}