package Sassistedproject10;

import java.util.regex.*;
public class RegularExpression {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("..m");
		Matcher m = p.matcher("aim");
		boolean b = m.matches();
		System.out.println(b);
	

	    boolean b2 = Pattern.matches(".m", "a");
	    System.out.println(b2);
	    
	    System.out.println(Pattern.matches("[Sai]", "i"));
	    System.out.println(Pattern.matches("simpli", "j"));
	    System.out.println(Pattern.matches("[NBK]", "B"));
  }
}