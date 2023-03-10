package conditionals;

public class Runner {

	public static void main(String[] args) {
		double d = 13;
		if (d > 10) {
			System.out.println("greater than ten");
		} else if (d > 0) {
			System.out.println("greater than zero");
		} else {
			System.out.println("less than zero");
		}

		boolean b = true;

		if (b) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		if (!b) {
			System.out.println("false");
		} else {
			System.out.println("true");
		}

		if ((d > 10 && d < 20) || b) {
			System.out.println("between 10 and 20");
		}
		if (b || d % 2 == 1) {
			System.out.println("super odd");
		}
		int day = 0;

		System.out.println(getDay(day));

	}

	public static String getDay(int num) {
		String day = "";
		switch (num) {
		case 0:
			day = "Sunday";
			break;
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		default:
			day = "INVALID";
		}

		return day;
	}

	public static String isEven(double d) {
		if (d % 2 == 0) {
			return "even";
		} else if (d % 2 == 1) {
			return "odd";
		} else {
			return "decimal";
		}
	}

	public static void print(String s) {
		if (s == null) {
			return;
		}
		System.out.println(s);
	}

}
