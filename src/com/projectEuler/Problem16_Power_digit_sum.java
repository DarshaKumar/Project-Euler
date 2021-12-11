package com.projectEuler;

import java.math.BigInteger;

public class Problem16_Power_digit_sum {

	public static void main(String[] args) {
BigInteger number=BigInteger.valueOf(2);
BigInteger result=number.pow(1000);
char[] num = result.toString().toCharArray();
long sum=0;
for(int i=0;i<num.length;i++){
	sum+=Long.parseLong(String.valueOf(num[i]));
}
System.out.println(result);
System.out.println(sum);
	}

}
