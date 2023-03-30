public class mySquare {
	public static void main(String[] args) {
		Square obj = new Square();
		int ans = obj.volume(10);
		System.out.println("The volume of square is " + ans + " units");
	}
}

class Square {
	int volume(int length) {
		int vol = length * length * length;
		return vol;
	}
}
