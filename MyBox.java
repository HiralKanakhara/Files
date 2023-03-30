public class MyBox {
	public static void main(String[] args) {
		Box obj = new Box();
		int ans = obj.volume();
		System.out.println("The volume of Box is " + ans + " units");
	}
}

class Box {
	int length = 10;
	int width = 10;
	int height = 10;

	int volume() {
		int vol = length * width * height;
		return vol;
	}
}
