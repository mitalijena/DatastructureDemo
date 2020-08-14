package queue;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueUsingArray<T> implements Iterable<T> {
	
	private T[] arr;
	private int capacity = 0;
	private int front = 0;
	private int back = 0;
	
	public QueueUsingArray(int maxSize) {	
		arr = (T[])new Object[maxSize];
		capacity = maxSize + 1;
	}
	
	public void enqueue(T element) {
		arr[back] = element;
		if(++back == capacity)
			back = 0;
	}
	
	public T dequeue() {
		T data = arr[front];
		T[] newArray = (T[]) new Object[capacity-1];
		front++;
		for(int i=0;i<capacity-2;i++) {
			System.out.println("i="+i+":front:"+front+i);
			newArray[i] = arr[front+i];
		}
		arr = newArray;
		return data;
	}
	
	public int size() {
		if(back > front)
			return capacity - (back + 1);
		else
			return 0;
	}
	
	public Iterator<T> iterator() {
		return null;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer().append("[");
		for(int i=0; i< capacity-1; i++) {
			sb.append(arr[i] + ", ");
		}
		return sb.append("]").toString();
	}
	
}