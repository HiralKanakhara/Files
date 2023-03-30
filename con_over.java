class con_over
{
	int id;
	String name;
	int rollno;
	con_over(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	con_over(int id,String name,int rollno)
	{
		this.id = id;
		this.name = name;
		this.rollno = rollno;
	}
	void display()
	{
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Rollno : "+ rollno);
	}
	public static void main(String[] args)
	{
		con_over obj1 = new con_over(101,"Hiral");
		obj1.display();
		con_over obj2 = new con_over(102,"Jinal",36);
		obj2.display();
	}
}