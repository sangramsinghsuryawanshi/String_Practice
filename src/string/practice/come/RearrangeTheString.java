/*
 * Q12. Rearrange a string
 Example 1:
 Input: S = "AC2BEW3"
 Output: "ABCEW5"
 Explanation: 2 + 3 = 5 and we print all
 alphabets in the lexicographical order.
 Example 2:
 Input: S = "ACCBA10D2EW30"
 Output: "AABCCDEW6"
 Explanation: 0+1+2+3 = 6 and we print
 all alphabets in the lexicographical order
 */
package string.practice.come;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangeTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str =sc.nextLine();
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
		String str1 = new String(ch);
		int c=0;
		for(int i=0;i<str1.length();i++) 
		{
			if(Character.isDigit(str1.charAt(i)))
			{
				c+=Character.getNumericValue(str1.charAt(i));
			}
		}
		for(int i=0;i<str1.length();i++) 
		{
			if(Character.isAlphabetic(str1.charAt(i)))
			{
				System.out.print(str1.charAt(i));
			}
		}
		System.out.print(c);
	}

}
