/*string ka object bna skte hai new keyword use krke
"" - string
' ' - character
only difference 
String str=new String("abc");
*/
import java.util.*;
class Stringss
{
	Stringss()
	{
		System.out.println("Default Constructor");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Stringss s=new Stringss();
		s.method1(str);
		s.method2();
		
	}
	
	public static void method1(String str)  //yeh heap memory me store hoga, har new pe nayi memory allocate hogi
	{
		System.out.println(str);     
	}
	public static void method2()          //string constant pool me store hoga  gtr="abc" toh yeh str vaale ko he point krega basically reference bna
	{
		String str="abc";
		String gtr="abc";
		System.out.println(str);
		System.out.println(gtr);
		str="idf";
		System.out.println(str);
		System.out.println(gtr);
	}
}
		
/*
String str="abc"; //yeh bhi string constant pool me store kregi
String str1="abc" //yeh check krega string constant pool me abc pdha hai toh ussii ko point krne lgh pdhega
String str2="xyz" - yeh string constant pool me store hogi xyz aur str2 reference hoga iska yaani point krega xyz ko
*/		

/*
String s=new String("abc"); //heap memory me store hota hai 



*/
