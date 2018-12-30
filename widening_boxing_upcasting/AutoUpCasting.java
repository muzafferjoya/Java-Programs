package widening_boxing_upcasting;

public class AutoUpCasting {

	static void overload(Number N) {
		System.out.println("Number class type");
	}

	static void overload(Double D) {
		System.out.println("double class type");
	}

	static void overload(Long L) {
		System.out.println("Long class type");
	}

	public static void main(String[] args) {
		int i = 10;
		overload(i);

	}

}
