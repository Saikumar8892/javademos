package assistedproject3;

public class MethodOverload {

	static int add(int x , int y) {
		return x+y;
	}
	static double add(double x , double y) {
		return x+y;
	}
	 static int add(int x , int y , int z) {
		return x+y+z;
	}
	public static void main(String[] args) {
		System.out.println(MethodOverload.add(2,5,6));
		System.out.println(MethodOverload.add(2,20));
		System.out.println(MethodOverload.add(22.2,2));
	}
}

