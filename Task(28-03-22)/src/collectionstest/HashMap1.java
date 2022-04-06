package collectionstest;

import java.util.*;
import java.util.Map.Entry;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> map =new HashMap<Integer,String>();
		System.out.println("Enter the name you want added");
		Scanner sc =new Scanner(System.in);
		String sl =sc.next();
		map.put(1, sl);
		map.put(2, "Shubham");
		map.put(3, "Arun");
		map.put(4, "Mangal");
		
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
