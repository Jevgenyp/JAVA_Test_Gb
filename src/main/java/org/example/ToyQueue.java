package org.example;
import java.util.*;

public class ToyQueue {
    PriorityQueue<Toy> queue;

    public ToyQueue() {
        this.queue = new PriorityQueue<Toy>(new Comparator<Toy>() {
            public int compare(Toy t1, Toy t2) {
                return t1.getWeight() - t2.getWeight();
            }
        });
    }

    public void put(String inputString) {
        queue.add(new Toy(inputString));
    }

    public Toy get() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.poll();
    }
}
