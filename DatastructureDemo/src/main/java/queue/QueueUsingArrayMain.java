package queue;

import java.util.Iterator;

public class QueueUsingArrayMain {

	public static <T> void main(String[] args) {
		QueueUsingArray<String> q = new QueueUsingArray(10);
		q.enqueue("A");
		q.enqueue("B");
		q.enqueue("C");
		System.out.println("Elements in Queue : "+q.toString());
		System.out.println(q.dequeue());
		System.out.println("Elements in Queue : "+q.toString());
	}

}
