package assistedprojects;

public class method {

		public int additionnumbers(int x,int y,int z,int k) {
			int a = x+y+z+k;
			return a;
		}
		public int subtractnumbers(int x,int y,int z,int k) {
			int a = x-y-z-k;
			return a;
		}
		public int multiplynumbers(int x,int y,int z,int k) {
			int a = x*y*z*k;
			return a;
		}

		public static void main(String[] args) {

			method b=new method();
			int ans= b.additionnumbers(10,3,6,8);
			System.out.println("Addition is :"+ans);
			method b1=new method();
			int ans1= b1.subtractnumbers(10,3,6,8);
			System.out.println("Subtract is :"+ans1);
			method b2=new method();
			int ans2= b2.multiplynumbers(10,3,6,8);
			System.out.println("Multiply is :"+ans2);
			}
}

