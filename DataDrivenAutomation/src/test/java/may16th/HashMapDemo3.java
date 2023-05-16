package may16th;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo3 {

	public static void main(String[] args) {
		
		Map<Integer,String> hMap= new HashMap<Integer,String>();
		
		hMap.put(100, "Ravi");
		
		hMap.put(101, "Sam");
		
		hMap.put(102, "Gopi");
		
		System.out.println("No of Entries or Keyvalue pairs "+hMap.size());
		
		Set<Integer> allKeys=hMap.keySet();
		
		for(Integer key:allKeys)
		{
			System.out.println(key+"---"+hMap.get(key));
		}

	}

}
