/*
 * Q4. Front-Back Transformation- copy 
 Input: S = "Hello"
 Output: Svool
 Explanation: 'H' is the 8th letter from the
 beginning of alphabets, which is replaced by
 'S' which comes at 8th position in reverse order
 of alphabets. Similarly, all other letters are
 replaced by their respective upper or lower case
 letters accordingly
 */

package string.practice.come;

import java.util.Scanner;

public class FrontBackTransformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str =sc.nextLine();
		int aAscii=65;
		int zAscii=90;
		int saAscii=97;
		int szAscii=122;
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				int charw=str.charAt(i);
				int diff=charw-aAscii;
				int enddiff=zAscii-diff;
				System.out.println((char)enddiff);
			}else if(Character.isLowerCase(str.charAt(i))) {
				int charw1=str.charAt(i);
				int diff1=charw1-saAscii;
				int enddiff1=szAscii-diff1;
				System.out.println((char)enddiff1);
			}
		}
	}

}
