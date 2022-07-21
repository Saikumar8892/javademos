package assistedproject6;

import java.lang.reflect.Array;

public class Ex1 {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 10;
			int c = a/b;
			int a1[] = {1,2,3,4,5};
			System.out.println(a1[5]);
			System.out.println(c);	
		}
		catch ( Exception e) {
			System.out.println("Sai kumar");
		}
		finally {
			System.out.println("Hello sai");
		}
	}
}
