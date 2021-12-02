package com.projectEuler;

import javax.swing.plaf.InputMapUIResource;

public class LargestPalindromeProduct3Digits {
	public static void main(String[] args) {
		int inumber=0;
		for(int i=100;i<=999;i++){
			for(int j=100;j<=999;j++){
				int palindrome=i*j;
				StringBuilder sb1=new StringBuilder(String.valueOf(palindrome));
				String sb2=String.valueOf(palindrome);
				sb1.reverse();
				if(sb2.equals(sb1.toString())&&inumber<palindrome){
					inumber=palindrome;
				}
			}
		}
		System.out.println(inumber);
	}
}
