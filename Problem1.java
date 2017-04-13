public class Problem1 {
	public int multiples_of_3_5(int num) {

		int sum = 0;
		int count = 0;
		while (count != num) {
			if ((count % 3 == 0) || (count % 5 == 0)) {
				sum += count;
			}
			count++;
		}		
		return sum;
	}
}