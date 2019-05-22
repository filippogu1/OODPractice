package OODBasics;

import java.util.HashMap;
import java.util.Map;

// Queue with HashMap - Generic Type version
public class GenericType1<T> {
    private Map<Integer, T> map;
    private int capacity;
    private int size;
    private int head;
    private int tail;

    public GenericType1(int capacity) {
        map = new HashMap<>();
        this.capacity = capacity;
        size = 0;
        head = -1;
        tail = -1;
    }

    public void add(T val) {
        if (size >= capacity) {
            System.out.println("Queue is full now! Cannot add values");
            return;
        }
        if (size == 0) {
            head = 0;
            tail = 1;
            map.put(head, val);
        } else {
            map.put(tail, val);
            tail = (tail + 1) % capacity;
        }
        size++;
    }

    public T peek() {
        if (isEmpty()) return null;
        return map.get(head);
    }

    public T poll() {
        if (isEmpty()) return null;
        T val = map.get(head);
        map.remove(head);
        size--;
        head = (head + 1) % capacity;
        return val;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        GenericType1<String> g1 = new GenericType1<String>(5);
        GenericType1<Integer> g2 = new GenericType1<Integer>(5);
        g1.add("One");
        g1.add("Two");
        System.out.println("Queue g1 size is " + g1.size);
        for (String val : g1.map.values()) {
            System.out.println("g1 map's entries - value : " + val);
        }
        g2.add(1);
        g2.add(2);
        System.out.println("Queue g2 size is " + g2.size);
        for (int val : g2.map.values()) {
            System.out.println("g1 map's entries - value : " + val);
        }
    }
}
