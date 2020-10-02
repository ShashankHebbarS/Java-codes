import java.util.Scanner;

public class prime 
{

	
	public static void main(String[] args) 
	{
		System.out.println("Enter a number: ");
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		boolean flag = false;
		for(int i=2;i<=n/2;++i)
		{
			if(n%i==0)
			{
				flag = true; 
				break;
			}
		}if(flag == false)
			{
			System.out.println("PRIME");
			}
		else
			System.out.println("NOT PRIME");
	}

}
