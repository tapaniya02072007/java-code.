import java.util.Scanner;
class user_input
{
		public static void main(String[] args)
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Name : ");
		
			String str = s.nextLine();
			System.out.println("Enter Age :");
			
			int i = s.nextInt();
			s.close();
		}
}