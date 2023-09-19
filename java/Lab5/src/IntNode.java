

/**
 * @author rstolworthy
 *
 */
public class IntNode {
	
	private int data;
	private IntNode link;
	
	// default constructor
	public IntNode() {
		
		data = 0;
		link = null;
		
	}
	
	// constructor
	public IntNode(int _data, IntNode _node) {
		
		data = _data;
		link = _node;
		
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public IntNode getLink() {
		return link;
	}

	public void setLink(IntNode link) {
		this.link = link;
	}
	
	/**
	 * toString() creates a string out of values in a linked list
	 *@return String line
	 */
	public String toString(){
		
		// create string to hold all values
		String line = "";
		
		// input first number integer into string
		line = data + "";
		
		// for loop to put the rest of the integers into the string
		for(IntNode cursor = link; cursor != null; cursor = cursor.link) {
			
			line = line + "->" + cursor.data;
			
		}
		
		return line;
		
	}
	
	
	/**
	 * Creates a new IntNode and sets it to the previous IntNodes link and chosen value while also setting the
	 * previous IntNode link to the new IntNode
	 * @param int newdata
	 */
	public void addNodeAfterThis(int newdata){
		
		link = new IntNode(newdata, link); 
		
	} // close addNodeAfterThis
	
	/**
	 * removeNodeAfterThis() sets the called IntNode n link to the link of the IntNode m after it effectively skipping m 
	 * 
	 */
	public void removeNodeAfterThis(){
		
		link = link.link;
		
	} // close removeNodeAfterThis()
	
	/**
	 * listLength finds the length of the linked list
	 * @param IntNode head
	 * @return val (the size of the list)
	 */
	public static int listLength(IntNode head){
		
		int val = 1;
		
		for(IntNode cursor = head.link; cursor != null; cursor = cursor.link){
			
			val++;
			
		}
		
		return val;
		
	} // close listLength()
	
	/**
	 * search() searches for a chosen variable by searching the list with a loop
	 * @param IntNode head
	 * @param int data
	 * @return true if the data is in the list
	 * @return false if the end of the list is reached
	 */
	public static boolean search(IntNode head, int data){
		
		for(IntNode cursor = head; cursor != null; cursor = cursor.link){
			
			if(cursor.data == data) {
				
				return true;
				
			}
			
		}
		
		return false;
		
	} // close search
	
	/**
	 * findMthToLast function finds the mth to last value of the linked list
	 * @param IntNode header
	 * @param int m
	 * @return node
	 */
	public static IntNode findMthToLast(IntNode header, int m){
		
		// finds the length of linked list
		int count = listLength(header);
		
		// creates an integer that holds how far the value is from the front of the list
		int count2 = count - m;
		int index = 0;
		IntNode node = null;
		
		// finds IntNode at the distance of count2 from the header
		for( IntNode cursor2 = header ; (index < count2) && (cursor2.link != null); cursor2 = cursor2.link) {
			
			node = cursor2;
			
		}
		
		return node;
		
	}
	
	/**
	 * hasCycle() determines if a list is cyclic
	 * 
	 * @param IntNode head
	 * @return true if the list is cyclic
	 * @return false if the list is noncyclic
	 */
	public static boolean hasCycle(IntNode head) {
		
		// loop that if the list ever points to the head returns true
		for(IntNode cursor = head; cursor != null; cursor = cursor.link){
			
			if(cursor.link == head) {
				
				return true;
				
			}
			
		}
		
		return false;
		
	} // close hasCycle()
	
	/**
	 * changeElement() changes the selected elements value to a selected new value
	 * 
	 * @param IntNode head
	 * @param int i, the location of the element
	 * @param newValue
	 */
	public static void changeElement(IntNode head, int i, int newValue) {
		
		int index = 0;
		
		// iterates until the location is met than changes to newValue
		for(IntNode cursor = head; cursor != null; cursor = cursor.link){
			
			if(index == i ) {
				
				cursor.data = newValue;
				
			}
			
			index++;
			
		}
		
	} // close changeElement()
	
	/**
	 * segregate_even_odd segregates even and odds in a list. Listing evens first
	 * then odds
	 * 
	 * @param IntNode head
	 * 
	 */
	public static void segregate_even_odd(IntNode head){
		
		int[] array = new int[listLength(head)];
		int index = 0, i = 0;
		
		// for loop that fills array with linked list data that is divisble by two
		for(IntNode cursor = head; cursor != null; cursor = cursor.link){
			
			if((cursor.data % 2) == 0) {
				
				array[index] = cursor.data;
				index++;
				
			}
			
		}
		
		// for loop that fills array with linked list data that isnt divisble by two
		for(IntNode cursor = head; cursor != null; cursor = cursor.link){
			
			if((cursor.data % 2) != 0) {
				
				array[index] = cursor.data;
				index++;
				
			}
			
		}
		
		// set the linked list data to the values in the array
		for(IntNode cursor = head; cursor != null; cursor = cursor.link){
			
			cursor.setData(array[i]);
			i++;
			
		}
		
	} // close segregate_even_odd
	
	/**
	 * reverse() reverses a singly linked list
	 * 
	 * @param IntNode head
	 * @return IntNode head, the reversed list
	 */
	public static IntNode reverse(IntNode head) {
		
		int[] array = new int[listLength(head)];
		int[] arrayRev = new int[array.length];
		int index = 0, index2 = 0, index3 = 0;
		
		// fills the first array with linked list data
		for(IntNode cursor = head; cursor != null; cursor = cursor.link){
					
			array[index] = cursor.getData();
			
			index++;
				
		}
		
		// fill the second array with first array vals in reverse
		for(int i = array.length - 1; i >= 0; i--) {
			
			arrayRev[i] = array[index2];
			index2++;
			
		}
		
		// fills linked list with second array vals
		for(IntNode cursor = head; cursor != null; cursor = cursor.link){
			
			cursor.setData(arrayRev[index3]);
			
			index3++;
				
		}
		
		return head;
		
	} // close reverse()
	
	public void swap() {
		
		IntNode temp = new IntNode(data, link);
		IntNode last = new IntNode(data, link);
		
		for(IntNode cursor = temp; cursor != null; cursor = cursor.link) {
			
			last = cursor;
			
		}
		
		setData(last.data);
		last.setData(temp.data);
		
		
		
	} // close swap()
	
	/**
	 * rotate() rotates a singly linked list counter clockwise the amount = k
	 * 
	 * @param IntNode head
	 * @param int k
	 * @return IntNode temp
	 */
	public static IntNode rotate(IntNode head, int k) {
		
		if (k == 0) {
			
			return head;
			
		}
		
		IntNode temp = head;
		IntNode cHead = head;
		
		IntNode last = head;
		

		
			for(IntNode cursor = temp; cursor != null; cursor = cursor.link) {
			
				last = cursor;
			
			}
		
			last.setLink(cHead);
			
			last = last.link;
		
			temp = cHead.link;
			
			last.setLink(null);
			
			for(IntNode cursor = temp; cursor != null; cursor = cursor.link) {
				
				last = cursor;
			
			}
		
			
		
		if(k > 1) {
			
			return rotate(temp, k - 1);
			
		}
		
		
		return temp;
		
		
	}
	
    public static void main(String[] args) {
    	
    	// test default constructor
    	IntNode n = new IntNode();
   
    	// Create and test IntNode using other constructor
    	IntNode list = new IntNode(12,n);
    	
    	IntNode n2 = new IntNode(13,null);
    	
    	// test setData() and setLink()
    	n.setData(11);
    	n.setLink(n2);
    	
    	// make the linked list larger
    	n.addNodeAfterThis(15);

    	// test hasCycle() t/f
    	System.out.println("Is list cyclic? " + hasCycle(list));
    	n2.setLink(list);
    	System.out.println("Is list cyclic? " + hasCycle(list));
    	n2.setLink(null);
    	
    	// test changeElement()
    	System.out.println();
    	System.out.println(list.toString());
    	changeElement(list, 2, 14);
    	System.out.println("list after change element: " + list.toString());
    	
    	// test segregate_even_odd()
    	segregate_even_odd(list);
    	System.out.println("list after segregation: " + list.toString());
    	
    	// test reverse()
    	reverse(list);
    	System.out.println("list after reverse: " + list.toString());
    	
    	// test swap()
    	n.swap();
    	System.out.println("list after swapping n: " + list.toString());
    	list.swap();
    	System.out.println("list after swapping list: " + list.toString());
    	
    	//test rotate()
    	System.out.println("list after rotating once: " + rotate(list, 1));
    	
    	
    	


    } // close main

} // close class
