import java.util.concurrent.atomic.AtomicInteger;

/**
 * The class for Binary Search Tree
 *
 */
/**
 * @author rstolworthy
 *
 */
/**
 * @author rstolworthy
 *
 */
/**
 * @author rstolworthy
 *
 */
/**
 * @author rstolworthy
 *
 */
/**
 * @author rstolworthy
 *
 */
public class BST {
	protected BSTNode root; //the tree root
	
	
	/**
	 * Get the left subtree of this tree
	 * @return the left subtree of this tree
	 */
	private BST getLeftSubtree(){
		return root.getLeft();
	}
	
	/**
	 * Get the right subtree of this tree
	 * @return the right subtree of this tree
	 */
	private BST getRightSubtree(){
		return root.getRight();
	}
	
	/**
	 * Print the tree using in-order traversal strategy
	 */
	public void inOrderPrt(){
		inOrderPrt(0);
	}
	
	/**
	 * private, recursive function
	 *     I slightly changed the method to print right subtree first
	 *     It is to make the display more easier to read
	 * 
	 * @param node
	 * @param indentation
	 * @param branch
	 */
	private void inOrderPrt(int indentation){
		if(root!=null){
			if(getRightSubtree()!=null) getRightSubtree().inOrderPrt(indentation+1);
			
			for(int i=0;i<indentation*4;i++) System.out.print(" ");
			
			System.out.println(root.getData());
			
			if(getLeftSubtree()!=null) getLeftSubtree().inOrderPrt(indentation+1);
		}
	}
	
	
	/**
	 * Debug function, print the tree for debugging purpose
	 */
	public String toString()
	{
		if(root!=null) return root.toString();
		else return null;
	}
	
	///////////////////////////////////////
    ///////////////////////////////////////
	// Please add the functions required for your lab homework here.
	
	/**
	 * gcd() finds the greatest common denominator of a and b
	 * 
	 * @param a 
	 * an int to find the gcd of with b
	 * @param b
	 * an int to find the gcd of with a
	 * @precondition
	 * neither numbers are negative
	 * @return
	 * the gcd of a and b
	 */
	public static int gcd(int a, int b) {
		
		// if a is greater than b and b i greater than or equal to 0
		// return the the greatest common denominator of b and a mod b
		// using the gcd formula
		if (a > b && b>= 0) {
			
			// if b == a we are at the gcd return a
			if (b == 0) return a;
			
			// else use formula
			else return gcd(b, a % b);
			
		} // close if
		
		// if both integers are 0 return 0
		else if(a == 0 && b == 0) {
			
			return 0;
			
		}
		
		// if the number need to be flipped so the greatest integer is a
		else {
			
			return gcd(b, a);
			
		}
		
		
		
	} // close gcd()
	
	/**
	 * insert() inserts new node in proper place in the BST based on int value
	 * 
	 * @param e
	 * int to insert into the tree
	 * @return
	 * true if their is no clone and false if the integer is already in the BST
	 */
	public boolean insert(int e) {
		
		// the current tree root is empty
		if (root == null) {
			
			//create new node and place in the tree
			root = new BSTNode(e, new BST(), new BST());
			return true;
			
		}
		
		// the current root has the same data as wanted insertion return false
		if (e == root.getData()) return false;
		
		// the current root is greater than wanted int insertion
		if( e <= (root.getData())) {
				
			// insert the data into a node from the left subtree
			return root.getLeft().insert(e);
				
		}
			
		// the current node is less than the wanted int to insert
		else {
				
			 // insert the data into a node from the right subtree
			 return root.getRight().insert(e);
				
		}
			
		
		
	} // close insert()
	
	/**
	 * removeMax() removes the max value located in given tree
	 * 
	 * @return max
	 * returns int max which holds the max value located in the tree
	 */
	public int removeMax(){
		
		// value to hold max data
		int max;
		
		// if the root of the right subtree is null
		if (root.getRight().root == null) {
			
			// set max to the data of the root
			max = root.getData();
			
			// set the root to the left subtree
			root = getLeftSubtree().root;
			
			
		}
		
		// else root of the right subtree is not null meaning there is a larger
		// number
		else {
			
			// remove the rightSubtrees max
			return getRightSubtree().removeMax();
			
		}
		
		// return the max number
		return max;
		
		
		
	} // close removeMax()
	/**
	 * remove() removes a desired root that holds the value of e from a BST
	 * 
	 * @param e
	 * int e is the value of the root the program needs to remove
	 * 
	 * @return
	 * true if a e was removed if not return false
	 */
	public boolean remove (int e) {
		
		// base case the subtree is empty
		if (root == null) return false;
		
		// if the data is located at the selected root
		if (e == root.getData()) {
			
			// if the left and right leafs are empty
			if(this.getLeftSubtree().root == null && this.getRightSubtree().root == null ) {
				
				// set the root to null
				root = null;
				
				// return true the value was removed
				return true;
				
			}
			
			// if only the right leaf holds a value
			if(this.getLeftSubtree().root == null && this.getRightSubtree().root != null ) {
				
				// set the root to the right leaf
				root = root.getRight().root;
				
				// return true the value was removed
				return true;
				
			}
			
			// if only the left leaf holds a value
			if(this.getLeftSubtree().root != null && this.getRightSubtree().root == null ) {
				
				// set the root to the left leaf
				root = root.getLeft().root;
				
				// return true the value was removed
				return true;
				
			}
			
			// both leaves hold values
			if(this.getLeftSubtree().root != null && this.getRightSubtree().root != null ) {
				
				// select the left subtree
				BST left = root.getLeft();
				
				// find the max data in the left subtree
				int maxDataLeft = left.removeMax();
				
				// set the root to the max of the left subtree
				root.setData(maxDataLeft);
				
				// return true the value was removed
				return true;
				
			} // close if
			
		} // close if
		
		// if the data is less than the current root
		if (e < root.getData()) {
			
			// move to the left subtree
			return getLeftSubtree().remove(e);
			
		}
		
		// if the data is greater than the current root
		else{
			
			// move to the right subtree
			return getRightSubtree().remove(e);
			
		}
		
	} // close remove()
	
	/**
	 * searchRecursion() searches through a BST to find a node that holds value of e
	 * using recursion
	 * 
	 * @param e
	 * int e is the value of the root we want to find in the BST
	 * @return
	 * BSTNode root that holds the value of e and null if not found
	 */
	public BSTNode searchRecursion(int e) {
		
		// root is null so return null the values is not in the tree
		if (root == null) return root;
		
		// if the current root holds the same value as e return root
		if (e == root.getData()) return root;
		
		// if the current root is greater than e move to the left leaf
		if (e < root.getData()) return this.getLeftSubtree().searchRecursion(e);
		
		// if the current root is less than e move to the right leaf
		else return this.getRightSubtree().searchRecursion(e);
			
	} // close searchRecursion()
	
	/**
	 * searchNonRecursion() searches through a BST to find a node that holds value of e
	 * using iteration
	 * 
	 * @param e
	 * int e is the value of the root we want to find in the BST
	 * @return
	 * BSTNode root that holds the value of e and null if not found
	 */
	public BSTNode searchNonRecursion(int e) {
		
		// cursor holds the BSTNode value of root
		BSTNode cursor = root;
		
		// while the root does not equal null
		while (cursor != null) {
			
			// if e is greater than root move to the right leaf
			if (e > cursor.getData()) cursor = cursor.getRight().root;
			
			// break if cursor now equals null
			if(cursor == null) break;
			
			// if e is less than root move to the left leaf
			if (e < cursor.getData()) cursor = cursor.getLeft().root;
			
			// break if cursor now equals null
			if (cursor == null) break;
			
			// if root's data = e return root
			if (e == cursor.getData()) return cursor;
			
		}
		
		// return null if not found
		return cursor;
		
	}
	
	/**
	 * kthLargestNode() finds the largest node found in the BST
	 * 
	 * @param tree
	 * BST that holds the values to find the kth largest of
	 * @param i
	 * AtomicInteger to iterate through each call to determine the kth largest
	 * @param k
	 * int k holds the values of the amount of times we need to iterate and the number
	 * position distance from the largest
	 * 
	 * @return
	 * the root of the kth largest node
	 */
	public static BSTNode kthLargestNode(BST tree, AtomicInteger i, int k) {
		
		// if the root is null return null
		if(tree.root == null) {
			
			return null;
		
		}
		
		// hold the left leaf
		BSTNode left = kthLargestNode(tree.getRightSubtree(), i, k);
		
		// if the left leaf does not equal null return the leaf
		if(left != null) {
			
			return left;
			
		}
		
		// if the AtomicInteger equals k return root
		if(i.incrementAndGet() == k) {
			
			return tree.root;
			
		}
		
		// else move to the left subtree and increment i
		return kthLargestNode(tree.getLeftSubtree(), i, k);
				

	} // close kthLargestNode()
	
	/**
	 * sum() sums the values of the tree
	 * 
	 * @return
	 * 0 if the tree is empty else return the root plus the left and right subtree
	 */
	public int sum() {
		
		// base case: if the tree is empty return 0
		if (root == null) return 0;
		
		// else tree is not empty
		else {
			
			// return the root plus it's left and right subtree
			return root.getData() + getLeftSubtree().sum() + getRightSubtree().sum();
			
		}
		
	} // close sum
	
	/**
	 * Test cases provided by the instructor
	 * @throws Exception
	 */
	private static void test1() throws Exception{
		BST tree = new BST();
		System.out.println("Initial tree:");
		tree.inOrderPrt(); //test inOrder traversal
		
		boolean rc = true;
		
		//test 1: insert method, and test 2 in-order traversal
		rc = tree.insert(12); System.out.println("\nInsert 12, inserted="+rc+", after adding 12:"); tree.inOrderPrt();
		rc = tree.insert(6);  System.out.println("\nInsert 6, inserted="+rc+", after adding 6:"); tree.inOrderPrt();
		rc = tree.insert(19); System.out.println("\nInsert 19, inserted="+rc+", after adding 19:"); tree.inOrderPrt();
		rc = tree.insert(4);  System.out.println("\nInsert 4, inserted="+rc+", after adding 4:"); tree.inOrderPrt();
		rc = tree.insert(8);  System.out.println("\nInsert 8, inserted="+rc+", after adding 8:"); tree.inOrderPrt();
		rc = tree.insert(16); System.out.println("\nInsert 16, inserted="+rc+", after adding 16:"); tree.inOrderPrt();
		rc = tree.insert(8);  System.out.println("\nInsert 8 (second), inserted="+rc+", after adding 8:"); tree.inOrderPrt();
		rc = tree.insert(5);  System.out.println("\nInsert 5, inserted="+rc+", after adding 5:"); tree.inOrderPrt();
		rc = tree.insert(9);  System.out.println("\nInsert 9, inserted="+rc+", after adding 9:"); tree.inOrderPrt();
		rc = tree.insert(20);  System.out.println("\nInsert 20, inserted="+rc+", after adding 20:"); tree.inOrderPrt();
		
		System.out.println("Inorder traversal results:");
		tree.inOrderPrt(); 
		System.out.print("\n\n");
		
		//test 3: search method
		BSTNode node = tree.searchRecursion(6);
		System.out.println("searchRecursion 6, node="+node);
		node = tree.searchRecursion(22);
		System.out.println("searchRecursion 22, node="+node);
		node = tree.searchRecursion(9);
		System.out.println("searchRecursion 9, node="+node);
		node = tree.searchRecursion(12);
		System.out.println("searchRecursion 12, node="+node);
		node = tree.searchRecursion(8);
		System.out.println("searchRecursion 8, node="+node+"\n");
		
		node = tree.searchNonRecursion(6);
		System.out.println("searchNonRecursion 6, node="+node);
		node = tree.searchNonRecursion(22);
		System.out.println("searchNonRecursion 22, node="+node);
		node = tree.searchNonRecursion(8);
		System.out.println("searchNonRecursion 8, node="+node);
		
		//test 4: remove method
		rc = tree.remove(30); //test case 0: e does not exist
		System.out.println("\nRemove 30, rc="+rc);
		tree.inOrderPrt();
		
		rc = tree.remove(20); //test case 1: leaf
		System.out.println("\nRemove 20, rc="+rc);
		tree.inOrderPrt();
		
		rc = tree.remove(4); //test case 2: left is empty
		System.out.println("\nRemove 4, rc="+rc);
		tree.inOrderPrt();
		
		
		rc = tree.remove(19); //test case 3: right is empty
		System.out.println("\nRemove 19, rc="+rc);
		tree.inOrderPrt();
		
		rc = tree.remove(6); //test case 4: no subtree is empty
		System.out.println("\nRemove 6, rc="+rc);
		tree.inOrderPrt();
		
		rc = tree.remove(12); //more tests: remove root
		System.out.println("\nRemove 12, rc="+rc);
		tree.inOrderPrt();
		
		rc = tree.remove(8); //more tests
		System.out.println("\nRemove 8, rc="+rc);
		tree.inOrderPrt();
		
		rc = tree.remove(5); //more tests
		System.out.println("\nRemove 5, rc="+rc);
		tree.inOrderPrt();
		
		rc = tree.remove(8); //more tests
		System.out.println("\nRemove 8, rc="+rc);
		tree.inOrderPrt();
		rc = tree.remove(16); //more tests
		System.out.println("\nRemove 16, rc="+rc);
		tree.inOrderPrt();
		System.out.print("sum="+tree.sum()+"\n");
		
		System.out.println("\nAdding a series of numbers:");
		tree.insert(30);
		tree.insert(20);tree.insert(10);tree.insert(25);tree.insert(28);tree.insert(24);
		tree.insert(11);tree.insert(5);tree.insert(11);tree.insert(12);
		tree.insert(50);tree.insert(40);tree.insert(35);
		tree.inOrderPrt();
		System.out.print("sum="+tree.sum()+"\n");
		
		System.out.print("sum="+tree.sum()+"\n");
		System.out.print("\n\n");
		
		System.out.println("\nRemove 20 (removeNode case 4):");
		tree.remove(20);
		tree.inOrderPrt();
		System.out.print("sum="+tree.sum()+"\n");
		
		System.out.println("Inorder traversal results: ");
		tree.inOrderPrt();
		System.out.print("\n");
		System.out.print("sum="+tree.sum()+"\n");
	}
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		//You need to let your program pass the  test cases in this function
		test1(); 
		
		BST tree2 = new BST();
		System.out.println("Initial tree:");
		tree2.inOrderPrt(); //test inOrder traversal
		
		boolean rc = true;
		
		//test insert method, and test in-order traversal
		rc = tree2.insert(1); System.out.println("\nInsert 12, inserted="+rc+", after adding 12:"); tree2.inOrderPrt();
		rc = tree2.insert(7);  System.out.println("\nInsert 6, inserted="+rc+", after adding 6:"); tree2.inOrderPrt();
		rc = tree2.insert(8); System.out.println("\nInsert 19, inserted="+rc+", after adding 19:"); tree2.inOrderPrt();
		rc = tree2.insert(9);  System.out.println("\nInsert 4, inserted="+rc+", after adding 4:"); tree2.inOrderPrt();
		rc = tree2.insert(22);  System.out.println("\nInsert 8, inserted="+rc+", after adding 8:"); tree2.inOrderPrt();
		rc = tree2.insert(11); System.out.println("\nInsert 16, inserted="+rc+", after adding 16:"); tree2.inOrderPrt();
		rc = tree2.insert(9);  System.out.println("\nInsert 8 (second), inserted="+rc+", after adding 8:"); tree2.inOrderPrt();
		rc = tree2.insert(10);  System.out.println("\nInsert 5, inserted="+rc+", after adding 5:"); tree2.inOrderPrt();
		rc = tree2.insert(12);  System.out.println("\nInsert 9, inserted="+rc+", after adding 9:"); tree2.inOrderPrt();
		rc = tree2.insert(27);  System.out.println("\nInsert 20, inserted="+rc+", after adding 20:"); tree2.inOrderPrt();
		rc = tree2.insert(26);  System.out.println("\nInsert 20, inserted="+rc+", after adding 20:"); tree2.inOrderPrt();
		rc = tree2.insert(25);  System.out.println("\nInsert 20, inserted="+rc+", after adding 20:"); tree2.inOrderPrt();
		rc = tree2.insert(24);  System.out.println("\nInsert 20, inserted="+rc+", after adding 20:"); tree2.inOrderPrt();
		
		
		
		
		System.out.println("Inorder traversal results:");
		tree2.inOrderPrt(); 
		System.out.print("\n\n");
		
		rc = tree2.remove(11); //remove when left is null and right is not
		System.out.println("\nRemove 19, rc="+rc);
		tree2.inOrderPrt();
		
		//test searchRecursion
		System.out.println("Location of 9 in tree2: " + tree2.searchRecursion(9));
		System.out.println("Location of 22 in tree2: " + tree2.searchRecursion(22));
		System.out.println("Location of 50 in tree2: " + tree2.searchRecursion(50));
		
		System.out.println();
		
		//test searchNonRecursion
		System.out.println("Location of 9 in tree2: " + tree2.searchNonRecursion(9));
		System.out.println("Location of 22 in tree2: " + tree2.searchNonRecursion(22));
		System.out.println("Location of 50 in tree2: " + tree2.searchNonRecursion(50));
		
		System.out.println();
		
		//test kthLargestNode
		AtomicInteger i = new AtomicInteger(0);
		System.out.println("The largest of tree2 is: " + kthLargestNode(tree2, i, 1));
		
		AtomicInteger j = new AtomicInteger(0);
		System.out.println("The 3 largest node of tree2 is: " + kthLargestNode(tree2, j, 3));
		
		System.out.println();
		
		//test gcd()
		System.out.println("The greatest common denominator of 15 and 5: " + gcd(15, 5));
		System.out.println("The greatest common denominator of 8 and 6: " + gcd(6,8));
		
		
	}

}