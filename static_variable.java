class static_variable
{
	static int num = 30;
	static
	{
		System.out.println("Static block called");
	}
	public static void main(String[] args)
	{
		System.out.println("Value of num is " + num);
		System.out.println("from main");
	}
}