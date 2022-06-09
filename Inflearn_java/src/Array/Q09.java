package Array;

import java.util.Scanner;

public class Q09 {
    public int solution(int n, int[][] arr) {
        int ans = 0;
        int sum1 = 0;
        int sum2 = 0;

        // 행의 합과 열의 합
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                sum1 += arr[i][j]; // i행의 합
                sum2 += arr[j][i]; // j열의 합
            }
            ans = Math.max(ans, sum1);
            ans = Math.max(ans, sum2);

            sum1 = 0;
            sum2 = 0;
        }

        // 대각선의 합1
        for (int i=0; i<n; i++) {
            sum1 += arr[i][i];
        }
        ans = Math.max(ans, sum1);

        // 대각선의 합2
        for (int i=n-1; i>=0; i--){
            sum2 += arr[i][i];
        }
        ans = Math.max(ans, sum2);

        return ans;
    }
    public static void main(String[] args) {
        Q09 T = new Q09();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print(T.solution(n, arr));
    }
}
