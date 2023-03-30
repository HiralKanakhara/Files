class par_con
{
	String name;
	int rollno;
	par_con(String name,int rollno)
	{
		this.name = name;
		this.rollno = rollno;
	}
	void display()
	{
		System.out.println("Name : " + name);
		System.out.println("Roll no : " + rollno);
	}
	public static void main(String[] args)
	{
		par_con obj = new par_con("Hiral",30);
		obj.display();
	}
}
