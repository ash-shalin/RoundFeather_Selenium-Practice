package strings;

public class ImmutableString {

	public static void main(String[] args) {
		String str = "Hello"; // Creating a string object

		System.out.println("Original String: " + str);

		// Concatenating another string
		String c = str + " World"; // This doesn't modify the original string, but creates a new one

		System.out.println("Modified String: " + c);
		System.out.println(str.concat("hello"));
		System.out.println(str);
	}

}
