package com.guopeng.algorithm.real.code.Graph;

import com.guopeng.algorithm.util.collection.Graph;

import java.util.Stack;

/**
 * Created by guopeng on 2017/5/11.
 */
public class DepthFirstSearch {
    private boolean[] marked;
    private int[] edgeTo;
    private int s;
    private int count;

    public DepthFirstSearch(Graph G, int s) {
        this.s = s;
        edgeTo = new int[G.V()];
        marked = new boolean[G.V()];
        dfs(G, s);
    }

    private void dfs(Graph G, int v) {
        marked[v] = true;
        count++;
        for (int w : G.adj(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                dfs(G, w);
            }
        }
    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public Iterable<Integer> pathTo(int v) {
        if (!hasPathTo(v)) return null;

        Stack<Integer> stack = new Stack<>();
        for (int i = v; i != s; i = edgeTo[v])
            stack.push(v);
        stack.push(s);
        return stack;
    }

    public int getCount() {
        return count;
    }
}
