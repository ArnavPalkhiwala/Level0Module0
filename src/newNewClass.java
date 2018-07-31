
public class newNewClass {

	public static void main(String[] args) {

		String I = "Hello";
		char H = 'o';
		System.out.println(practice(I, H));

	}

	static boolean practice(String A, char B) {

		for (int i = 0; i < A.length(); i++) {

			if (B == A.charAt(i)) {

				return true;

			}

		}
		return false;

	}
}
