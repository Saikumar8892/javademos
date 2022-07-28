package d26assistedproject5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DeleteFirstOccurence {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100; i += 9) {
			list.add(i);
	}
	System.out.println("First List  : " + list);
	
	

	list.remove(0);
	System.out.println("List after removing element at : " + list);
}
}