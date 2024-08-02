/*
 * 11.
Input : Geeks$For$Geeks
Output : String is not accepted.
Input : Geeks For Geeks
Output : String is accepted
 */
package string.practice.come;

import java.util.Scanner;

public class StringOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		int d=s.length();
		System.out.println(d);
		int cnt=0,ncnt=0;
		for(int i=0;i<ch.length;i++)
		{
			if(!Character.isAlphabetic(ch[i]) && ch[i]!=' ')
			{
				System.out.println(ch[i]+" ");
				cnt++;
				break;
			}
			else
			{
				ncnt++;
			}
		}
		if(cnt>0)
		{
			
			System.out.println("String is not accepted");
		}
		else
		{
			System.out.println("String is accepted");
		}
		System.out.println(cnt);
		System.out.println(ncnt);
	}

}
