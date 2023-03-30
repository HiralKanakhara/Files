class A {
}

public class Instanceof {
	public static void main(String[] args) {
		A objA = new A();
		// B objB = new B();
		if (objA instanceof A) {
			System.out.println("ObjA is an instance of class A");
		} else {
			System.out.println("ObjB is an instance of class B");
		}
	}
}
