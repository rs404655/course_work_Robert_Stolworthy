
public class StackTest {
	
	public static void main(String [] args) {
		
		// create integer LinkStack
		LinkStack<Integer> lS = new LinkStack<Integer>();
		
		System.out.println("*pushes 8 then 9 onto linked stack*");
		
		// push values 8 then 9 on stack and test push()
		lS.push(8);
		lS.push(9);
		
		// test size() and top()
		System.out.println("Size of LinkedStack: " + lS.size() + "\nTop of LinkedStack: " + lS.top());
		
		// test pop()
		System.out.println("What comes out when pop() is used: " + lS.pop());
		
		// test isEmpty()
		System.out.println("is LinkedStack empty? " + lS.isEmpty());
		
		// test pop()
		System.out.println("*pops the final element*");
		lS.pop();
		
		// test isEmpty()
		System.out.println("is LinkedStack empty? " + lS.isEmpty());
		
		System.out.println();
		
		// create integer ArrayListStack
		ArrayListStack<Integer> aS = new ArrayListStack<Integer>();
		
		System.out.println("*pushes 8 then 9 onto ArrayList stack*");
		
		// push the values 8 and 9 and test push()
		aS.push(8);
		aS.push(9);
		
		// test size()
		System.out.println("Size of ArrayListStack: " + aS.size());
		
		// test top()
		System.out.println("Top of ArrayListStack: " + aS.top());
		
		// test pop()
		System.out.println("What comes out when pop() is used: " + aS.pop());
		
		// test isEmpty()
		System.out.println("is ArrayListStack empty? " + aS.isEmpty());		
		
		// test pop()
		System.out.println("*pops final element out*");
		aS.pop();
		
		// test isEmpty
		System.out.println("is ArrayListStack empty? " + aS.isEmpty());
		
		System.out.println();
		
		// create string LinkStack
		LinkStack<String> lsS = new LinkStack<String>();
		
		System.out.println("*pushes Hi then Hey onto linked stack*");
		
		// push 'Hi' then 'Hey' testing push()
		lsS.push("Hi");
		lsS.push("Hey");
		
		// test size() and top()
		System.out.println("Size of LinkedStack: " + lsS.size() + "\nTop of LinkedStack: " + lsS.top());
		
		// test pop()
		System.out.println("What comes out when pop() is used: " + lsS.pop());
		
		// test isEmpty()
		System.out.println("is LinkedStack empty? " + lsS.isEmpty());
		
		// test pop()
		System.out.println("*pops out the final element*");
		lsS.pop();
		
		// test isEmpty()
		System.out.println("is LinkedStack empty? " + lsS.isEmpty());
		
		System.out.println();
		
		// create string ArrayListStack
		ArrayListStack<String> asS = new ArrayListStack<String>();
		
		System.out.println("*pushes Hi then Hey onto ArrayList stack*");
		
		// push 'Hi' then 'Hey' onto stack testing push()
		asS.push("Hi");
		asS.push("Hey");
		
		// test size()
		System.out.println("Size of ArrayListStack: " + asS.size());
		
		// test top()
		System.out.println("Top of ArrayListStack: " + asS.top());
		
		// test pop()
		System.out.println("What comes out when pop() is used: " + asS.pop());
		
		// test isEmpty()
		System.out.println("is ArrayListStack empty? " + asS.isEmpty());		
		
		// test pop()
		System.out.println("*pops final element out*");
		asS.pop();
		
		// test isEmpty()
		System.out.println("is ArrayListStack empty? " + asS.isEmpty());
		
	} // close main()

}
