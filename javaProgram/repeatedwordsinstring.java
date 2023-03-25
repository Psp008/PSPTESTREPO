package javaProgram;

public class repeatedwordsinstring {

	public static void main(String[] args) 
	
	{
		String s1 = "Java Program is a Java Program";
		
		String words[] = s1.split(" ");
		
		//System.out.println(words);
	
		for(int i=0; i < words.length; i++) {    
               
            for(int j = i+1; j < words.length; j++) {    
                if(words[i].equals(words[j])) {    
                     
                    System.out.println(words[i]);
                }    
            }    
	
		}
	}

}
