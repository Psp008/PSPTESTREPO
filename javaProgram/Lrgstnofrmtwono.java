package javaProgram;

import java.util.Scanner;

public class Lrgstnofrmtwono {

	public static void main(String[] args) {

		int numberone;
		int numbertwo;
		int largest;
		
		//Scanner scan = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		numberone = scan.nextInt();
		System.out.println("Enter the second number");
		numbertwo = scan.nextInt();
		//System.out.println("Enter the First number");
		//numberone = scan.nextInt();//35
		//System.out.println("Enter the Second number");
		//numbertwo = scan.nextInt();//25
		
		if(numberone>numbertwo) {
		largest = numberone;
		
		}
		
		else {
			largest = numbertwo;
			}
		
		System.out.println("Largest number is " +largest);
		
		
		
	}

}
