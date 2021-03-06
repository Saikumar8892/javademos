package d26assistedproject3;

public class SumOfN {
	static int a = 22;
	static int b = 133;
	static long tables[][]= new long[b][a+1];
	static void buildSparseTable(int arr[],int n)
	{
		for(int i=0;i<n;i++)
			tables[i][0]=arr[i];
		for(int j=1;j<=a;j++)
			for(int i=0;i<=n-(1 <<j); i++)
				tables[i][j]=tables[i][j-1]+tables[i+(1 <<(j-1))][j-1];
	}
	static long query(int L, int R) {
		long answer = 0;
		for(int j=a;j>=0;j--)
		{
			if(L+(1<<j)-1<=R)
			{
				answer=answer+tables[L][j];
				L+=1<<j;
				
			}
		}
		return answer;
	}
	

	public static void main(String[] args) {
		int arr[] = {5,6,8,9,3,2,4};
		int n = arr.length;
		buildSparseTable(arr,n);
		System.out.println(query(0,6));
		System.out.println(query(2,5));
		System.out.println(query(2,4));
		System.out.println(query(1,6));

	}

}
