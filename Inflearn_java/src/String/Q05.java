package String;

import java.util.Scanner;

public class Q05 {
	
	public String solution(String str) {
		String ans = "";
		char[] s = str.toCharArray();
		
		int i=0;
		int j=str.length()-1;
		
		while (i<j) {
			if (!Character.isAlphabetic(s[i])) {
				i++;
			} else if (!Character.isAlphabetic(s[j])) {
				j--;
			} else {
				char temp = s[i];
				s[i] = s[j];
				s[j] = temp;
				i++;
				j--;
			}
		}
		ans = String.valueOf(s);
		return ans;
	}

	public static void main(String[] args) {
		Q05 T = new Q05();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		System.out.print(T.solution(str));

	}

}
