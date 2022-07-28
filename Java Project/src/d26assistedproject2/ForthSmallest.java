package d26assistedproject2;

import java.util.ArrayList;
import java.util.List;

public class ForthSmallest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100; i += 9) {
			list.add(i);
	}
		System.out.println(" List  : " + list);
	}
}