import java.util.*;
public class sunofrange {
	static int sumuntil[]=new int[1000];
	public static void calculate(int ar[],int n)
	{
		
		sumuntil[0]=ar[0];
		for(int i=1;i<n;i++)
		{
			sumuntil[i]=sumuntil[i-1]+ar[i];
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		calculate(ar,n);
		System.out.println("Enter no of test cases:");
		int t=sc.nextInt();
		while(t>0)
		{
			int i=sc.nextInt();
			int j=sc.nextInt();
			if(i==0)
			{
				System.out.println("Sum between range "+i+" and "+j+" = "+(sumuntil[j]));
				
			}
			else
			{
				System.out.println("Sum between range "+i+" and "+j+" = "+(sumuntil[j]-sumuntil[i-1]));
			}
		}

	}

}
