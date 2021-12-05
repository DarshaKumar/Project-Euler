package com.projectEuler;

public class Problem9_SpecialPythagoreanTriplet {

	public static void main(String[] args) {
		int a=0,b=0,c=0;
for(int i=1;i<=1000;i++){
	for(int j=i+1;j<=1000;j++){
		for(int k=j+1;k<=1000;k++){
			if(i<j&&j<k){
				a=i*i;
				b=j*j;
				c=k*k;
				if(a+b==c){
					a=i;
					b=j;
					c=k;
					if(a+b+c==1000){
						System.out.println(a+" "+b+" "+c);
						System.out.println((a*b*c));
						break;
					}
				}
				}
			}
		
		}
	}
}


}
