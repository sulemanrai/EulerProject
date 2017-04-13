public class Problem2 {
	public int Even_Fibonacci_numbers() {

		int count = 0;
		int sum = 0;
		while (true) {
			if (fibonacci(count) % 2 == 0) {
				sum += fibonacci(count);
			}
			count++;
			if (fibonacci(count) > 4000000) {
				break;
			}			
		}
		return sum;
	}

	public int fibonacci(int n) {
		int number = 0;
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			number = fibonacci(n - 1) + fibonacci(n - 2);		
		return number;
	}
}