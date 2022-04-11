package String;

import java.util.Scanner;

public class Q10 {

	public int[] solution(String str1, String str2) {
		
		char c = str2.charAt(0); //str2의 문자를 char형으로 변환
		int[] ans = new int[str1.length()];
		
		int n1 = 100;
		for (int i=0; i<str1.length(); i++) {
			if (str1.charAt(i) == c) {
				n1=0;
				ans[i] = n1;
			} else {
				n1++;
				ans[i] = n1;
			}
		}
		
		int n2 = 100;
		for (int i=str1.length()-1; i>=0; i--) {
			if (str1.charAt(i) == c) {
				n2 = 0;
			} else {
				n2++;
				ans[i] = Math.min(n2, ans[i]);
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Q10 T = new Q10();
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		
		for (int i: T.solution(str1, str2)) {
			System.out.print(i + " ");
		}
	}

}
