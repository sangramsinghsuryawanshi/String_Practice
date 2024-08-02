/*
 * Q15. Find largest word in dictionary (MicroSoft)
 Example 1:
 Input: d = {"ale", "apple", "monkey", "plea"}
 S ="abpcplea"
 Output: "apple"
 Explanation: After deleting "b", "c"
 "a" S became "ap
 */

package string.practice.come;

import java.util.Scanner;

public class FindLongestDictonaryWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s[]={"ale", "apple", "monkey", "plea"};
		System.out.println("Enter String: ");
		String s1=sc.nextLine();
		StringBuilder smax = new StringBuilder();
		for(int i=0;i<s.length;i++) {
			StringBuilder s2 = new StringBuilder();
			for(int j=0;j<s[i].length();j++) {
				for(int k=0;k<s1.length();k++) {
					if(s[i].charAt(j)==s1.charAt(k)) {
						s2.append(s1.charAt(k));
						break;
					}
				}
			}	
			if(s2.length()>smax.length()) {
				smax=s2;
			}
		}
		System.out.println(smax);
	}

}
