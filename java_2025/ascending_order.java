import java.util.Arrays;
import java.util.Scanner;

public class ascending_order 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) 
		{
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);   // sort in ascending order

        System.out.println("Numbers in ascending order:");
        for (int i = 0; i < 10; i++) 
		{
            System.out.print(a[i] + " ");
        }
    }
}