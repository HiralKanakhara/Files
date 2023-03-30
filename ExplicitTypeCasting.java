public class ExplicitTypeCasting
{
	public static void main(String[] args)
	{
		double d_num = 100.54;
		System.out.println("Double number = " + d_num);

		float f_num = (float)d_num;
		System.out.println("Float number = " + f_num);

		long l_num = (long)f_num;
		System.out.println("Long number = " + l_num);

		int i_num = (int)l_num;
		System.out.println("Integer number = " + i_num);
	}
}