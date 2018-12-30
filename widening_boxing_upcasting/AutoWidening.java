package widening_boxing_upcasting;

public class AutoWidening {
	static void overloadMethod(Integer I) {
		System.out.println("Integer Wrapper class Type:");
	}

	static void overloadMethod(long l) {
		System.out.println("long primitive type");
	}

	public static void main(String[] args) {

		int i = 10;
		overloadMethod(i);
	}

}
