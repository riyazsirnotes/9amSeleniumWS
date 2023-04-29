package apr28th;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		
		Set<String> hs=new HashSet<String>();
		
		hs.add("Selenium");
		
		hs.add("Riyaz");
		
		hs.add("LiveTech");
		
		hs.add("QTP");
		
		System.out.println(hs.size());
		
		System.out.println(hs);
		
		hs.add("Selenium");
		
		hs.add("Riyaz");
		
		hs.add("LiveTech");
		
		hs.add("QTP");
		
		System.out.println(hs.size());
		
		System.out.println(hs);
		
		System.out.println("Using for-each or enchanced for loop");
		
		for(String temp:hs)
		{
			System.out.println(temp);
		}
		
		System.out.println("Using Iterator");
		
		Iterator<String> it=hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
