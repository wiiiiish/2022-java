package String;

import java.util.Scanner;

public class Q12 {
	public String solution(int n, String str) {
		String ans = "";
		for (int i=0; i<n; i++) {
			// str을 0번 인덱스부터 7개씩 끊어서 #은 1로, *은 0으로 치환
			String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');

			// tmp 값 (이진수 형태)을 십진수 형태로 변환
			int num = Integer.parseInt(tmp, 2);

			// ans에 변환된 십진수 숫자에 해당하는 알파벳을 저장
			ans += (char)num;

			// str의 7번째 문자부터 다시 저장
			// (0~6 인덱스까지 알파벳으로 변환했으니, 이제 7번째 인덱스를 다시 0번째 인덱스로 취급해서 반복문 돌리기)
			str = str.substring(7);

			//System.out.println("str : " + str);
		}
		return ans;
	}

	public static void main(String[] args) {
		Q12 T = new Q12();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String str = sc.next();

		System.out.print(T.solution(n, str));
	}

}
