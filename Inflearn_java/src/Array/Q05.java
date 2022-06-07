package Array;

import java.util.Scanner;

public class Q05 {
    public int solution(int n) {
        int ans = 0;
        int[] arr = new int[n]; // n까지의 수

        for (int i=1; i<n; i++){
            if(arr[i]==0) {
                ans++;
                for (int  j=i; j<n; j+=i+1) {
                    arr[j]=1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Q05 T = new Q05();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(T.solution(n));
    }
}
