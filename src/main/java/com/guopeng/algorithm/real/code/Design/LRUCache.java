package com.guopeng.algorithm.real.code.Design;

import java.util.HashMap;

/**
 * Created by guopeng on 2017/4/22.
 */
public class LRUCache {
    class Node {
        int key;
        int val;
        Node pre;
        Node next;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }

        @Override
        public String toString() {
            return String.format("key: %d,value: %d", key, val);
        }
    }

    int capacity;
    HashMap<Integer, Node> cache;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            Node tmp = cache.get(key);
            delNode(tmp);
            addNode(tmp);
            return tmp.val;
        } else
            return -1;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            cache.get(key).val = value;
            get(key);
        } else {
            if (cache.size() == capacity) {
                Node del = head.next;
                delNode(del);
                cache.remove(del.key);
            }

            Node tmp = new Node(key, value);
            addNode(tmp);
            cache.put(key, tmp);
        }
    }

    private void addNode(Node node) {
        node.next = tail;
        node.pre = tail.pre;
        tail.pre.next = node;
        tail.pre = node;
    }

    private void delNode(Node node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    public static void main(String[] args) {
        LRUCache lru = new LRUCache(2);
//        lru.put(1, 1);
//        lru.put(2, 2);
//        System.out.println(lru.get(1));       // returns 1
//        lru.put(3, 3);    // evicts key 2
//        System.out.println(lru.get(2));       // returns -1 (not found)
//        lru.put(4, 4);    // evicts key 1
//        System.out.println(lru.get(1));       // returns -1 (not found)
//        System.out.println(lru.get(3));       // returns 3
//        System.out.println(lru.get(4));       // returns 4

//        lru = new LRUCache(1);
//        lru.put(2, 1);
//        System.out.println(lru.get(2));
//        lru.put(3, 2);
//        System.out.println(lru.get(2));
//        System.out.println(lru.get(3));

        lru = new LRUCache(2);
        System.out.println(lru.get(2));
        lru.put(2, 6);
        System.out.println(lru.get(1));
        lru.put(1, 5);
        lru.put(1, 2);
        System.out.println(lru.get(1));
        System.out.println(lru.get(2));
    }
}
