package staticbinding;

import java.io.FileReader;

public class CompileTimePolyMorphism {

	public static void main(String[] args) {
		CompileTimePolyMorphism obj = new CompileTimePolyMorphism();
		obj.add(6, 4, 6);
		obj.add(2, 3, 4, 6);
		obj.add(2.3f, 4.5f);
	}
	
	void add(int a, int b, int c) {		
		int result = a + b + c;
		System.out.println("Result = " + result);
	}
	
	void add(float a, float b) {
		float result = a + b;
		System.out.println("Result = " + result);
	}
	
	void add(int a, int b, int c, int d) {
		int result = a + b + c + d;
		System.out.println("Result = " + result);
	}
}
