public class Unary_operators
{
	public static void main(String[] args)
	{
		int pos_num = +5;
		System.out.println("Positive number = " + pos_num);

		int neg_num =  -3;
		System.out.println("Negative number = " + neg_num);

		int pre_inc = ++pos_num;
		System.out.println("Pre-increment number = " + pre_inc);

		int post_inc = neg_num++;
		System.out.println("Post-increment number = " + post_inc);
		System.out.println("Post-incremented = " + post_inc);

		int pre_dec = --pos_num;
		System.out.println("Pre-increment number = " + pre_dec);

		int post_dec = neg_num--;
		System.out.println("Post-increment number = " + post_dec);
		System.out.println("Post-incremented = " + post_dec);

		boolean value = false;
		System.out.println("Value = " + value);
		System.out.println("!Value = " + !(value));
	}
}