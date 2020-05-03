package returnType;

import java.util.ArrayList;

import org.testng.Assert;

public class ReturnMe {

	public static void main(String[] args) {

		// System.out.println(marks());
		// System.out.println(subjects());
		// test();
		// evenNumber();
		moreCharacter();
	}

	public static int marks() {

		int marks = 100;
		return marks;
	}

	public static String subjects() {

		String sub = "English";
		return sub;
	}

	public void testing() {

		int[] hello = { 1, 2, 3 };

		String[] say = { "A", "B" };

		ArrayList<String> a = new ArrayList<String>();
		a.add("a");
	}

	public static void test() {

		String hey = "MAAM";
		String sum = "";

		for (int i = hey.length() - 1; i >= 0; i--) {

			sum = sum + hey.charAt(i);

		}

		Assert.assertEquals(sum, hey);

	}

	public static void evenNumber() {

		int number = 12;

		for (int i = 2; i < number; i++) {

			if (number % i == 0) {

				System.out.println("Its not an even number");
			}

		}
		System.out.println("Even number");

	}

	public static void moreCharacter() {

		String[] days = { "Saturday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Sunday" };
		int max = 0;
		for (int i = 0; i < days.length; i++) {

			if (days[i].length() > max) {

				max = days[i].length();

			}

		}
		System.out.println(max);

	}

}
