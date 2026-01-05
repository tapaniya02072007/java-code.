public class sum_arr_recursion 
{

    static int findSum(int[] arr, int n) 
	{
        if (n == 0)
            return 0;

        return arr[n - 1] + findSum(arr, n - 1);
    }

    public static void main(String[] args) 
	{
        int[] arr = {1, 2, 3, 4, 5};

        int sum = findSum(arr, arr.length);
        System.out.println("Sum of array: " + sum);
    }
}