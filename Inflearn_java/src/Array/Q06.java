package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Q06 {
    public boolean prime(int number) { // 소수인지 판별
        if (number == 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] array) { // 입력받은 숫자 뒤집기
        ArrayList<Integer> ans = new ArrayList<>();
        int temp = 0;
        int r = 0;
        int[] reverse = new int[n];

        for (int i = 0; i < n; i++) {
            temp = array[i];
            while (temp != 0) {
                r = r * 10;
                r += temp % 10;
                temp = temp / 10;
            }
            reverse[i] = r;
            r = 0;
        }

        for (int i = 0; i < n; i++) {
            if (prime(reverse[i])) {
                ans.add(reverse[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Q06 T = new Q06();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        for (int x : T.solution(n, array)) {
            System.out.print(x + " ");
        }
    }
}
