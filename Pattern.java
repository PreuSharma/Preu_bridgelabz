import java.util.*;
class Pattern{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		if(a==1)
		{	
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		if(a==2)
		{
			for(int i=n;i>=1;i--)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		if(a==3)
		{
			for(int i=1;i<=n;i++)
			{
				for(int j=n-i;j>=1;j--)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
}	