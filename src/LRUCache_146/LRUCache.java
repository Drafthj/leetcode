package LRUCache_146;

import java.util.HashMap;

/**
 * Created by drafthj on 2016/12/4 1:56.
 */
public class LRUCache {
    class DNode{
        public DNode(int key, int value) {
            this.key = key;
            this.value = value;
        }

        int key;
        int value;
        DNode next;
        DNode prev;
    }
    private DNode head;
    private DNode tail;
    private void list(){
        DNode f = head;
        while (f!=null){
            System.out.println(f.value);
            f = f.next;
        }
    }
    private void addFirst(DNode d){
        if(head == null){
            head = d;
            tail = d;
        }else {
            head.prev = d;
            d.next = head;
            head = d;
        }

    }
    private void remove(DNode node){
        DNode prev = node.prev;
        DNode next = node.next;
        if(prev == null){
            head = next;
        }else {
            prev.next = next;
            node.prev = null;
        }
        if(next == null){
            tail = prev;
        }else {
            next.prev = prev;
            node.next = null;
        }
    }
    private HashMap<Integer,DNode> cache;
    private int count;
    private int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>(capacity);
    }

    public int get(int key) {
        DNode node = cache.get(key);
        if(node!=null){
            remove(node);
            addFirst(node);
            return node.value;
        }
        return -1;
    }

    public void set(int key, int value) {
        DNode old = cache.get(key);
        DNode node = new DNode(key,value);
        if(old!=null){
            cache.put(key,node);
            remove(old);
            addFirst(node);
        }else {
            if(count<capacity){
                cache.put(key,node);
            }else {
                cache.remove(tail.key);
                remove(tail);
                cache.put(key,node);
            }
            addFirst(node);
            count++;
        }
    }
}
