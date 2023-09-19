

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
	
    public static void main(String[] args) {
    	
    	// test default constructor
    	IntNode n = new IntNode();
    	
    	// test toString()
    	System.out.println("The IntNode n = " + n.toString());
    	
    	// Create and test IntNode using other constructor
    	IntNode list = new IntNode(12,n);
    	
    	// test toString()
    	System.out.println("The IntNode list = " + list.toString());
    	
    	IntNode n2 = new IntNode(13,null);
    	
    	// test setData() and setLink()
    	n.setData(11);
    	n.setLink(n2);
    	
    	// test getData() and getLink()
    	System.out.println("The IntNode n now holds the value = " + n.getData() + " and the link to n2 which = " + (n.getLink()).getData());
    	
    	System.out.println("The IntNode list now = " + list.toString());
    	
    	// test addNodeAfterThis()
    	n.addNodeAfterThis(15);
    	System.out.println("The IntNode list now after add= " + list.toString());
    	
    	// test removeNodeAfterThis()
    	n.removeNodeAfterThis();
    	System.out.println("The IntNode list now after remove = " + list.toString());
    	
    	// test listLength()
    	System.out.println("The IntNode list length = " + listLength(list));
    	
    	// test search()
    	System.out.println("Does list have the value 13? " + search(list, 13));
    	
    	System.out.println("Does list have the value 21? " + search(list, 21));
    	
    	// make the linked list larger
    	n.addNodeAfterThis(15);
    	
    	// test findMthToLast()
    	System.out.println("What is the 2nd to last variable in list? " + (findMthToLast(list, 2)).getData());

    	

    } // close main

} // close class
