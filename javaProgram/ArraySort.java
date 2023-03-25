package javaProgram;

public class ArraySort {

	public static void main(String[] args) {
			
			int ar[] = {20, 18, 14, 16, 10, 12};

			//Arrays.sort(ar);
			
			
			
			for(int a=0; a<=ar.length-1; a++)
			{
				
				for(int b=a+1; b<=ar.length-1; b++)
				{
					int temp = 0;
					if(ar[a]>ar[b])
					{
						
						temp=ar[a];
						ar[a]=ar[b];
						ar[b]=temp;
					}
				}
				
				System.out.println(ar[a]);
				
			}
			
			
			
		}

		
		

	}


