package assistedproject7;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    @SuppressWarnings("removal")
	public static void main(String args[])
    {
        Map<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("a", new Integer(1));
        hm.put("b", new Integer(2));
        hm.put("c", new Integer(3));
        hm.put("d", new Integer(4));
  
        for (Map.Entry<String, Integer> me :hm.entrySet()) {
 
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
    }
}
