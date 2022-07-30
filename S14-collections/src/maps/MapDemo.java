package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	
	static Map<String, String> users;

	public static void main(String[] args) {
		
		Map<String, Integer> scores = new HashMap<String, Integer>();
		
		scores.put("Bobby", 99);
		scores.put("Janu", 60);
		scores.put("klax", 70);
		scores.put("Tomm", 65);
		scores.put("hardd", 94);
		scores.put("Leel", 80);
		
//		System.out.println(scores);
		
		users = new HashMap<String, String>();
		users.put("sai", "sa123");
		users.put("Asha", "9873");
		users.put("momina", "kd73");
		System.out.println(users);
		
		System.out.println("Password for user sai = " + users.get("sai"));
		
		System.out.println("Is User Authenticated: " + authenticate("sai", "sa123"));
		System.out.println("Is User Authenticated: " + authenticate("sai", "sai1234"));
		
		Set<String> keys = users.keySet();
		System.out.println(keys);
		
		Collection<String> values = users.values();
		System.out.println(values);
		
		for (String key : keys) {
			System.out.println("Key: " + key + ", Value: " + users.get(key));
		}
		
	}
	
	static boolean authenticate(String inputUser, String inputPassword) {
		
		return users.get(inputUser).equals(inputPassword);
	}
	
}
