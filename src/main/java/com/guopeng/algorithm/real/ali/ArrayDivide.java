package com.guopeng.algorithm.real.ali;

import java.util.HashMap;

/**
 * Created by guopeng on 2017/3/4.
 */
public class ArrayDivide {
    public boolean arrayDivide(int[] arr) {
        HashMap<Integer, Integer> sumToCur = new HashMap<>();
        int[] acc = new int[arr.length];

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            sumToCur.put(sum, i);
            acc[i] = sum;
        }

        for (int i = 0; i < arr.length - 2; i++) {
            if (verify(sumToCur, i, acc)) return true;
        }
        return false;
    }

    private boolean verify(HashMap<Integer, Integer> sumToCur, int cur, int[] acc) {
        int firstSum = cur == 0 ? 0 : acc[cur - 1];

        int secondAcc = firstSum + acc[cur];
        if (sumToCur.containsKey(secondAcc)) {
            int next = sumToCur.get(secondAcc) + 1;

            if (next > acc.length - 2) {
                return false;
            }

            int thirdAcc = acc[next] + firstSum;
            if (sumToCur.containsKey(thirdAcc)) {
                int last = sumToCur.get(thirdAcc) + 1;

                if (next > acc.length - 1) {
                    return false;
                }

                if (acc[last] + firstSum == acc[acc.length - 1]) {

                    System.out.println(cur);
                    System.out.println(next);
                    System.out.println(last);
                    return true;
                }
            }
        }
        return false;
    }
}
