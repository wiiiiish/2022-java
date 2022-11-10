package Array;

import java.util.Scanner;

public class Q11 {
    public int solution (int n, int[][] arr) {
        int ans = 0;
        int[] temp = new int[n];
        int x = 0; // 기준
        int y = 0; // 비교대상

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++){
                x = arr[i][j];
                for (int k=0; k<n; k++) {
                    y = arr[k][j];
                    if (x == y) {
                        
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Q11 T = new Q11();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 학생수
        int[][] arr = new int[n][n];

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print(T.solution(n, arr));


    }
}
