package setdemo;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String>{

	public int compare(String o1, String o2) {
		int n1 = o1.length();
		int n2 = o2.length();
		
		if(n1 < n2) {
			return -1;
		}
		else if(n1 > n2) {
			return 1;
		}
		else {
			return o1.compareTo(o2);
		}
	}
}
