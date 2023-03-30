/*

4. Write a java program to print following pattern.
*
* *
* * * 
* * * * 
* * * * *

*/

public class Pattern
{
	public static void main(String[] args)
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=5;j++)
			{
				System.out.println("*");
			}
				System.out.println(" ");
		}
	}
}