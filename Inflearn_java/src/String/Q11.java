package String;

import java.util.Scanner;

public class Q11 {

	public String solution (String str) {
		String answer = "";
		
		char m = str.charAt(0);
		int n = 0;
		
		for (int i=0; i<str.length(); i++) {
			if (m==str.charAt(i)) {
				n++;
			} else {
				if (n>1) {
					answer += str.charAt(i-1);
					answer += n;
				} else {
					answer += str.charAt(i-1);
				}
				m = str.charAt(i);
				n=1;
			}
			if (i == str.length()-1) {
				answer += str.charAt(i);
				answer += n;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Q11 T = new Q11();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		System.out.print(T.solution(str));
		
	}

}
