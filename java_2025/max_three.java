import java.util.Arrays;
import java.util.Scanner;

class max_three 
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

        Arrays.sort(a);   // numbers sort kare che

        System.out.println("Max1: " + a[9]); // largest
        System.out.println("Max2: " + a[8]); // second largest
        System.out.println("Max3: " + a[7]); // third largest
    }
}