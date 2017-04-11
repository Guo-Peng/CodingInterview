package com.guopeng.algorithm.util.collection;

/**
 * Created by guopeng on 17-3-20.
 */
public class Tuple {
    public int a;
    public int b;

    public Tuple(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int hashCode() {
        return a * 31 + b;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Tuple tuple = (Tuple) obj;
        return a == tuple.a && b == tuple.b;
    }

    @Override
    public String toString() {
        return String.format("(a=%d,b=%d)", a, b);
    }
}
