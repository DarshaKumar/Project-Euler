package com.projectEuler;

public class MultiplesOf3Or5 {
	static int isum=0;

	public static void main(String[] args) {
int inum1=3;
int inum2=5;
for(int i=1;i<1000;i++){
	if(i%inum1==0||i%inum2==0){
		System.out.println(i);
		isum+=i;
	}
}
System.out.println(isum);
	}

}
