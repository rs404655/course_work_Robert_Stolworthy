
public class QueueTest {
	
	public static void main(String[] args) {
		
		// create integer queue
		LinkedQueue<Integer> q = new LinkedQueue<Integer>();
		
		// enqueue the values 8 and 9 testing enqueue()
		q.enqueue(8);
		q.enqueue(9);
		
		// test size()
		System.out.println("Size of the integer queue: " + q.size());
		
		// test front()
		System.out.println("Front of the integer queue: " + q.front());
		
		// test isEmpty()
		System.out.println("Is the queue empty? " + q.isEmpty());
		
		// test dequeue()
		System.out.println("First dequeue(): " + q.dequeue());
		
		System.out.println("Second dequeue(): " + q.dequeue());
		
		// test isEmpty()
		System.out.println("Is the queue empty? " + q.isEmpty());
		
		System.out.println();
		
		// create a string queue
		LinkedQueue<String> sq = new LinkedQueue<String>();
		
		// test enqueue()
		sq.enqueue("Hey");
		sq.enqueue("Hi");
		sq.enqueue("How are you?");
		sq.enqueue("Good, you?");
		sq.enqueue("Good");
		sq.enqueue("Okay I'll see you later");
		sq.enqueue("Okay, bye");
		
		// test size()
		System.out.println("Size of the integer queue: " + sq.size());
		
		// test front()
		System.out.println("Front of the integer queue: " + sq.front());
		
		// test isEmpty()
		System.out.println("Is the queue empty? " + sq.isEmpty());
		
		// test dequeue()
		System.out.println("Conversation using queue: ");
		for(int i = 0; i < 7; i++) {
			System.out.println(sq.dequeue());
		}
		
		// test isEmpty()
		System.out.println("Is the queue empty? " + sq.isEmpty());
		
	} // close main

}
