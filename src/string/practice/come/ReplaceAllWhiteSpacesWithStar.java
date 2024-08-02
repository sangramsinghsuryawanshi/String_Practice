/*
 * Q13. Wap take a string and replace all whilespace  with start(*).

i/p
String s=java is a very good programming language";
o/p
String s=java*is*a*very*good*programming*language;
 */

package string.practice.come;

import java.util.Scanner;

public class ReplaceAllWhiteSpacesWithStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str =sc.nextLine();
		for(int i=0;i<str.length();i++) {
			System.out.println(str.replaceAll(" ", "*"));
			break;
		}
	}

}
