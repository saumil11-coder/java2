package rain;

public class RainProblem {
//Brute force
	public static void main(String[] args) {
		int arr[]= {0,1,2,0,0,3,1,0,3};
		int water=0;
		int lmax=arr[0];
		int rmax=arr[arr.length-1];
		for(int i=1;i<arr.length-1;i++)
		{
			for(int j=i;j>=0;j--)
			{
				if(arr[j]>lmax)
				{
					lmax=arr[j];
				}
			}
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>rmax)
				{
					rmax=arr[j];
				}
			}
			water+=Math.min(rmax, lmax)-arr[i];
		}
		System.out.println(water);
	}
}