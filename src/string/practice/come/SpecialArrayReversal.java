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
 Explanation: we swap only A and x
 */

package string.practice.come;

import java.util.Scanner;

public class SpecialArrayReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String str = sc.nextLine();
        char ch[] =str.toCharArray();
        for(int i=0;i<ch.length;i++) {
        	if(Character.isAlphabetic(ch[i])) {
        		for(int j=i+1;j<ch.length;j++) {
            		if(ch[i]<ch[j]) {
            			char temp=ch[i];
            			ch[i]=ch[j];
            			ch[j]=temp;
            		}
            	}
        	}
        }
        for(int i=0;i<ch.length;i++) {
        	System.out.print(ch[i]);
        }
	}

}
