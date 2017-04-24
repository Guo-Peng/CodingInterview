package com.guopeng.algorithm.real.code.Design;

/**
 * Created by guopeng on 17-4-24.
 */
public class Trie {
    class TrieNode {
        boolean match;
        TrieNode[] child;

        TrieNode() {
            child = new TrieNode[26];
        }
    }

    TrieNode root;

    /**
     * Initialize your data structure here.
     */
    public Trie() {
        root = new TrieNode();
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        if (word == null || word.length() == 0) return;

        TrieNode cur = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (cur.child[index] == null) {
                cur.child[index] = new TrieNode();
            }
            cur = cur.child[index];
        }
        cur.match = true;
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        if (word == null) return false;

        TrieNode cur = root;
        for (int i = 0; i < word.length(); i++) {
            cur = cur.child[word.charAt(i) - 'a'];
            if (cur == null) return false;
        }
        return cur.match;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        if (prefix == null) return false;

        TrieNode cur = root;
        for (int i = 0; i < prefix.length(); i++) {
            cur = cur.child[prefix.charAt(i) - 'a'];
            if (cur == null) return false;
        }
        return true;
    }
}
