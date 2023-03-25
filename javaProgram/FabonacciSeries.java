package javaProgram;

public class FabonacciSeries {

	public static void main(String[] args) {
		
		int i = 0; 
		
		int j = 1;
		
		int c;
		
		//System.out.println(" " +i);
		
		//System.out.println(" " +j);
		
		for(int k =0; k<=5; k++)
		{
			c = i + j;
			
			i=j;
			
			j=c;
			
			System.out.println(" " +c);
			
		}
		

	}

}
