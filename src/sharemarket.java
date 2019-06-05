import java.util.*;
public class sharemarket 
{
	public static int maxprofit(int price[],int n)
	{
		int minuptil[]=new int[n];
		minuptil[0]=price[0];
		int maxprofit[]=new int[n];
		for(int i=1;i<n;i++)
		{
			minuptil[i]=Math.min(minuptil[i-1], price[i]);
		}
		int highestprofit=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			maxprofit[i]=price[i]-minuptil[i];
			if(highestprofit<maxprofit[i])
				highestprofit=maxprofit[i];
		}
		return highestprofit;
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int price[]=new int[n];
		for(int i=0;i<n;i++)
		{
			price[i]=sc.nextInt();
		}
		System.out.println("Maximum profit that can be earned by selling share ="+maxprofit(price,n));		
	}

}
