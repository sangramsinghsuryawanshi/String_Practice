
/*
 * Q7. Print first letter of every word in the string 
 Input:
 S ="geeks for geeks"
 Output: gfg
 */

package string.practice.come;

import java.util.Scanner;

public class PrintFirstLetterOfEveryChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string 1: ");
		String str =sc.nextLine();
		String s[]=str.split(" ");
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i].charAt(0));
			}
		}
}
