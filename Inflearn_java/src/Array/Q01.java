package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Q01 {
    public ArrayList<Integer> solution(int n, ArrayList<Integer> array) {
        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(array.get(0));

        for (int i=1; i<n; i++) {
            if (array.get(i) > array.get(i-1)) {
                ans.add(array.get(i));
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Q01 T = new Q01();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> array = new ArrayList<>();

        for (int i=0; i<n; i++) {
            array.add(sc.nextInt());
        }

        for (int x : T.solution(n, array)) {
            System.out.print(x + " ");
        }
    }
}
