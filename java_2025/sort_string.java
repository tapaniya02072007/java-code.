import java.util.Arrays;

public class sort_string
{
    public static void main(String[] args) 
	{

        // Check if at least one string is provided
        if (args.length == 0) 
		{
            System.out.println("Please provide some strings as command-line arguments.");
            return;
        }

        // Sort the array alphabetically
        Arrays.sort(args);

        // Display the sorted strings
        System.out.println("Strings in alphabetical order:");
        for (String str : args) {
            System.out.println(str);
        }
    }
}