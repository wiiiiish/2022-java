package String;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Q08 {
	public String solution(String str) {
		String pattern = "^[a-zA-Z0-9]*$";
		String n = str.toLowerCase();
		String s = "";
		for (int i=0; i<n.length(); i++) {
			if (Pattern.matches(pattern, Character.toString(n.charAt(i)))) {
				s+=Character.toString(n.charAt(i));
			}
		}
		for (int i=0; i<s.length()/2; i++) {
			if(s.charAt(i) != s.charAt(s.length()-1-i)) {
				return "NO";
			}
		}
		return "YES";
	}

	public static void main(String[] args) {
		Q08 T = new Q08();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		System.out.print(T.solution(str));
	}
}
