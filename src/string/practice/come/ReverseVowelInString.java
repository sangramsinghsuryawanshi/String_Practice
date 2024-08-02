
/*
 * Q1. Reverse the vowels only 
 S ="practice"
 Output: prectica
 Explanation: The vowels are a, i, e
 Reverse of these is e, i, a
 */


package string.practice.come;

import java.util.Scanner;

public class ReverseVowelInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str =sc.nextLine();
		char ch[]=str.toCharArray();
		char vowel[] = new char[ch.length];
		
		int c=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u') 
			{
				vowel[c++]=ch[i];
			}
		}
		//vowel = aie
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u')
			{
				c--;
				ch[i]=vowel[c];
			}
		}
		String s1= new String(ch);
		System.out.println(s1);
	}
}
