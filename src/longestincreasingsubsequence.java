import java.util.*;
public class longestincreasingsubsequence 
{

	public static int longest(int ar[],int n)
	{
		int lis[]=new int[n];
		for(int i=0;i<n;i++)
		{
			lis[i]=1;
		}
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(ar[j]<ar[i]&&lis[i]<lis[j]+1)
				{
					lis[i]=lis[j]+1;
				}
			}
		}
		int longseq=0;
		for(int i=0;i<n;i++)
		{
			if(longseq<lis[i])
			{
				longseq=lis[i];
			}
		}
		return longseq;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Longest increasing Sequence = "+longest(ar,n));
		

	}

}
