package javaProgram;

public class ReverseString {

	public static void main(String[] args) {
		
		String s1 = "Piyush";

		int a = s1.length();
		
		System.out.println(a);

		for(int i=a-1; i>=0; i--)
		{
			System.out.print(s1.charAt(i));
		}
		
	
		
	}

}
