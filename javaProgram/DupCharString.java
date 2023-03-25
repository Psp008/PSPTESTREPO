package javaProgram;

public class DupCharString {

	public static void removeDuplicates(String str)
	{
		
		//Create an Empty String
		String newstr = new String();
		
		//System.out.println(newstr);
		
		//calculate length of the original String
		int length = str.length();
		
		System.out.println(length);
		
		for(int i = 0; i<length; i++)
		{
			char charAtPosition = str.charAt(i);
		//0 = a
 		//1 = k
		//2 = s
		//3 = h
		//4 = a
		//5 = y
			
			//akshay
		    //012345
		if(newstr.indexOf(charAtPosition)<0)
		{
			//newstr.indexOf(a) should b less than 0
			//newstr.indexOf(0)<0	//true
			//newstr.indexOf(1)<0	//false
			//newstr.indexOf(2)<0	//false
			//newstr.indexOf(3)<0	//false
			//newstr.indexOf(4)<0	//false
			//newstr.indexOf(5)<0	//false
			
			//a added
			newstr += charAtPosition;
			
		}
					
		}
		
		System.out.println(newstr);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		String str = "akshay";
		
		removeDuplicates(str);
		
	}

}
