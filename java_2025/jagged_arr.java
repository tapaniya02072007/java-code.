import java.util.Arrays;
class jagged_arr
{
	public static void main(String[] args)
	{
		int[][] jt=new int[2][];
		jt[0]=new int[3];
		jt[0][0]=10;
		jt[0][1]=50;
		jt[1]=new int[2];
		jt[1][0]=30;
		
		System.out.println(Arrays.deepToString(jt));
	}
}