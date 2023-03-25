package javaProgram;

public class gvnnoprmoornot {

	public static void main(String[] args) {
		
		int givnum = 12;
		//6,1,6,2,3
		//
		int count = 0;
		
		for(int i = 1; i <= givnum; i++) 
		{
			if(givnum % i == 0)//1,no,11
			{
				System.out.println(i);
				count++;//1,2
			}
		}
		
		if(count == 2) 
		{
			System.out.println("Given number is prime " +givnum);
		}
		
		else
		{
			System.out.println("Given number is not prime " +givnum);
		}
		
		
	}
	
}