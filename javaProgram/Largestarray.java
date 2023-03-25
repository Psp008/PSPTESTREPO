package javaProgram;

import java.util.Arrays;

public class Largestarray {

	public static void main(String[] args) {
		
		int ar[] = {20, 18, 14, 16, 10, 12};
		
		Arrays.sort(ar); //sorted arrays in ascending order
		//sorted arrays - 10, 12, 14, 16, 18, 20
		
		int a = ar.length;// ar.length=6 a -1 = 5
		
		//System.out.println(a);
		
		//int b = ar[5];
		
		//System.out.println(b); // as indexing starts from 0
		
		System.out.println("2nd Largest number is " +ar[a-1]);
		
		System.out.println("Smallest number is " +ar[0]);
	}

}
