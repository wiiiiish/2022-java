package Array;

import java.util.Scanner;

public class Q03 {
    public String[] solution(int n, int[] A, int[] B) {
        String[] ans = new String[n];

        for (int i=0; i<n; i++) {
            if (A[i] == B[i]) {
                ans[i] = "D";
            } else if ((A[i]==1 && B[i]==3) || (A[i]==2 && B[i]==1) || (A[i]==3 && B[i]==2)) {
                ans[i] = "A";
            } else {
                ans[i] = "B";
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Q03 T = new Q03();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];

        for (int i=0; i<n; i++) {
            A[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++) {
            B[i] = sc.nextInt();
        }

        for (String x: T.solution(n, A, B)) {
            System.out.println(x);
        }

    }
}
