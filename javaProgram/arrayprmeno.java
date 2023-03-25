package javaProgram;

import java.util.Arrays;

public class arrayprmeno {

	public static void main(String[] args) {
		
		int ar[] = {11, 12, 13, 14, 15, 2, 3, 5, 21, 25};
	
		Arrays.sort(ar);
		
		for(int i=0; i<=ar.length-1; i++)
		{	
		//System.out.println(ar[i]);
		}
		for(int j=0; j<=ar.length-1; j++) 
		{
			int count=0;//1,2
			int givnum = ar[j];//ar[0]=11
			
		for(int i=1; i<=givnum; i++) {

			
			if(givnum % i == 0) // 11 % 1 = 0
				//11 % 2 = notequaltozero i=1,2,3,.....11)
				//11 % 11 = 0
			{
				//System.out.println(i);
				count ++;
			}
			
		}
		
		
		
		if(count==2) {
System.out.println("Given number is Prime " +givnum);
			}
			
			else
			{
System.out.println("Given number is not Prime " +givnum);
			
		}
		
		
	}

	}
}
