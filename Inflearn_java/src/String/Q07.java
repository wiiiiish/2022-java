package String;

import java.util.Scanner;

public class Q07 {
	
	public String solution(String str) {
		String s = str.toUpperCase();
		for (int i=0; i<s.length()/2; i++) {
			if(s.charAt(i) != s.charAt(s.length()-1-i)) {
				return "NO";
			}
		}
		return "YES";
	}

	public static void main(String[] args) {
		Q07 T = new Q07();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		System.out.print(T.solution(str));
	}

}
