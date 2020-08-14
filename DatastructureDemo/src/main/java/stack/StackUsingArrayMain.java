package stack;

import java.util.Iterator;

public class StackUsingArrayMain {

	public static <T> void main(String[] args) {
		StackUsingArray<String> stack1 = new StackUsingArray(10);
		stack1.push("Mitali1");
		stack1.push("Mitali2");
		stack1.push("mitali3");
		stack1.push("mitali4");
		stack1.push("Mitali5");
		System.out.println("Initial Stack is :"+stack1.toString());
		System.out.println(stack1.peek());
		System.out.println("After Peek Stack is :"+stack1.toString());
		System.out.println(stack1.pop());
		System.out.println("After Pop Stack is :"+stack1.toString());
		Iterator itr = stack1.iterator();
		while(itr.hasNext()) {
			System.out.println("Elements in Stack : "+itr.next());
		}
	}

}
