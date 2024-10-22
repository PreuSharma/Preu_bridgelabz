import java.util.*;
class Stringss5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		char[] str1=str.toCharArray();
		System.out.println("Enter the string to find:");
		String find=sc.nextLine();
		char[] find1=find.toCharArray();
		
		boolean found = false;
        for (int i=0;i<=str1.length-find1.length;i++) {
            int j;
            for (j=0;j<find1.length;j++) 
			{
                if (str1[i+j]!=find1[j]) 
				{
                    break;
                }
            }
            if (j==find1.length) 
			{
                System.out.println("Found at index: " + i+" to " + (i + find1.length - 1));
                found=true;
            }
        }
        if (!found) {
            System.out.println("Substring not found.");
        }
	}
}
		