package Array;

import java.util.Scanner;

public class Q10 {
    public int what_is_max(int n1, int n2, int n3, int n4, int n5) {
        int[] arr = {n1, n2, n3, n4, n5};
        int max = n1;
        for (int i=1; i<5; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public int solution (int n, int[][] arr) {
        int ans = 0;
        int max = 0;

        for (int i=1; i<n+1; i++) {
            for (int j=1; j<n+1; j++) {
                max = what_is_max(arr[i][j], arr[i-1][j], arr[i+1][j], arr[i][j-1], arr[i][j+1]);
                if (arr[i][j] == max) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Q10 T = new Q10();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n+2][n+2];

        for (int i=1; i<n+1; i++) {
            for (int j=1; j<n+1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int[] x : arr) {
            for (int i : x) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
