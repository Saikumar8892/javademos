package assistedproject6;

import java.util.Collection;
import java.util.LinkedList;

public class Collections {

	  public static void main(String args[])
	    {
	 
	        // creating an empty LinkedList
	        Collection<String> list = new LinkedList<String>();
	 
	        // use add() method to add elements in the list
	        list.add("Welcome");
	        list.add("to");
	        list.add("java Training");
	 
	        // Output the present list
	        System.out.println(" " + list);
	 
	        // Adding new elements to the end
	        list.add("simplilearn");
	        list.add("platform");
	 
	        // printing the new list
	        System.out.println(" " + list);
	    }
}
