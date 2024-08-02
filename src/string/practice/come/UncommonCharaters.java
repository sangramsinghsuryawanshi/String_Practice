/*
 * Q5. Uncommon characters 
 Input:
 A =geeksforgeeks
 B =geeksquiz
 Output: fioqruz
 Explanation:
The characters 'f', 'i', 'o', 'q', 'r', 'u','z'
 are either present in A or B, but not in both.
 */

package string.practice.come;

import java.util.Scanner;

public class UncommonCharaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string 1: ");
		String str =sc.nextLine();
		System.out.println("Enter the string 2: ");
		String str1 =sc.nextLine();
		String s =str.concat(str1);
		for(int i=0;i<s.length();i++) {
			int cnt=0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					cnt++;
				}
			}
			if(cnt==1)
			System.out.print(s.charAt(i));
		}
	}

}
