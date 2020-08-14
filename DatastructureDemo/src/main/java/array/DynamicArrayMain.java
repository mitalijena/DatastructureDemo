package array;

import java.lang.reflect.Array;
import java.util.Iterator;

public class DynamicArrayMain {

	public static void main(String[] args) {
		DynamicArray arr = new DynamicArray();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(8);
		arr.add(9);
		arr.add(10);
		arr.set(5, 12);
		System.out.println(arr.indexOf(7));
		//System.out.println(arr.remove(4));
		System.out.println(arr.toString());
		System.out.println(arr.size());
		System.out.println(arr.get(8));
		Iterator itr = arr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
