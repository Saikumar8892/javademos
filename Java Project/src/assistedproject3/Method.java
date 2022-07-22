package assistedproject3;

public class Method {

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

			Method b=new Method();
			int ans= b.additionnumbers(10,3,6,8);
			System.out.println("Addition is :"+ans);
			Method b1=new Method();
			int ans1= b1.subtractnumbers(10,3,6,8);
			System.out.println("Subtract is :"+ans1);
			Method b2=new Method();
			int ans2= b2.multiplynumbers(10,3,6,8);
			System.out.println("Multiply is :"+ans2);
			}
}

