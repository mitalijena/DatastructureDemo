package stack;

import java.util.Iterator;

public class StackUsingLinkedListMain {

	public static <T> void main(String[] args) {
		StackUsingLinkedList<String> stack = new StackUsingLinkedList();
		System.out.println("Stack is :"+stack.toString());
		StackUsingLinkedList<String> stack1 = new StackUsingLinkedList("Mitali1");
		stack1.push("Mitali2");
		stack1.push("mitali3");
		stack1.push("mitali4");
		stack1.push("Mitali5");
		System.out.println("Stack is :"+stack1.toString());
		System.out.println(stack1.peek());
		System.out.println("Stack is :"+stack1.toString());
		System.out.println(stack1.pop());
		System.out.println("Stack is :"+stack1.toString());
		Iterator itr = stack1.iterator();
		while(itr.hasNext()) {
			System.out.println("Elements in Stack : "+itr.next());
		}
	}

}
