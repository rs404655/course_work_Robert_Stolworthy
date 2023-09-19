
public class DoublyLinkedListDummy {
	
	private DIntNode head;
	private DIntNode tail;
	
	// get/set methods
	public DIntNode getHead() {
		
		return head;
		
	}
	
	public DIntNode getTail() {
		
		return tail;
		
	}
	
	public void setHead(DIntNode node) {
		
		head = node;
		
	}
	
	public void setTail(DIntNode node) {
		
		tail = node;
		
	}
	
	// default constructor
	public DoublyLinkedListDummy(){
		
		head = new DIntNode();
		tail = new DIntNode();
		head.setNext(tail);
		tail.setPrev(head);
		
	} // close default constructor
	
	/**
	 * addEnd() adds element to the end of a doubly linked list
	 * @param int element
	 * 
	 * Big-O - O(1)
	 */
	public void addEnd(int element){
		
		// declare node to put at the end with the wanted value
		DIntNode newNode = new DIntNode(element);
		
		// find the node prior to the tail aka the end of the list
		DIntNode cursor = tail.getPrev();
		
		// set newNode prev to the end node
		newNode.setPrev(cursor);
		
		// set newNode next to the tail of the list
		newNode.setNext(tail);
		
		// set the original end node's next to the newNode
		cursor.setNext(newNode);
		
		// set the tail's prev to the newNode
		tail.setPrev(newNode);
		
	} // close addEnd()
	
	/**
	 * removeFromHead() removes the actual first node
	 * 
	 * Big-O - O(1)
	 */
	public void removeFromHead() {
		
		// set cursor to head of list
		DIntNode cursor = head;
		
		// set nextNode to the node that will be the first on the new list
		DIntNode nextNode = (head.getNext()).getNext();
		
		// set head's next to the new front
		cursor.setNext(nextNode);
		// set the new front's prev to the head
		nextNode.setPrev(cursor);
		
	} // close removeFromHead()
	
	/**
	 * toString() creates a string from a DoublyLinkedListDummy
	 * @return str - the string created by the function
	 *
	 * Big-O - O(n)
	 */
	public String toString(){
		
		// create string
		String str = "";
		
		// find the first value of the list
		DIntNode cursor = head.getNext();
		// find the last value of the list
		DIntNode cursor2 = tail.getPrev();
		
		// if list is empty return empty
		if(head.getNext() == tail) {
			
			str = "empty";
			
		}
		
		// create string of data
		else {
			
			// Forward part of string
			str = str + "(Forward)" + cursor.getData();
			cursor = cursor.getNext();
			
			while(cursor != tail) {
				
				str = str + "<->" + cursor.getData();
				cursor = cursor.getNext();
				
			}
			
			// Backward part of string
			str = str + "\n(Backward)" + cursor2.getData();
			cursor2 = cursor2.getPrev();
			
			
			while(cursor2 != head) {
				
				str = str + "<->" + cursor2.getData();
				cursor2 = cursor2.getPrev();
				
			}
			
		}
		
		
		return str;
		
	} // close toString
	
	/**
	 * countOccurence() counts the occurence of e within a list
	 * @param int e - value to count occurence of
	 * @return count - number of occurences
	 * 
	 * BigO - O(n)
	 */
	public int countOccurence(int e) {
		
		// initialize count
		int count = 0;
		// find first real value in the list
		DIntNode cursor = head.getNext();
		
		// go through the list if data is equal to e increment count
		while(cursor != tail) {
			
			if(cursor.getData() == e) {
				
				count++;
				
			}
			
			cursor = cursor.getNext();
			
		} // close while
		
		return count;
		
	} // close countOccurence
	
	/**
	 * removeAll() removes all nodes that hold the data equal to e
	 * 
	 * @param int e - value that if occurs removes the node 
	 * @return tf - true if a node was removed, else false
	 * 
	 * BigO - O(n)
	 */
	public boolean removeAll(int e) {
		
		// set a boolean for if a node was deleted or not
		boolean tf = false;
		
		// set a DIntNode to first real value
		DIntNode cursor = head.getNext();
		
		// remove node if data is equal to e
		while(cursor != tail) {
		
			// if data is equal to e delete node and set tf to true
			if(cursor.getData() == e) {
				
				cursor.getPrev().setNext(cursor.getNext());
				cursor.getNext().setPrev(cursor.getPrev());
				
				tf = true;
				
			}
			
			cursor = cursor.getNext();
			
		}
		
		return tf;
		
	} // close removeAll()
	
	/**
	 * truncate() create a DoublyLinkedListDummy from after the point i and remove the
	 * nodes from the original list
	 * 
	 * @param int i - the place where you want to truncate
	 * @return the list seperated from the original
	 * 
	 * Big-O - O(n)
	 */
	public DoublyLinkedListDummy truncate(int i) {
		
		// create new linked list to hold new list
		DoublyLinkedListDummy trun = new DoublyLinkedListDummy();
		
		// first real value
		DIntNode cursor = head.getNext();
		// create an index
		int index = 0;
		
		while( index < i && cursor != tail ) {
			
			index++;
			cursor = cursor.getNext();
			
		}
		
		
		
		cursor.getPrev().setNext(tail);
		tail.setPrev(cursor.getPrev());

		
		while (cursor != tail) {
			
			trun.addEnd(cursor.getData());
			cursor = cursor.getNext();
			
		}

		
		return trun;
		
	} // close truncate()
	
	/**
	 * absorb() has one list that absorb the other and than empties the other list
	 * 
	 * @param dl - list to be absorbed
	 * 
	 * Big-O - O(1)
	 */
	public void absorb(DoublyLinkedListDummy dl) {
		
		DIntNode temp = tail.getPrev();
		
		temp.setNext((dl.getHead()).getNext());
		dl.getHead().getNext().setPrev(temp);
		tail.setPrev((dl.getTail()).getPrev());
		dl.getTail().getPrev().setNext(tail);
		
		(dl.getHead()).setNext(dl.getTail());
		(dl.getTail()).setPrev(dl.getHead());
		
	}
	
	public static void main(String[] args) {
		
		// test default constructor
		DoublyLinkedListDummy dlld = new DoublyLinkedListDummy();
		// nodes to fill the list
		DIntNode n1 = new DIntNode(1);
		DIntNode n2 = new DIntNode(2);
		DIntNode n3 = new DIntNode(3);
		DIntNode n4 = new DIntNode(4);
		DIntNode n5 = new DIntNode(5);
		
		//test toString()
		System.out.println("Before adding nodes: " + dlld);
		
		//fill list and test set and gets
		dlld.head.setNext(n1);
		n1.setPrev(dlld.getHead());
		n1.setNext(n2);
		n2.setPrev(n1);
		n2.setNext(n3);
		n3.setPrev(n2);
		n3.setNext(n4);
		n4.setPrev(n3);
		n4.setNext(n5);
		n5.setPrev(n4);
		n5.setNext(dlld.tail);
		dlld.tail.setPrev(n5);
		
		//test toString()
		System.out.println();
		System.out.println("After adding nodes:");
		System.out.println(dlld);
		
		//test addEnd()
		dlld.addEnd(6);
		
		System.out.println();
		System.out.println("Adding 6 to the end:");
		
		System.out.println(dlld);
		
		// test removeFromHead()
		dlld.removeFromHead();
		System.out.println();
		System.out.println("After removeFromHead():");
		
		System.out.println(dlld);
		
		// test removeFromHead()
		dlld.removeFromHead();
		System.out.println();
		System.out.println("After removeFromHead() again:");
		
		System.out.println(dlld);
		
		// test addEnd()
		dlld.addEnd(4);
		dlld.addEnd(4);
		
		System.out.println();
		System.out.println("After adding to 4's to the end:");
		
		System.out.println(dlld);
		
		// test countOccurence
		System.out.println("The number of times 4 occurs: " + dlld.countOccurence(4));
		
		// test removeAll
		dlld.removeAll(4);
		System.out.println();
		System.out.println("After removeAll(4):");
		
		System.out.println(dlld);
		
		// test removeAll
		dlld.removeAll(4);
		System.out.println();
		System.out.println("After removeAll(4) again:");
		
		System.out.println(dlld);
		
		// fill list again
		dlld.head.setNext(n1);
		n1.setPrev(dlld.getHead());
		n1.setNext(n2);
		n2.setPrev(n1);
		n2.setNext(n3);
		n3.setPrev(n2);
		n3.setNext(n4);
		n4.setPrev(n3);
		n4.setNext(n5);
		n5.setPrev(n4);
		n5.setNext(dlld.tail);
		dlld.tail.setPrev(n5);
		
		System.out.println();
		System.out.println("After adding nodes again:");
		System.out.println(dlld);
		
		// test truncate()
		DoublyLinkedListDummy nlld = dlld.truncate(2);
		System.out.println("The return of truncate(2): \n" + nlld);
		System.out.println("dlld after truncate(2): " + dlld);
		
		// create new list
		DoublyLinkedListDummy dlld2 = new DoublyLinkedListDummy();
		DIntNode in1 = new DIntNode(1);
		DIntNode in2 = new DIntNode(2);
		DIntNode in3 = new DIntNode(3);
		DIntNode in4 = new DIntNode(4);
		DIntNode in5 = new DIntNode(5);
		
		dlld2.head.setNext(in1);
		in1.setPrev(dlld2.getHead());
		in1.setNext(in2);
		in2.setPrev(in1);
		in2.setNext(in3);
		in3.setPrev(in2);
		in3.setNext(in4);
		in4.setPrev(in3);
		in4.setNext(in5);
		in5.setPrev(in4);
		in5.setNext(dlld2.tail);
		dlld2.tail.setPrev(in5);
		
		// test toString
		System.out.println();
		System.out.println("list to be absorbed: \n" + dlld2);
		
		// test absorb()
		System.out.println();
		dlld.absorb(dlld2);
		System.out.println("dlld after absorbing dlld2: \n" + dlld);
		
		System.out.println("dlld2 after being absorbed: " + dlld2);
		
	}

}
