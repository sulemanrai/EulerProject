public class Problem3 {
	public BigInteger largest_prime_factor() {
		
		BigInteger value = BigInteger.valueOf(600851475143L);		
		BigInteger factor = BigInteger.valueOf(3);
		
		while (value.compareTo(BigInteger.ONE) > 0) {
			if ((value.mod(factor)).compareTo(BigInteger.valueOf(0)) == 0 ) {				
				value = value.divide(factor);				
			} else {
				factor = factor.add(BigInteger.valueOf(2));				
			}					        		   
		}				
		return factor;
	}
}