package mapCollectionDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		//Hashtable<Integer, String> hm=new Hashtable<Integer, String>();
		hm.put(100, "Amit");
		hm.put(140, "Sandesh");
		hm.put(110, "Sandesh");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		
		//to convert map into collection 
		
		Collection entr=hm.entrySet();
		Iterator it=entr.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}

	}

}
