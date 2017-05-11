package com.guopeng.algorithm.real.code.Graph;

import com.guopeng.algorithm.util.collection.Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by guopeng on 2017/5/11.
 */
public class BreadthFirstPaths {
    private boolean[] marked;
    private int[] edgeTo;
    private int s;

    public BreadthFirstPaths(Graph G, int s) {
        this.s = s;
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
    }

    private void bfs(Graph G, int s) {
        Queue<Integer> queue = new LinkedList<>();

        marked[s] = true;
        queue.add(s);
        while (!queue.isEmpty()) {
            int v = queue.remove();
            for (int w : G.adj(v)) {
                if (!marked[w]) {
                    queue.add(w);
                    edgeTo[w] = v;
                    marked[w] = true;
                }
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
}
