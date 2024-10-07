import java.util.*;
class Calculator {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter operation to perform:  ");
		int n=sc.nextInt();
		switch(n)
		{
			case 1: System.out.println("Output: "+sum(a,b));
			break;
			case 2: System.out.println("Output: "+sub(a,b));
			break;
			case 3: System.out.println("Output: "+multi(a,b));
			break;
			case 4: System.out.println("Output: "+div(a,b));
			break;
			default: System.out.println("Invalid Input");
		}
		
		/*
		
		if(n==1) { System.out.println("Output: "+sum(a,b));   }
		if(n==2) { System.out.println("Output: "+sub(a,b));   }
		if(n==3) { System.out.println("Output: "+multi(a,b)); }
		if(n==4) { System.out.println("Output: "+div(a,b));   }
		
		*/
		
	}
	
	public static int sum(int a, int b) {
		//int sum=a+b ;
		return a+b;
	}

	public static int sub(int a, int b) {
		//int sub=a-b ;
		return a-b;
	}
	
	public static int multi(int a, int b) {
		//int multi=a*b ;
		return a*b;
	}

	public static int div(int a, int b) {
		//int div=a/b ;
		return a/b;
	}
	
}	