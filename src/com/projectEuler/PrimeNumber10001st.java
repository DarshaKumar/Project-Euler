package com.projectEuler;

public class PrimeNumber10001st {
	static boolean isPrime(long prime){
		if(prime<2)
			return false;
		else if(prime==2)
			return true;
		for(int i=2;i<prime;i++){
			if(prime%i==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int numberOfPrimes=0;
		long prime=1;
		int nthPrime=10001;
		while(numberOfPrimes<nthPrime){
			prime++;
			if(isPrime(prime)){
				numberOfPrimes++;
			}
		}
		System.out.println(prime);
}
}
