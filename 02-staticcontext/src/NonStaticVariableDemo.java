
public class NonStaticVariableDemo {

	int num;{
	System.out.println("inside non static block");
	}
	NonStaticVariableDemo(int x){
		System.out.println("Inside the constructor");
		this.num = x;
	}
	public static void main(String[] args) {
		System.out.println("static demo");
		NonStaticVariableDemo nsvd = new NonStaticVariableDemo(30);
		System.out.println(nsvd.num);
	}
}
