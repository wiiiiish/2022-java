package String;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Q09 {
	public int solution(String str) {
		String ans = "";
		String pattern = "^[0-9]*$";
		for (int i=0; i<str.length(); i++) {
			if(Pattern.matches(pattern, Character.toString(str.charAt(i)))) {
				ans+=Character.toString(str.charAt(i));
			}
		}
		return Integer.parseInt(ans);
	}

	public static void main(String[] args) {
		Q09 T = new Q09();
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(T.solution(str));
	}

}
