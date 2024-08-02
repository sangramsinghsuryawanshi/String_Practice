
/*
 * Q9. Change the string (yahoo)
 Input:
S ="abCD"
 Output: abcd
 Explanation: The first letter (a) is
 lowercase. Hence, the complete string
 is made lowercase
 */
package string.practice.come;

import java.util.Scanner;

public class ChangeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str =sc.nextLine();
		char[] ch= str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(Character.isLowerCase(ch[0])) {
				System.out.print(Character.toLowerCase(ch[i]));
			}else {
				System.out.print(Character.toUpperCase(ch[i]));
			}
		}
	}

}
