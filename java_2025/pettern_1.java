
//Java Program (using loop)
public class pettern_1
{
    public static void main(String[] args) 
	{

        for (int i = 1; i <= 5; i++) 
		{
            if (i == 1)
                System.out.println("1");
            else if (i == 2)
                System.out.println("10");
            else 
			{
                System.out.print("1");
                for (int j = 1; j <= i - 2; j++) 
				{
                    System.out.print("0");
                }
                System.out.println("1");
            }
        }

    }
}