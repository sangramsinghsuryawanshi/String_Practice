/*
 * Q14. Special array reversal 
 Example 1:
 Input: S = "A&B"
 Output: "B&A"
 Explanation: As we ignore '&' and
 then reverse, so answer is "B&A".
 Example 2:
 Input: S = "A&x#
 Output: "x&A#"
 Explanation: we swap only A and x.
 */

package string.practice.come;

import java.util.Scanner;

public class SpecialReversalArray {
	public static void isArray(String str) {
		StringBuilder s = new StringBuilder(str);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				sb.append(str.charAt(i));
			}
		}
		sb.reverse();
		int j=0;
		for(int i=0;i<s.length();i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
				s.setCharAt(i, sb.charAt(j));
				j++;
			}
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		SpecialReversalArray.isArray(str);
	}

}
