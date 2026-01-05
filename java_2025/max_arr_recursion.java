public class max_arr_recursion 
{

    static int findMax(int[] arr, int n) 
	{
        if (n == 1)
            return arr[0];

        return Math.max(arr[n - 1], findMax(arr, n - 1));
    }

    public static void main(String[] args) 
	{
        int[] arr = {3, 5, 2, 4, 1};

        int max = findMax(arr, arr.length);
        System.out.println("Maximum element: " + max);
    }
}