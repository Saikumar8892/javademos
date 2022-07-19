package assistedproject2;

class Example1 {

	int number = 20;
	String name = "SAI";
	
	void show() {
		System.out.println("default method");
	}
	
	Example1(){
		System.out.println("default constructor");
	}
	
	public static void main(String[] args) {
		Example1 e1 = new Example1();
		System.out.println(e1.number);
		System.out.println(e1.name);
		e1.show();
	}
}
