// stack

import java.util.Stack;
class stack_exmpl
{
	public static void main(String[] args)
	{
		Stack<Integer> s=new Stack<>();
		s.push(40);
		s.push(43);
		s.push(20);
		s.push(45);
		s.push(42);
		s.push(10);
		s.push(90);
		System.out.println(5);
		
		while(!s.isEmpty())
		{
			System.out.println(s.pop());
		}
	}
}