public class Problem4 {
	public Integer largest_palindrome_product() {

		int largestpalindrome = 0;		
		int firstNum = 100;
		int secondNum = 100;
		int product = 0;
		 ArrayList<Integer> al = new ArrayList<Integer>();
		
		while (firstNum <= 999) {
			while (secondNum <= 999) {
				product = firstNum * secondNum;
				if (checkPalindrome(product) ==  true) {					
					al.add(product);
				} 			
				secondNum++;
			}
			secondNum = 100;
			firstNum++;
		}
		
		Integer array[] = al.toArray(new Integer [al.size()]);
		largestpalindrome = array[0];	
		for (int i = 0; i < array.length - 1  ;i++) {
			if(array[i+1] > largestpalindrome) {
				largestpalindrome = array[i+1];				
			}
		}		
		return largestpalindrome;

	}

	boolean checkPalindrome(int num) {

		int reversedNum = 0;
		int input = num;
		while (input != 0) {
			reversedNum = reversedNum * 10 + input % 10;
			input = input / 10;
		}	
		if (reversedNum == num) {
			return true;
		} else {
			return false;
		}
	}
}