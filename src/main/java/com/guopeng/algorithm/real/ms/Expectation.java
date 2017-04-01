package com.guopeng.algorithm.real.ms;


import java.text.DecimalFormat;

/**
 * Created by guopeng on 2017/3/31.
 */
public class Expectation {
    static int N;
    static int P;
    static int Q;

    static float expectation;

    public static class Node {
        public int p;
        public int deepth;
        public Node left;
        public Node right;

        public float result = 1;

        public Node(int p, float result, int deepth) {
            this.p = p;
            this.result = result / 100;
            this.deepth = deepth;
        }

        public String toString() {
            return String.format("p: %d,result: %f, n:", p, result);
        }
    }

    public static void getLegendary(Node root, int n) {
        if (n == N) {
            expectation += root.result * root.deepth;
            return;
        }

        if (root.p != 0)
            getLegendary(new Node(P / pow(n + 1), root.result * root.p, root.deepth + 1), n + 1);
        if (root.p != 100)
            getLegendary(new Node(Math.min(100, root.p + Q), root.result * (100 - root.p), root.deepth + 1), n);
    }

    private static int pow(int n) {
        int result = 1;
        for (int i = 0; i < n; i++)
            result *= 2;
        return result;
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        P = scanner.nextInt();
//        Q = scanner.nextInt();
//        N = scanner.nextInt();
        P = 50;
        Q = 75;
        N = 2;
        getLegendary(new Node(P, 100, 0), 0);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(expectation));
    }
}
