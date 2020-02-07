package lab7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class Example8 {

	public List<Integer> modifyArray(int a[])
	{	
		 Set<Integer> set = new HashSet<Integer>();
		    for(int i=0;i<a.length;i++){
		        set.add(a[i]);
		    }
		    List<Integer> list = new ArrayList<Integer>(set); 
	        Collections.sort(list,Collections.reverseOrder()); 
		    return list;
		
	}
	public static void main(String[] args) {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(isr);
		System.out.println("Enter the length of the array:");
		try {
		int length=Integer.parseInt(b.readLine());
		int a[]=new int[length];
		for(int i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(b.readLine());
		}
		Example8 obj=new Example8();
		System.out.println(obj.modifyArray(a));
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
