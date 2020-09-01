package mapCollectionDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> hm=new TreeMap<Integer, String>();
		
		hm.put(100, "Amit");
		hm.put(104, "Sandesh");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		
		Collection entr=hm.entrySet();
		Iterator it=entr.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}

	}

}
