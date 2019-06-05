import java.util.*;
public class rodcutter {
	public static int rc(int cost[],int n)
	{
		int rod[]=new int[n+1];
		rod[0]=0;
		for(int i=1;i<n+1;i++)
		{
			int maxv=Integer.MIN_VALUE;
			for(int j=1;j<=i;j++)
			{
				maxv=Math.max(maxv,cost[j]+rod[i-j]);
			}
			rod[i]=maxv;
		}
		return rod[n];
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cost[]=new int[n+1];
		cost[0]=0;
		for(int i=1;i<n+1;i++)
		{
			cost[i]=sc.nextInt();
		}
		System.out.println("Maxmum cost of rod by cutting it in proper segments is "+ rc(cost,n));

	}

}
