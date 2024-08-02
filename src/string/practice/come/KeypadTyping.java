package string.practice.come;

import java.util.Scanner;

public class KeypadTyping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str =sc.nextLine();
		str=str.toUpperCase();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='C') {
				System.out.print("2");
			}else if(str.charAt(i)>='D' && str.charAt(i)<='F') {
				System.out.print("3");
			}else if(str.charAt(i)>='G' && str.charAt(i)<='I') {
				System.out.print("4");
			}else if(str.charAt(i)>='J' && str.charAt(i)<='L') {
				System.out.print("5");
			}else if(str.charAt(i)>='M' && str.charAt(i)<='O') {
				System.out.print("6");
			}else if(str.charAt(i)>='P' && str.charAt(i)<='S') {
				System.out.print("7");
			}else if(str.charAt(i)>='T' && str.charAt(i)<='V') {
				System.out.print("8");
			}else if(str.charAt(i)>='W' && str.charAt(i)<='Z') {
				System.out.print("9");
			}else{
				System.out.print("*");
			}
		}
	}

}
