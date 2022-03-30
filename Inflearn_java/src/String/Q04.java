package String;

import java.util.Scanner;

public class Q04 {
	
	public String[] solution(int n, String[] strArray) {
		String[] ans = new String[n];
		
		for (int i=0; i<n; i++) {
			ans[i] = new StringBuffer(strArray[i]).reverse().toString();
		}
		return ans;
	}

	public static void main(String[] args) {
		Q04 T = new Q04();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] strArray = new String[n];
		
		for (int i=0; i<n; i++) {
			strArray[i] = sc.next();
		}
		
		strArray = T.solution(n, strArray);
		for (String s : strArray) {
			System.out.println(s);
		}
		
	}

}
