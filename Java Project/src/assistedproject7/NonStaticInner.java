package assistedproject7;

public class NonStaticInner {

	public static void main(String[] args) {
		NonStaticInner outer = new NonStaticInner();
		outer.f1();
		
		NonStaticInner.Inner inner = outer.new Inner();
		inner.f2();
		
	}

	void f1() {
		System.out.println("Non-Static Method: Outer.f1()");
	}
	
	class Inner {
		void f2() {
			System.out.println("Non-static Inner class non-static method");
		}
	}
}
