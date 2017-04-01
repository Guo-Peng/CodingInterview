package com.guopeng.algorithm.real.qihu360;

import com.guopeng.algorithm.codeinterview.utils.Print;

import java.util.Scanner;

/**
 * Created by guopeng on 17-3-22.
 */
public class CutBalloon {
    /**
     * @param arr
     * @return
     */
    public static int cutBalloon(int[] arr) {
        if (arr == null) return 0;

        int n = arr.length;
        int[] set = new int[10];
        int[] f = new int[n + 1];
        f[0] = 1;

        for (int i = 1; i <= arr.length; i++) {
            for (int j = i; j >= 1; j--) {
                if (set[arr[j - 1]]++ != 0) break;

                f[i] = (f[i] + f[j - 1]) % 1000000007;
            }

            for (int k = 0; k < 10; k++) set[k] = 0;
        }
        Print.arrPrint(f);
        return f[n];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        System.out.println(cutBalloon(arr));
    }
}
