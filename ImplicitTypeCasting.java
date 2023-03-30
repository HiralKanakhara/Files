public class ImplicitTypeCasting
{
	public static void main(String[] args)
	{
		int int_num = 100;
		System.out.println("Integer = " + int_num);

		long long_num = int_num;
		System.out.println("Long number = " + long_num);

		float float_num = long_num;
		System.out.println("Float number = " + float_num);
	}
}