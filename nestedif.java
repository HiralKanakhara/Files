public class nestedif
{
	public static void main(String[] args)
	{
		int num=12;
		if(num == 0)
		{
			System.out.println("Number is zero");
		}
		else
		{
			if(num>0)
			{
				System.out.println("Number is positive");
			}
			else
			{
				System.out.println("Number is negative");
			}
		}
	}
}