package setCollection;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
	
		TreeSet<String> h=new TreeSet<String>();
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
