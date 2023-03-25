package javaProgram;

public class DuplicateProgram {

	public static void main(String[] args) {
		
		int ar[] = {23, 35, 55, 40, 45, 35, 60, 23, 5, 8, 100, 55};
		
		System.out.println(ar.length);
		
		for(int i=0; i<=ar.length-1; i++)
		{
			for(int j=i+1; j<=ar.length-1; j++) {
				if(ar[i]==ar[j])
				  //ar[0]==ar[1]=x
				  //ar[0]==ar[2]=x
				  //ar[0]==ar[7]=correct
				  //ar[1]==ar[2]=x
				  //ar[1]==ar[5]=correct
				{
					System.out.println("Duplicate number is " +ar[i]);
				}
			}
		}
		
	}

}
