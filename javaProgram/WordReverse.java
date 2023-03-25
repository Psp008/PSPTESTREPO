package javaProgram;

public class WordReverse {

	public static void main(String[] args) {
		
		String s = "This is String";
		
		String[] sv = s.split(" ");
		
		int size = sv.length-1;
		
		for(int i=size; i>=0; i--)
		{
			System.out.print(sv[i]+" ");
		}
		
	}

}
