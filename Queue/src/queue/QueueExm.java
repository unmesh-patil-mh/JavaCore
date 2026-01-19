package queue;
import java.util.Queue;
import java.util.PriorityQueue;

public class QueueExm {

	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue<>();
		q.add(1);
		q.offer(2);
//		OFFER IS ALSO USED TO ADD ELEMENT BUT RETURN NULL IF ISSUE
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		q.add(7);
		q.remove();
//		REMOVE ELEMENTS FROM START
		System.out.println(q);
		
		for(int i:q) {
			System.out.println(i);
		}
		
		System.out.println(q.element());
//		RETRIEVE THE ELEMENT FROM THE START
		q.clear();
		System.out.println(q.peek());
//		ALSO USED TO RETRIEVE ELEMENT FROM START BUT RETURN NULL IF QUEUE IS EMPTY
	}

}
