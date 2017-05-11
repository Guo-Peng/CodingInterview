package com.guopeng.algorithm.util.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by guopeng on 2017/5/11.
 */
public class Graph {
    private int V;
    private int E;
    private Set<Integer>[] adj;

    public Graph(int V) {
        this.V = V;
        E = 0;
        for (int i = 0; i < V; i++)
            adj[i] = new HashSet<>();
    }

    public Graph(int V, int E, int[][] edges) {
        this.V = V;
        this.E = E;
        for (int i = 0; i < edges.length; i++)
            addEdge(edges[i][0], edges[i][1]);
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }

    public Set<Integer> adj(int v) {
        return adj[v];
    }
}
