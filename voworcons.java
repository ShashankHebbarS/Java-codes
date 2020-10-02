import java.util.*;
public class voworcons 
{
	public static void main(String args[])
	{
		char[] array = {'a','e','i','o','u','A','E','I','O','U'};
		char ch;
		int i;
		boolean flag = false;
		
		System.out.println("Enter s value to check whether it is a vowel or consonant");
		Scanner scan = new Scanner(System.in);
		ch = scan.next().charAt(0);
		
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{	
			for(i=0;i<10;i++)
			{
				if(ch==array[i])
				{
					flag = true;
					break;
				}
		
			}

			if (flag==true)
			{
				System.out.println("VOWEL");
			}
			else if (flag == false)
			{
				System.out.println("CONSONANT");
			}

		}
		else
		{
			System.out.println("INVALID INPUT");
		}

		
	}
}
