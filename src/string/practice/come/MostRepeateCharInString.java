package string.practice.come;

import java.util.Scanner;

public class MostRepeateCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = sc.nextLine();
		char ch[]=str.toCharArray();
		int max=0;
		char maxele='\0';
		for(int i=0;i<ch.length;i++) {
			int c=0;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j] && ch[i]!='\0') {
					c++;
					ch[j]='\0';
				}
			}
			if(c>max) {
				max=c;
				maxele=ch[i];
			}
		}
		System.out.println("Most repated charater is :"+maxele);
	}

}
