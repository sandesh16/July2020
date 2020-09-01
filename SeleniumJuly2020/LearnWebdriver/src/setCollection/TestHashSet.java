package setCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestHashSet {

	public static void main(String[] args) {
	
		HashSet<String> h=new HashSet<String>();
		//LinkedHashSet<String> h=new LinkedHashSet<String>();
		//TreeSet<String> h=new TreeSet<String>();
		
		h.add("Ravi");
		h.add("Vijay");
		h.add("Ravi");
		h.add("Ajay");
		h.add("Bimlesh");
		h.add("Amit");
		
		Iterator<String> itr=h.iterator();
		while (itr.hasNext())
		{
		System.out.println(itr.next());	
			
		}

	}

}
