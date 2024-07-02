
public class ArrayOperation {
	public void average(int[] num) {
		float sum = 0;
		int i;

		for (i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}

		float averageofnum = (sum) / i;
		System.out.println(averageofnum);

	}

	public static void main(String[] args) {
		ArrayOperation arrayOperation = new ArrayOperation();
		int[] numbers = { 1, 2, 3, 4,5,6,7,8,9,10 };
		arrayOperation.average(numbers);

	}

}
