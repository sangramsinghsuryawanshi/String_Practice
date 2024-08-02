/*
 * Java Program to divide a string in 'N' equal parts.
 */
package string.practice.come;

import java.util.Arrays;
import java.util.Scanner;

public class DivideStringEqualParts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String 1: ");
		String str = sc.nextLine();
		char ch[]=str.toCharArray();
		System.out.println("Enter n number: ");
		int n =sc.nextInt();
		int ch1=str.length()/2;
		if(str.length()%n!=0)
		{
			System.out.println("Not equal");
		}
		else
		{
			for(int i=0;i<str.length();i+=ch1)
			{
				System.out.print(str.substring(i, i+ch1)+" ");
			}
		}
	}

}
