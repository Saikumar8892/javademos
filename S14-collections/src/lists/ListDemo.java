package lists;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(5);
		list.add("sai");
		list.add(30.0);
		System.out.println(list);
		
		ArrayList<Integer> myintegerlist = new ArrayList<>();
		myintegerlist.add(5);
		myintegerlist.add(new Integer(5));
		System.out.println(myintegerlist);
		
		ArrayList<String> mystringlist = new ArrayList<>();
		mystringlist.add("sai");
		mystringlist.add(new String("kumar"));
		System.out.println(mystringlist);
		
		ArrayList<Double> mydoublelist = new ArrayList<>();
		mydoublelist.add(30.0);
		mydoublelist.add(new Double(3.6));
		System.out.println(mydoublelist);
	}
}
