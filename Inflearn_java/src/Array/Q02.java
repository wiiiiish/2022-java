package Array;

import java.util.Scanner;

public class Q02 {
    public int solution(int n, int[] array) {
        int ans = 1;
        int max = array[0];

        for (int i=1; i<n; i++) {
            if (array[i] > max) {
                ans++;
                max = array[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Q02 T = new Q02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print(T.solution(n, array));
    }
}
