package arrays;

public class SumOfArray {

	public static void main(String[] args) {
		int a[] = {78,34,21,11,9};
		//for loop we can using
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
		//for each loop we can using
		int sum2 = 0;
		for (int element : a) {
			sum2 += element;
		}
		System.out.println(sum2);
		
	}
}
