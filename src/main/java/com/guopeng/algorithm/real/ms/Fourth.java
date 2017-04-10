package com.guopeng.algorithm.real.ms;

import java.util.Scanner;

public class Fourth {

    static int n;
    static char[] s;

    static int greedy() {
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            if (s[i] == '(') a[i] = 1;
            else a[i] = -1;
        }
        int ans = 0, p = 0;
        for (int i = 0; i < n; ++i) {
            p += a[i];
            if (p < 0) {
                ans -= p;
                p = 0;
            }
        }
        if (p > 0) ans += p;
        else if (p < 0) ans -= p;
        return ans;
    }

    static boolean check(int m, int[] a) {
        int p = 0;
        for (int i = 0; i < m; ++i) {
            p += a[i];
            if (p < 0) return false;
        }
        if (p != 0) return false;
        int j = 0;
        for (int i = 0; i < n; ++i) {
            int t = 0;
            if (s[i] == '(') t = 1;
            else t = -1;
            boolean ok = false;
            while (j < m) {
                if (t == a[j]) {
                    ok = true;
                    j++;
                    break;
                } else ++j;
            }
            if (!ok) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        n = b.length();
        s = new char[n];
        for (int i = 0; i < b.length(); i++) {
            s[i] = b.charAt(i);
        }
        int ans = greedy(), M = 1 << (ans + n);
        int cnt = 0;
        for (int i = 0; i < M; ++i) {
            int[] a = new int[ans + n];
            for (int j = 0; j < (ans + n); ++j) {
                if ((i & (1 << j)) != 0) a[j] = 1;
                else a[j] = -1;
            }
            if (check(ans + n, a)) cnt++;
        }
        System.out.printf("%d %d\n", ans, cnt);
    }

}