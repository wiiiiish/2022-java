package String;

import java.util.Scanner;

public class Q03 {
	
	public String solution(String str) {
		String[] strArray = str.split(" ");
		String ans = strArray[0];
		int length = strArray[0].length();
		
		for (int i=1; i<strArray.length; i++) {
			if(length < strArray[i].length()) {
				length = strArray[i].length();
				ans = strArray[i];
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Q03 T = new Q03();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		System.out.print(T.solution(str));
	}

}
