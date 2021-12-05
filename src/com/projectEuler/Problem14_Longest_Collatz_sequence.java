package com.projectEuler;

public class Problem14_Longest_Collatz_sequence {

	public static void main(String[] args) {
int largetNumber=0;
int largetSequence=0;
for(int i=2;i<1000001;i++){
	long number=i;
	int count=1;
	while(number>1){
		if(number%2==0){
			number=number/2;
		}
		else {
			number=(3*number)+1;
		}
		count+=1;
	}
		if(count>largetSequence){
			largetSequence=count;
			largetNumber=i;
		}
	}System.out.println(largetNumber);
	System.out.println(largetSequence);
	

	}

}
