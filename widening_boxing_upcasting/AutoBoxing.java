package widening_boxing_upcasting;

public class AutoBoxing {

	static void overload(Integer I) {
		System.out.println("Integer wrapper class type:");
	}

	static void overload(Long L) {
		System.out.println("Long wrapper class type:");
	}

	public static void main(String[] args) {
		int i = 10;
		overload(i);

	}

}
