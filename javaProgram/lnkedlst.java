package javaProgram;

import java.util.Collections;
import java.util.LinkedList;

public class lnkedlst {

	public static void main(String[] args) {
		
		LinkedList li = new LinkedList();
		
		li.add("Piyush");
		
		li.add('P');
		
		li.add(4);
		
		li.add(20);
		
		li.add("Pohare");
		
		//Collections.reverse(li);
		
		System.out.println(li);
		
		for(int i=li.size()-1; i>=0; i--)
		{
			System.out.print(li.get(i)+", ");
		}
		
		
		
	

	}

}
