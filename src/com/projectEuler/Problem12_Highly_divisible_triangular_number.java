package com.projectEuler;

public class Problem12_Highly_divisible_triangular_number {

	public static int triangleNumber(int n){
		 int triangleNumber=0;
		for(int i=1;i<=n;i++){
			triangleNumber+=i;
		}
		return triangleNumber;
	}
	public static void main(String[] args) {
		int numberOfdivisor=0;
		int i=1;
		while(numberOfdivisor<=500){
		int	triangleNumber=triangleNumber(i);
			i++;
			int count=0;
			for(int n=1;n<=triangleNumber;n++){
				if(triangleNumber%n==0){
					count++;
				}
			}
			numberOfdivisor=count;
	System.out.println(triangleNumber);
}

		}	}


