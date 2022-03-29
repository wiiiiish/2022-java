package String;

import java.util.Scanner;

public class Q01 {

	public int solution(String str, char s) {
		int ans = 0;
		str = str.toUpperCase(); // 문자열(String) 대문자로 변환
		s = Character.toUpperCase(s); // 문자(char) 대문자로 변환
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i)==s) {
				ans++;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		Q01 T = new Q01();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char s = sc.next().charAt(0);
		
		System.out.print(T.solution(str,s));
		
	}

}