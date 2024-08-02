/*
 * Java program to find the duplicate characters 
 * in a string
 */
package string.practice.come;

import java.util.Scanner;

public class FindTheDuplicateCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String str = sc.nextLine();
		char ch[]=str.toCharArray();
		System.out.println("Duplicate character is: ");
		for(int i=0;i<ch.length;i++) 
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j] && ch[i]!=' ')
				{
					System.out.print(ch[i]+" ");
				}
			}
		}
	}

}
