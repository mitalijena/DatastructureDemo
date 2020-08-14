package stack;

import java.util.Iterator;
import java.util.LinkedList;

public class StackUsingLinkedList<T> implements Iterable<T> {
	
	private LinkedList<T> linkedList = new LinkedList<T>();
	
	public StackUsingLinkedList() {		
	}
	
	public StackUsingLinkedList(T element) {
		push(element);
	}
	
	public void push(T element) {
		linkedList.addLast(element);
	}
	
	public T pop() {
		return linkedList.removeLast();
	}
	
	public T peek() {
		return linkedList.peekLast();
	}
	
	public int size() {
		return linkedList.size();
	}
	
	public boolean isEmpty() {
		return linkedList.isEmpty();
	}
	
	public Iterator<T> iterator() {
		return linkedList.iterator();
	}
	
	public String toString() {
		Iterator itr = linkedList.iterator();
		StringBuffer sb = new StringBuffer();
		while(itr.hasNext()) {
			sb = sb.append(itr.next());
		}
		return sb.toString();
	}
}
