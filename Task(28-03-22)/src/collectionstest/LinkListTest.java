package collectionstest;

import java.util.*;

public class LinkListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new LinkedList<String>();
		list.add("Nikita");
		list.add("Viraj");
		list.add("Swati");
		list.add("Sandip");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}

