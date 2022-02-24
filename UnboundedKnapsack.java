package greedy;

public class UnboundedKnapsack {
	public static int Unbounded(int wt[],int val[],int W,int n) {
		if(W==0||n==0)
		{
			return 0;
		}
		if(wt[n-1]>W)
		{
			return Unbounded(wt, val, W, n-1);
		}
		return Math.max(Unbounded(wt, val, W, n-1),val[n-1]+Unbounded(wt, val, W-wt[n-1], n));
	}
	
	public static void main(String[] args) {
	int n=5;
	int w=8;
	int []wt= {1,2,4,5,9};
	int[] val= {10,40,50,70,60};
	int result=Unbounded(wt, val, w, n);
	System.out.println(result);
	

	}

}
