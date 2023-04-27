package apr26th;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		//int[] a=new int[5];
		
		//System.out.println(a[0]);
		
		ArrayList al=new ArrayList();
		
		System.out.println(al.size());
		
		al.add(100);
		
		al.add(200);
		
		System.out.println(al.size());
		
		System.out.println(al.get(0));
		
		System.out.println(al.get(1));
		
		System.out.println(al.get(2));

	}

}
