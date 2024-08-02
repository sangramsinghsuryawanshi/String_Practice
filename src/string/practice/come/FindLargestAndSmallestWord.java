/*
 * Java Program to find the largest and smallest word in a string.
 */
package string.practice.come;

import java.util.Scanner;

public class FindLargestAndSmallestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String 1: ");
		String str = sc.nextLine();
		String s[]=str.split(" ");
		int max=0,min=Integer.MAX_VALUE;
		String maxword=null,minword=null;
		for(int i=0;i<s.length;i++) 
		{
			if(s[i].length()-1>max)
			{
				max=s[i].length()-1;
				maxword=s[i];
			}
			else if(s[i].length()-1<min)
			{
				min=s[i].length()-1;
				minword=s[i];
			}
		}
		System.out.println("Largest word is: "+maxword);
		System.out.println("Smallest word is: "+minword);
	}

}
