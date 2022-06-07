package Array;

import java.util.Scanner;

public class Q07 {
    public int solution(int n, int[] arr) {
        int ans = 0;
        int temp = 0;

        for (int i=0; i<n; i++) {
            if (arr[i] == 1) {
                temp++;
            } else {
                temp = 0;
            }
            ans += temp;
        }

        return ans;
    }
    public static void main(String[] args) {
        Q07 T = new Q07();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(T.solution(n, arr));
    }
}
