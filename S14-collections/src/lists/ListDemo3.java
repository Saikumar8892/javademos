package lists;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100; i += 9) {
			list.add(i);
		}
		System.out.println("First List  : " + list);
		
		System.out.println("Element at position 8: " + list.get(5));
		
		list.remove(5);
		System.out.println("List after removing element at 5: " + list);
		
		list.remove(new Integer(77));
		System.out.println("List after removing element 77: " + list);

	}

}
