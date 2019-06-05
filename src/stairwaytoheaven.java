import java.util.*;
public class stairwaytoheaven 
{
	public static int stairsteps(int n)
	{
		int ways[]=new int [n+1];
		ways[0]=1;
		ways[1]=1;
		for(int i=2;i<=n;i++)
		{
			ways[i]=ways[i-1]+ways[i-2];
		}
		return ways[n];
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Number of ways to reach heaven with "+n+" stairs is "+stairsteps(n));

	}

}
