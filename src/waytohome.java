import java.util.*;
public class waytohome 
{
	public static int steps(int n,int m)
	{
		int ar[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			ar[i][m-1]=1;
		}
		for(int i=0;i<m;i++)
		{
			ar[n-1][i]=1;
		}
		for(int i=n-2;i>=0;i--)
		{
			for(int j=m-2;j>=0;j--)
			{
				ar[i][j]=ar[i+1][j]+ar[i][j+1];
			}
		}
		return ar[0][0];
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println("Number of ways to reach home with "+n+"X"+m+" blocks is "+steps(n,m));


	}

}
