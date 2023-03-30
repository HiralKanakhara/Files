class Adder
{
	static int add(int num1,int num2)
	{
		return num1 + num2;
	}
	static int add(int num1, int num2, int num3)
	{
		return num1 + num2 + num3;
	}
}
class overload
{
	public static void main(String[] args)
	{
		System.out.println(Adder.add(11,11));
		System.out.println(Adder.add(11,11,11));
	}
}