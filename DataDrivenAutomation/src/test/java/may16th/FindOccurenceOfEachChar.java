package may16th;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindOccurenceOfEachChar {
	
	
	public static void main(String[] args) {
		
		//Encapsulation in Java is a process of wrapping code 
		
		Scanner input=new Scanner(System.in);
		
		String inputString=input.nextLine();
		
		toFindOccurenceOfEachCharacterInGivenString(inputString);
		
	}

	private static void toFindOccurenceOfEachCharacterInGivenString(String str) {
		
			
		Map<Character,Integer> hMap=new HashMap<Character,Integer>();
		
		Character ch;
		
		for(int i=0;i<str.length();i++)
		{
			
			ch=str.charAt(i);
			
			if(hMap.containsKey(ch))
			{
				hMap.put(ch, hMap.get(ch)+1);
			}
			else
			{
				hMap.put(ch, 1);
			}
			
		}
		
		System.out.println(hMap);
		
		
	}

}
