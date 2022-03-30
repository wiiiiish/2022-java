package String;

import java.util.Scanner;

public class Q02 {

	public String solution(String str) {
		String s = str.toUpperCase();
		String ans = "";
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i)  == s.charAt(i)) {
				ans += Character.toLowerCase(str.charAt(i));
			} else {
				ans += Character.toUpperCase(str.charAt(i));
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		Q02 T = new Q02();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.print(T.solution(str));
	}

}
