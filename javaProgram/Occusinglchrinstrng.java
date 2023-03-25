package javaProgram;

public class Occusinglchrinstrng {

	public static void main(String[] args) {

		String s1 =  "anant";
		
		int count = 0;
		
		//System.out.println(s1.charAt(1));
		
		for(int i=0; i<s1.length(); i++)
		{
			if(s1.charAt(i)=='a')
			{
				count = count + 1;
				
			}
			
		}
		
		System.out.println("The character a is available for " +count+ " times");
		
	}

}
