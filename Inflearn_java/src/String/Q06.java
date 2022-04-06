package String;

import java.util.Scanner;

public class Q06 {

	public String solution(String str) {
		String ans = "";
		for (int i=0; i<str.length(); i++) {			
			if (str.indexOf(Character.toString(str.charAt(i))) == i) {
				ans += Character.toString(str.charAt(i));
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Q06 T = new Q06();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		System.out.print(T.solution(str));
	}

}
