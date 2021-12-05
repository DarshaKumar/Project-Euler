package com.projectEuler;

public class Problem10_Summation_of_primes {
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
long sumOfPrimes=0l;
for(int i=2;i<2000000;i++){
	if(isPrime(i)){
		if(i>=2000000){
			break;
		}
		sumOfPrimes+=i;
		System.out.println(i);
		
	}
}
System.out.println(sumOfPrimes);

		
		}
}
