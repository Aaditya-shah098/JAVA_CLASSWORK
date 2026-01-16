public class Throws {

	public static void main(String[] args) {
		try {
			checkAge(15);
		} catch (IllegalArgumentException e) {
			System.out.println("Caught exception: " + e.getMessage());
		}
	}

	static void checkAge(int age) {
		if (age < 18) {
			throw new IllegalArgumentException("Age must be >= 18");
		}
		System.out.println("Age OK: " + age);
	}

}
