class varargs
{
	static void display(String... values)
	{
		System.out.println("Display method invoked");
	}
	public static void main(String[] args)
	{
		display();
		display("hello","hi");
	}
}