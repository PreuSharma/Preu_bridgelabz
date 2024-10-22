import java.util.*;
class Stringss4{
	public static void main(String[] args)
	{
		String str="abc";      //String literal - string constant pool me
		System.out.println("str: "+str);
		String str1="abc";
		System.out.println("str1: "+str1);
		String str2="xyz";
		System.out.println("str2: "+str2);
		
		String str3=new String("abc");   //New Keyword - Heap memory me
		System.out.println("str3: "+str3);
		String str4=new String("abc");
		System.out.println("str4: "+str4);
		String str5=new String("xyz");
		System.out.println("str5: "+str5);
		// == or equals()
		
		System.out.println(str.equals(str1));
		System.out.println(str.equals(str2));
		System.out.println(str.equals(str3));
		
		
		System.out.println(str==str1);
		System.out.println(str==str2);
		System.out.println(str==str3);
		System.out.println(str3==str4);
		
		System.out.println("str.length(): "+str.length());
		System.out.println("str.concate(): "+str.concat(str1));
		char[] str11=str.toCharArray();
		System.out.println("str.toCharArray(): "+str11);
		
		String s="abc";     //concept   
		s.concat("xyzs");   //kyunki humne isko kisi variable me store ni kia isiliyeh s=abc he rahega
		System.out.println("s:"+s);
		s=s.concat("abh krdia concat variable me store krke");   //abh hojayega
		System.out.println("s:"+s);
		
		
	}
}


//str.toCharArray();
//str.length();
//str.concate();

