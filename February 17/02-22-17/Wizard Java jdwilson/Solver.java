package solver;

import java.math.BigInteger;

/**
 * Program that solves the programs
 * @author jdwilson
 *
 */
public class Solver {
	
	/**
	 * Computes the factorial of a number then adds that numbers digits together
	 * @param numToFactorialAdd
	 * @return long value of factorial results digits added together
	 */
	public long factorialDigitSolver(long numToFactorialAdd){
		
		BigInteger factorialNum = this.computeFactorial(numToFactorialAdd);
		char[] arrayOfNums = factorialNum.toString().toCharArray();
		long sum = 0;//can't ever be negative number
		for(char x : arrayOfNums){ //summing the giant numbers digits
			sum += Character.getNumericValue(x);
		}
		
		return sum;
	}
	
	/**
	 * Calculates the Big Int Value of the factorial
	 * @param numToFactorial
	 * @return
	 */
	public BigInteger computeFactorial(long numToFactorial){
		
		// Initialize result
        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE
 
        // Multiply f with 2, 3, ...numToFactorial
        for (int i = 2; i <= numToFactorial; i++)
            f = f.multiply(BigInteger.valueOf(i));
 
        return f; 
	}

}
