/*
 *  Q2. Delete alternate characters (Amazon)
 Input: S = "Geeks"
 Output: "Ges"
 Explanation: Deleted "e" at index 1
 and "k" at index 3.

 */
package string.practice.come;

import java.util.Scanner;

public class DelAlternativeChar 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		StringBuffer str = new StringBuffer(sc.nextLine());
		for(int i=0;i<str.length();i++)
		{
			if(i>0)
			{
				str.deleteCharAt(i);
			}
		}
		System.out.println(str.toString());
	}

}
