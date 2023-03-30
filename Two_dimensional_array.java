public class Two_dimensional_array
{
	public static void main(String[] args)
	{
		int arr[][] = {{4,8,12},{6,12,18},{9,18,27}};

		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}