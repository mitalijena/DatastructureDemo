package stack;

import java.util.Iterator;
import java.util.LinkedList;

public class StackUsingArray<T> implements Iterable<T> {
	
	private T[] arr;
	private int len = 0;
	private int top = -1;
	
	public StackUsingArray() {		
	}
	
	public StackUsingArray(int cap) {
		arr = (T[])new Object[cap];
	}
	
	public void push(T element) {
		top++;
		arr[top] = element;
		len++;
	}
	
	public T pop() {
		T data = arr[top];
		T[] new_arr = (T[]) new Object[len - 1];
		for(int i=0,j=0;i < len;i++,j++) {
			if(i == top) {
				j--;
			}
			else new_arr[j] = arr[i];
		}
		arr = new_arr;
		--len;
		return data;
	}
	
	public T peek() {
		return arr[top];
	}
	
	public int size() {
		return arr.length;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public Iterator<T> iterator() {
			return new java.util.Iterator<T>() {
				int top = len-1;
			      public boolean hasNext() {
			        return top < len && top > -1;
			      }

			      public T next() {
			    	  T data = (T) new Object();
			    	  if(top > -1) {
			    		  data= arr[top--];
			    	  }
			    	  return data;
			      }

			      public void remove() {
			        throw new UnsupportedOperationException();
			      }
			    };
	}
	
	public String toString() {
		if (len == 0) return "[]";
	    else {
	      StringBuilder sb = new StringBuilder(len).append("[");
	      for (int i = 0; i < len - 1; i++) sb.append(arr[i] + ", ");
	      return sb.append(arr[len - 1] + "]").toString();
	    }
	}
}
