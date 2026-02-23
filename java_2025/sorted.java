// sorted set
 
import java.util.SortedSet;
import java.util.TreeSet;
class sorted
{
	public static void main(String[] jns)
	{
		SortedSet<Integer> set=new TreeSet<>();
		
		set.add(92);
		set.add(96);
		set.add(32);
		set.add(29);
		set.add(01);
		set.add(78);
		
		System.out.println(set);
		System.out.println("first element:"+ set.first());
		System.out.println("last element:"+ set.last());
	}
}