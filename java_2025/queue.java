// queue

import java.util.Queue;
import java.util.PriorityQueue;
class queue
{
	public static void main(String[] args)
	{
		Queue <Integer> q=new PriorityQueue<>();
		
		q.add(2);
		q.add(22);
		q.add(21);
		q.add(26); 
		q.add(32);
		q.add(20);
		
		System.out.println(q);
	}
}