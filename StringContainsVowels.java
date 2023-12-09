import java.util.*;

public class StringContainsVowels {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = scanner.nextLine();
		System.out.println(stringContainsVowels(s));
		scanner.close();
	}

	public static boolean stringContainsVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}

}