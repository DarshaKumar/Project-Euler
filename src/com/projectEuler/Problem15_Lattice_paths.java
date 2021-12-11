package com.projectEuler;

import java.math.BigInteger;
/*We know that any path will have 40 moves (20 right + 20 down), so for C(n,r) – n will equal 40 and r (the number of right moves) will equal 20 – C(40,20). Then we just plug the numbers into the formula – the ! means ‘factorial’. I posted 2 versions of the solution: 1 without recursion – uses a for loop, and one with recursion – the factorial function calls itself.

            n!
C(n,r) = ---------
         r!*(n-r)!

The number of how many good routes we have can be found by finding how
many combinations of 20 R’s we can have in our 40 moves, so we want to
calculate:

                40!
C(40,20) = -------------
           20!*(40-20)!*/
public class Problem15_Lattice_paths {

	public static void main(String[] args) {
		        int n = 40;     // The total number of moves for any one path (right + down)
		        int r = 20;     // The total number of right moves for any one path
		        System.out.println(factorial(n).divide(factorial(r).multiply(factorial(n - r))));
		    }
		    public static BigInteger factorial(int number )
		    {
		        BigInteger n = BigInteger.ONE;
		        for (int i = 1; i <= number; i ++) {
		            n = n.multiply(BigInteger.valueOf(i));          
		        }
		        return n;
		    }
		 
		}
