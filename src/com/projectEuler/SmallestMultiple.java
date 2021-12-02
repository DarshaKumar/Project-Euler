package com.projectEuler;
public class SmallestMultiple {
	static long gcd(long a,long b){
		if(a%b!=0)
			return gcd(b,a%b);
			else
		return b;
	}
	static long lcm(long n){
		long smallestMultiple=1;
		for(int i=1;i<=n;i++)
			smallestMultiple=(smallestMultiple*i)/(gcd(smallestMultiple,i));
		return smallestMultiple;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=20;
System.out.println(lcm(n));
}
}
