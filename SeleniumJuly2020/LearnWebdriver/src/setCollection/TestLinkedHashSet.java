package setCollection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> h=new LinkedHashSet<String>();
		
		h.add("Ravi");
		h.add("Vijay");
		h.add("Ravi");
		h.add("Ajay");
		
		Iterator<String> itr=h.iterator();
		while (itr.hasNext())
		{
		System.out.println(itr.next());	
			
		}

	}

}
