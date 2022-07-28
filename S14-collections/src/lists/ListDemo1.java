package lists;

import java.util.ArrayList;

public class ListDemo1 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 50; i += 5) {
			list.add(i);
		}
		System.out.println(list);
		
		list.add(6);
		System.out.println(list);
		
		list.add(5, 55);
		System.out.println(list);
		
		list.set(6,  56);
		System.out.println(list);

	}

}