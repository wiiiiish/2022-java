package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q08 {
    public int[] solution(int n, int[] arr) {
        int[] ans = new int[n];
        int score = 1;

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (arr[i] < arr[j]) {
                    score++;
                }
            }
            ans[i] = score;
            score = 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        Q08 T = new Q08();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
