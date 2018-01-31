/**
 * Nathan Bromer 
 * Assignment #3
 * Due Date: 02/01/2018
 * IT2040C/2/Spring 2018
 * Description: A program to run a prime number check using BigInteger() WITHOUT using isProbablePrime.
 */
package biginteger;

import java.math.BigInteger;

public class PrimeNumber {

	PrimeNumber(BigInteger n){}//I think this is how I could have gotten it to be called on in the main
	
	BigInteger THREE = new BigInteger("3");//static BigInteger to use in for loop
	BigInteger TWO = new BigInteger("2");//see above comment
	
	boolean isPrime(BigInteger n) {//prime number checker for loop
		if (n.remainder(TWO).compareTo(BigInteger.ZERO)==0) //for(n%2==0) in BigInteger form
			return false;
	
		for (BigInteger i = THREE; //for(int i = 3; i*i<=n;i+=2) also BigInteger form
				i.compareTo(n)<=0;
				i=i.add(TWO)) {
			if(n.remainder(i).compareTo(BigInteger.ZERO)==0) //for(n%1==0) final BigInteger form conversion
				return false;
			
		}
		return true;
	}
}

