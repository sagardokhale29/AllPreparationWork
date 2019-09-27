import java.util.*;

class TestClass {

	public static void main(String[] args)  {

		TestClass t = new TestClass();
		Scanner sc = new Scanner(System.in);
		List<String> caseArray = new ArrayList<>();
		String numberOfTestCases = sc.nextLine();
		int noOfTestCases=t.validateTestCases(numberOfTestCases);
		for (int h = 0; h < noOfTestCases; h++) {
			caseArray.add(sc.nextLine());
		}

		sc.close();

		for (int i = 0; i < caseArray.size(); i++) {
			long whiteCounter = 0;
			long redCounter = 0;
			long greenCounter = 0;
			long counter = 0;
			String s = caseArray.get(i);
			String[] arr = s.split(" ");
			for (int j = 0; j < arr.length; j++) {
				long k = t.convertToLong(arr[j]);
				counter = counter + (k / 3);
				if (j == 0) {
					whiteCounter = whiteCounter + (k % 3);
				} else if (j == 1) {
					redCounter = redCounter + (k % 3);
				} else {
					greenCounter = greenCounter + (k % 3);
				}
			}

			while (whiteCounter != 0 && greenCounter != 0 && redCounter != 0) {
				counter++;
				--whiteCounter;
				--redCounter;
				--greenCounter;
			}

			System.out.println(counter);
		}

		// Write your code here

	}

	private int validateTestCases(String testCases) {
		int noOfTestCases = convertToInt(testCases);
		if (noOfTestCases < 1 || noOfTestCases > 10) {
			System.out.println("Please enter test cases between 1 to 10");
		}
		return noOfTestCases;
	}

	private int convertToInt(String number) {
		int i = 0;
		try {
			i = Integer.parseInt(number);
		} catch (NumberFormatException e) {
			System.out.println("Please enter only number");
		}
		return i;
	}

	private long convertToLong(String number) {
		long k = 0;
		long l = (long) 10e10;
		try {
			k = Long.parseLong(number);
			if (k > l) {
				System.out.println("Please enter number less that 10^9");
			}
		} catch (NumberFormatException e) {
			System.out.println("Please enter only number");
		}
		return k;
	}
}
