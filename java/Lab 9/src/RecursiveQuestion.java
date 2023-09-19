
public class RecursiveQuestion {
	
	/**
	 * convert() converts a String object of a number into an integer value
	 * 
	 * @param s
	 * a String of a number to be converted into an integer
	 * @return
	 * if the length of the string is one return the integer it represents
	 * else return the integer of the char at the beginning times 10 to the power of
	 * the length of the strign
	 */
	public static int convert(String s) {
		
		// if the string length is 1 return the char as int
		// base case
		if(s.length() == 1) {
			
			// return the char times 10 to the power of 0 (1)
			return pow(10, s.length() - 1) * (s.charAt(0) - '0');
			
		} // close if
		
		/** else return the char at the beginning of the string times
		* 10 to the power of the length of the string then add it to the other
		* recursive calls
		*/
		else {
			
			return pow(10, s.length() - 1) * (s.charAt(0) - '0') + convert(s.substring(1));
			
		} // close els
		
	} // close convert()
	
	
	/**
	 * fibBinaryRecursive gets an integer of representing the position of an integer
	 * in the fibonacci sequence (starting at 0) and then recursively adds using an
	 * algorithm to get the number
	 * 
	 * @param k
	 * an integer value that holds the position of the wanted fibonacci sequence number
	 * starting at 0
	 * @return
	 * 0 if k is equal to 0
	 * 1 if k is equal to 1
	 * else return the position - 1 plus position - 2
	 */
	public static int fibBinaryRecursive(int k){
		
		// return 0 if k = 0
		// base case
		if(k == 0) return 0;
		
		//return 1 if k = 1
		// base case
		if(k == 1) return 1;
		
		// else recursively decrement and recursively subtract 2 till
		// the base cases are met and add them together
		else {
			
			return fibBinaryRecursive(k-1) + fibBinaryRecursive(k-2);
			
		} // close else
		
	} // close fibBinaryRecursive()
	
	/**
	 * Hanoi() gives step by step instructions on how to beat the Tower of Hanoi game
	 * using recursion
	 * 
	 * @param disk
	 * the amount of disks - 1 as they are represented starting at 0
	 * @param start
	 * the first peg in the game
	 * @param target
	 * the last peg in the game
	 * @param spare
	 * the second or middle peg in the game
	 */
	public static void Hanoi(int disk, int start, int target, int spare) {
		
		// if at disk 0 move the disk from its last position to new one
		if(disk == 0) {
			
			// print instructions
			System.out.println("move " + disk + " from " + start + " to " + target);
			
		} // close if
		
		// Move other disks around
		else {
			
			Hanoi(disk - 1, start, spare, target);
			
			// print instructions
			System.out.println("move " + disk + " from " + start + " to " + target);
			
			Hanoi(disk - 1, spare, target, start);
			
		} //  close else
		
	} // close Hanoi()
	
	
	/**
	 * permutations() prints every possible orientation of the numbers of an
	 * arrays order
	 * 
	 * @param a
	 * an integer array that hold the values to be permuted
	 * @param aLength
	 * the length of the array
	 */
	public static void permutations(int [] a, int aLength) {
		
		
		// if the array length is at 1 print the entire array
		if(aLength == 1) {
			
			System.out.println();
			for(int i = 0; i < a.length; i++) {
				
				System.out.print(a[i] + " ");
				
			}
			return;
		} // close if
		
		// for loop to go through every order of values
		for(int i = 0; i < aLength - 1; i++) {
			
			permutations(a, aLength - 1);
			
			// if even swap a[i] with a[aLength - 1]
			if(aLength % 2 == 0) {
				
				int temp = a[i];
				a[i] = a[aLength - 1];
				a[aLength - 1] = temp;
				
			} // close if
			
			// if odd swap a[0] with a[aLength - 1]
			else {
				
				int temp = a[0];
				a[0] = a[aLength - 1];
				a[aLength - 1] = temp;
				
			}
			
			
		}
		permutations(a, aLength - 1);
		
		
	} // close permutations()
	
	
	public static char [] reverse(char [] A, int start, int end) {
		
		if (start >= end) {
			return A;
		}
		
		else{
			char temp = A[start];
			A[start] = A[end];
			A[end] = temp;
			reverse(A, start + 1, end - 1);
		}
		
		return A;
	}
	
	/**
	 * pow() calculates simple exponential equations in O(logn)
	 * 
	 * @param x
	 * the base of the exponent
	 * @param n
	 * the exponent
	 * @return
	 * the value of the exponential equation
	 */
	public static int pow(int x, int n) {
			
		// base case if exponent is 0 return 1
		if (n == 0) return 1;
		
		// base case if exponent is 1 return x
		if (n == 1) return x;
		
		// if exponent is even use equation x^n = x^n/2 * x^n/2
		if(n % 2 == 0) {
			
			// value to hold x^n/2 to cut runtime
			int t = pow(x, n/2);
			
			// x^n/2 * x^n/2
			return t * t;
			
		} // close if
		
		// if exponent is odd use equation x^n = x^n/2 * x^n/2 * x 
		else {
			
			// value to hold x^n/2 to cut runtime
			int t = pow(x, n/2);
			
			// x * x^n/2 * x^n/2
			return x * t *t;
			
		} // close else
		
			
	} // close pow()
	
	public static void main(String [] args) {
		
		// Testing convert() with the string '1234'
		System.out.println("Testing convert() by converting the string '1234':");
		int i = convert("1234");
		System.out.println(i);
		System.out.println();
		
		// Testing convert() with the string '5678'
		System.out.println("Testing convert() by converting the string '5678':");
		i = convert("5678");
		System.out.println(i);
		System.out.println();
		
		//Testing fibBinaryRecursive() with 6 and 9
		System.out.println("Testing fibBinaryRecursive with 6(8): ");
		System.out.println(fibBinaryRecursive(6));
		System.out.println("Testing fibBinaryRecursive with 9(34): ");
		System.out.println(fibBinaryRecursive(9));
		System.out.println();
		
		// Testing permutations() with array 1, 2, 5, 10
		System.out.println("Testing permutations: ");
		int [] array = {1,2,5, 10};
		permutations(array, 4);
		
		// Testing Towers of Hanoi Hanoi() function with disks 0-3 and pegs 6, 7, 8
		System.out.println();
		System.out.println();
		System.out.println("Towers of Hanoi with 4 disks(0-3) and pegs 6,7,8(in-order horizontally):");
		Hanoi(3, 6, 8, 7);
		
		// Testing reverse()
		System.out.println();
		System.out.println();
		System.out.println("Testing reverse:");
		
		char [] test = {'A', 'B', 'C', 'D', 'E'};
		
		for(int j = 0; j < test.length; j++) {
			
			System.out.print(test[j]);
			
		}
		
		System.out.println();
		reverse(test, 1, 4);
		
		for(int j = 0; j < test.length; j++) {
			
			System.out.print(test[j]);
			
		}
		
		System.out.println();
		
		reverse(test, 0, 4);
		
		for(int j = 0; j < test.length; j++) {
			
			System.out.print(test[j]);
			
		}
		
		// Testing pow()
		System.out.println();
		System.out.println();
		System.out.println("Testing pow() with 10 to the power of 5 (100000):");
		System.out.println("" + pow(10,5));
		System.out.println("Testing pow() with 2 to the power of 10 (1024):");
		System.out.println("" + pow(2,10));
		System.out.println("Testing pow() with 3 to the power of 9 (19683):");
		System.out.println("" + pow(3,9));
		
	}
	
	
}
