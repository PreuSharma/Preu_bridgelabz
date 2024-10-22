import java.util.*;
class Stringss2
{
	public static void main(String args[])
	{
		String str="abcd";
		System.out.println("str: "+str);
		char[] res=str.toCharArray();
		System.out.println("res :"+res.length());
		for(int i=0;i<str.length();i++)
		{
			System.out.println(res[i]);
		}
	}
}