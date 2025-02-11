public class PracticeProblem {

	public static void main(String[] args) {
		int add = sum(1, 8); 
		System.out.println(add);
		int minus = difference(1,8); 
		System.out.println(minus);
		double times = product(2.5,1.8);
		System.out.println(times);
		removeFirst("Hello");
		combinedLength("Yes", "No");
		isEven(7);
		isEven(8);
		isOdd(4);
		isOdd(5);
		isPositive(10);
		isPositive(-10);
		isNegative(10);
		isNegative(-10);

	}
	//q1
	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	//q2
	public static int difference(int num3, int num4) {
		int result = Math.abs(num3 - num4);
		return result;
	}

	//q3
	public static double product(double num5, double num6) {
		double result = num5 * num6;
		return result;
	}

	//q4
	public static void removeFirst(String word) {
		System.out.println(word.substring(1));
	}

	//q5
	public static void combinedLength(String word1, String word2){
		System.out.println(word1.length() + word2.length());
	}

	//q6
	public static boolean isEven(int num7) {
		boolean result = (num7 % 2 == 0);
		System.out.println(result);
		return true;
	}

	//q7
	public static boolean isOdd(int num8) {
		boolean result = (num8 % 2 == 1);
		System.out.println(result);
		return true;
	}

	//q8
	public static boolean isPositive(int num9) {
		boolean result = (num9 > 0);
		System.out.println(result);
		return true;
	}

	//q9
	public static boolean isNegative(int num10) {
		boolean result = (num10 < 0);
		System.out.println(result);
		return true;
	}
}
