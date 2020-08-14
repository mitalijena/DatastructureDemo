package queue;

import java.util.Iterator;

public class QueuekUsingLinkedListMain {

	public static <T> void main(String[] args) {
		QueueUsingLinkedList q = new QueueUsingLinkedList();
		System.out.println("Queue is :"+q.toString());
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		System.out.println("Queue after push is :"+q.toString());
		System.out.println(q.peek());
		System.out.println("Queue after peek is :"+q.toString());
		System.out.println(q.pop());
		System.out.println("Queue after pop is :"+q.toString());
		Iterator itr = q.iterator();
		while(itr.hasNext()) {
			System.out.println("Elements in queue : "+itr.next());
		}
	}

}
