public class Return {
	public static void main(String[] args) {
		maximum m = new maximum();
		int ans = m.max();
		System.out.println("The maximum of two numbers : " + ans);
	}
}

class maximum {
	int max() {
		int num1 = 10;
		int num2 = 20;
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
}
