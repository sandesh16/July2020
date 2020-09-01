package listCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[] args) {
	
		ArrayList al=new ArrayList();
		
		al.add("Sandesh");
		al.add("Ravi");
		al.add("Sandesh");
		al.add("Ajay");
		al.add(10);
		
		/*
		 * Iterator itr=al.iterator();
		 * 
		 * while (itr.hasNext()) 
		 * { 
		 * System.out.println(itr.next());
		 * 
		 * }
		 */
		
		for (int i = 0; i < al.size(); i++)
		{
			System.out.println(al.get(i));
		}

	}

}
