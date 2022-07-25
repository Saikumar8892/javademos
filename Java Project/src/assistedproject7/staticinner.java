package assistedproject7;


public class staticinner {

	static class Inner{
		static void f2() {
			System.out.println("static method: Inner.f2()");
		}
		void f3() {
			System.out.println("Non static method inside inner class: f3()");
		}
	}
	static void f1() {
		System.out.println("static method: Outer.f1()");
	}
	public static void main(String[] args) {
		staticinner.f1();
		
		staticinner.Inner.f2();
		
		staticinner.Inner inner = new staticinner.Inner();
		inner.f3();
	}
}
