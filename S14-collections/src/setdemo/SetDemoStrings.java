package setdemo;

import java.util.Set;
import java.util.TreeSet;

public class SetDemoStrings {

	public static void main(String[] args) {
		Set<String> myset = new TreeSet<>();
		myset.add("welcome");
		myset.add("to");
		myset.add("the");
		myset.add("my");
		myset.add("world");
		System.out.println(myset);
		
		Set<String> myset1 = new TreeSet<>(new StringLengthComparator());
		myset1.add("welcome");
		myset1.add("to");
		myset1.add("the");
		myset1.add("my");
		myset1.add("world");
		System.out.println(myset1);
	}
}
