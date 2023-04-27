package apr27th;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetDemo1 {
	
	public static void main(String[] args) {
		
		
		//List<String> al=new ArrayList<String>();
		
		Set<String> al=new HashSet<String>();
		
		al.add("Selenium");
		al.add("Riyaz");
		al.add("Live Tech");
		al.add("appium");
		al.add("Selenium");
		al.add("Riyaz");
		al.add("Live Tech");
		al.add("appium");
		System.out.println(al.size());
		System.out.println("Using for-each or enchanced for loop");
		for(String temp:al)
		{
			System.out.println(temp);
		}
		
		Iterator<String> it=al.iterator();
		System.out.println("Using Iterator");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
