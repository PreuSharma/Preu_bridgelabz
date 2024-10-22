/*
import java.util.*;
class Stringss3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("str :"+str);
		char[] res=str.toCharArray();
		//Arrays.sort(res);   ---way1
		int count=1;
		for(int i=0;i<str.length()-1;i++)
		{
			if(res[i]==res[i+1])
			{
				count++;
				
			}
			else{
				System.out.println("res :"+res[i] +"="+count);
				count=1;
			}
		}
		System.out.println("res :"+res[res.length-1] +"="+count);
	}
}
		
*/		

//way2

import java.util.*;
class Stringss3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("str :"+str);
		char[] res=str.toCharArray();
		System.out.println(res.length);
		boolean[] counted = new boolean[res.length];
		
		for (int i=0;i<res.length;i++) {
            if (!counted[i]) {                                
                int count=1;                                    
                for (int j=i+1;j<res.length;j++) {
                    if (res[i]==res[j]) {
                        count++;
                        counted[j]=true;                   
                    }
                }
                System.out.println("res: '" + res[i] + "' = " + count);
            }
		}	
	}
}
		
		