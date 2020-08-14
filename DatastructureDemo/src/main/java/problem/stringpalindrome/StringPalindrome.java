package problem.stringpalindrome;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class StringPalindrome {
	
	static int NO_OF_CHARS = 256;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String is palindrome : "+isPallindrome("MADAM"));
		System.out.println("String is palindrome : "+isPallindrome("MADAI"));
		System.out.println("String is palindrome Using Stack: "+isPallindromeUsingStack("MADAM"));
		System.out.println("String is palindrome using Stack: "+isPallindromeUsingStack("MADAI"));
		System.out.println("String is palindrome using Queue: "+isPallindromeUsingQueue("MADAM"));
		System.out.println("String is palindrome using Queue: "+isPallindromeUsingQueue("MADAI"));
		System.out.println("String can be palindrome : "+canBePalindrome("MAADM"));
		System.out.println("String can be palindrome : "+canBePalindrome("MADAI"));
		
	}
	
	public static boolean isPallindrome(String str) {
		String reverseString = "";
		int len = str.length();
		for(int i=len-1;i>=0;i--) {
			reverseString = reverseString + str.charAt(i);
		}
		if(str.equalsIgnoreCase(reverseString)) {
			return true;
		} else
			return false;
	}
	
	public static boolean isPallindromeUsingStack(String str) {
		Stack<Character> charStack = new Stack<>();
		for(int i=0;i<=str.length()-1;i++) {
			charStack.push(str.charAt(i));
		}
		String reverseString = "";
		while(!charStack.isEmpty()) {
			reverseString = reverseString+charStack.pop();
		}
		if(str.equalsIgnoreCase(reverseString)) {
			return true;
		} else
			return false;
	}
	
	public static boolean isPallindromeUsingQueue(String str) {
		Queue<Character> queue = new LinkedList<Character>();
		for(int i=0;i<=str.length()-1;i++) {
			queue.add(str.charAt(i));
		}
		String reverseString = "";
		while(!queue.isEmpty()) {
			reverseString = reverseString+queue.remove();
		}
		if(str.equalsIgnoreCase(reverseString)) {
			return true;
		} else
			return false;
	}
	
	public static boolean canBePalindrome(String str) {
		
		List<Character> list = new ArrayList<Character>(); 
		  
	    // For each character in input strings, 
	    // remove character if list contains 
	    // else add character to list 
	    for (int i = 0; i < str.length(); i++) { 
	        if (list.contains(str.charAt(i))) 
	            list.remove((Character) str.charAt(i)); 
	        else
	            list.add(str.charAt(i)); 
	    } 
	
	    // if character length is even list is expected to be empty 
	    // or if character length is odd list size is expected to be 1 
	    if (str.length() % 2 == 0 && list.isEmpty() // if string length is even 
	            || (str.length() % 2 == 1 && list.size() == 1)) // if string length is odd 
	        return true; 
	    else
	        return false;
    }

}
