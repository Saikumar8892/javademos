package assistedproject2;
// suppose we didn't put in public they showing exception error
public class Practice1 {

	protected int number = 20;
	protected String name = "SAI KUMAR";
	
	protected int count() {
		return 30;
	}
	
	protected Practice1() {
		System.out.println("Protected");
	}
	public static void main(String[] args) {
		Practice1 p1 = new Practice1();
		System.out.println(p1.number);
		System.out.println(p1.name);
		System.out.println(p1.count());
	}
	
}
