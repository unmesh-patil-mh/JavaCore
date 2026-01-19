package queue;
import java.util.Deque;
import java.util.ArrayDeque;

public class DequeueExm {

	public static void main(String[] args) {
		Deque<Integer> q=new ArrayDeque<>();
		q.addFirst(1);
		q.addLast(2);
		q.addLast(3);
		q.removeFirst();
		q.removeLast();
		System.out.println(q);
		
	}

}
