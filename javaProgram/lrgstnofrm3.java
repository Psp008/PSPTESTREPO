package javaProgram;

import java.util.Scanner;

public class lrgstnofrm3 {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		Scanner a = new Scanner(System.in);
		System.out.println("Enter num1");
		num1 = a.nextInt();
		System.out.println("Enter num2");
		num2 = a.nextInt();
		System.out.println("Enter num3");
		num3 = a.nextInt();
		
		if(num1>=num2 && num1>=num3)
			System.out.println("Largest number is " +num1);
		
		else if (num2>=num1 && num2>=num3)
			System.out.println("Largest number is " +num2);
		else
			System.out.println("Largest number is " +num3);
		
		
		
	}

}
