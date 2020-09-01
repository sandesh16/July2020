package listCollection;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> LL=new LinkedList<Integer>();
		
		LL.add(10);
		LL.add(70);
		LL.add(30);
		LL.add(30);
		
		LL.addLast(100);
		LL.addFirst(5);
		LL.add(3, 7);
		
		
		System.out.println("Original contents of linked list" +LL);
		
		
		/*
		 * //remove element from the list LL.remove(2); LL.removeFirst();
		 * LL.removeLast();
		 * 
		 * System.out.println("Linked list after deleting " +LL);
		 */

	}

}
