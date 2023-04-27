package apr27th;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		
		List<Integer> al=new ArrayList<Integer>();
		
		al.add(100);
		al.add(200);
		//al.add(300.33);
		al.add(400);
		al.add(500);
		
		System.out.println(al);
		
		System.out.println("Using for loop");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("Using for-each or enchanced for loop");
		for(int temp:al)
		{
			System.out.println(temp);
		}
		
		System.out.println("Using Iterator");
		
		Iterator<Integer>  it=al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
