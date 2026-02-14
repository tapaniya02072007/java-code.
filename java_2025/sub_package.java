// user define sub package

package computer.domestic;
public class sub_package
{
	public void cpu()
	{
		System.out.println("computer cpu");
	}
	public void dvd()
	{
		System.out.println("computer dvd");
	}
	public static void main(String[] jns)
	{
		sub_package m=new sub_package();
		m.cpu();
		m.dvd();
	}
}