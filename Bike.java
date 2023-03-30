class Final
{
	final int speed = 90;
	void run()
	{
		System.out.println("Speed is " + speed);
	}
}
class Bike
{
	public static void main(String[] args)
	{
		Final obj = new Final();
		obj.run();
	}
}