package apr27th;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		
		List al=new ArrayList();
		
		System.out.println(al.size());
		
		al.add(10);
		
		al.add(20);
		
		al.add(30);
		
		al.add(40);
		
		al.add(50);
		
		System.out.println(al.size());
		
		al.add(10);
		
		al.add(20);
		
		al.add(30);
		
		al.add(40);
		
		al.add(50);
		
		System.out.println(al.size());
		
		al.add(10);
		
		al.add(20);
		
		al.add(30);
		
		al.add(40);
		
		al.add(50);

		System.out.println(al.size());
		
		System.out.println(al.get(14));
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		
		
		
		
		
		
	}

}
