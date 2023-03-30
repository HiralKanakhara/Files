class Add
{
	private int a,b;
	Add(Add A)
	{
		a=A.a;
		b=A.b;
	}
	Add(int x,int y)
	{
		a=x;
		b=y;
	}
	void sum()
	{
		int sum1=a+b;
		System.out.println("Sum of a and b :"+sum1);
	}
}
	class methodobj
	{
		public static void main(String arg[])
		{
			Add A=new Add(15,8);
			Add A1=new Add(A);
			A1.sum();
		}
	}