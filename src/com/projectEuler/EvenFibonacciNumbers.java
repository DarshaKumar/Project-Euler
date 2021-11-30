package com.projectEuler;
public class EvenFibonacciNumbers {
	static int evenSum=2;
	public static void main(String[] args){
		int inum1=1,inum2=2;
		int next;
        boolean flag=true;
		while(flag){
			next=inum1+inum2;
			inum1=inum2;
			inum2=next;
			if(next%2==0){
				evenSum+=next;
			}
			if(next>4000000){
				flag=false;
			}
		}
		System.out.println(evenSum);
	}

}
