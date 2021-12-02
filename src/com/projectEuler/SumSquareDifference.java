package com.projectEuler;
public class SumSquareDifference {
static int sum=0;
static int square=0;
public static void main(String[] args) {
for(int i=0;i<=100;i++){
	sum+=(i*i);
	square+=i;
}
System.out.println(sum);
System.out.println(square*square);
System.out.println((square*square)-sum);
	}

}
