package collectionstest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

public class ConverArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array = {"Payal","Prasad","Kavita","Jeevan"};
		System.out.println(Arrays.toString(array));
		
		List<String> List = new ArrayList<String>();
		for(String name : array)
		{
			List.add(name);
		}
		Iterator<String> itr = List.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
