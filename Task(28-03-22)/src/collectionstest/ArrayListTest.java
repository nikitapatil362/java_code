package collectionstest;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		String str= "hi";
		list.add("string");
		list.add(str);
		list.add(str+str);
		for(String sl : list)
			System.out.print(sl +" ");
		System.out.println(list.size());
		System.out.println(list.contains(42));
		System.out.println(list.contains("hihi"));
		list.remove("hi");
		System.out.println(list.size());
		list.add("hi");
		list.add(str);
		System.out.println(list.size());
		for(String index :list)
			System.out.print(index + " ");
		
	}

}
