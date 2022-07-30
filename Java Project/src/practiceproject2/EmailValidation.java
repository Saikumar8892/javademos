package practiceproject2;
import java.util.regex.*;
import java.util.*;
public class EmailValidation {
	public static void main(String[] args) {
		ArrayList<String> mail = new ArrayList<String>();
		mail.add("ramu@outlook.com");
		mail.add("xyzfgh^%&2gmail.com");
		mail.add("ghjgv@gmail.com");
		mail.add("hgfds#gmail.com");
		mail.add("raki@yahoo.com");
		String Regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(Regex);
		
		for(String email:mail) {
			Matcher matcher = pattern.matcher(email);
			System.out.println(email+": "+matcher.matches());
		}
		
		
	}
		
}	