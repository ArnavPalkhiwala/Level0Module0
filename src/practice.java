public class practice {

	public static void main(String[] args) {

		int x = 31;
		String y = "Hello";
		System.out.println(checkWithCapitals(x, y));

	}

	static boolean checkIfEven(int x) {

		if (x % 2 == 0) {

			return true;

		}

		return false;

	}

	static String checkWithCapitals(int x, String y) {

		boolean s = checkIfEven(x);

		if (s == true) {

			return y.toUpperCase();

		}

		else {

			String z = "";

			for (int i = y.length() - 1; i >= 0; i--) {

				z = z + y.charAt(i);

			}

			return z;

		}

	}

}
