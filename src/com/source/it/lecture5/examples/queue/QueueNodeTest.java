package com.source.it.lecture5.examples.queue;

public class QueueNodeTest {
    public static void main(String[] args) {
        NodeQueueWrapper queue = new NodeQueueWrapper(new QueueNode(1));
        queue.addNode(new QueueNode(2));
        queue.addNode(new QueueNode(5));
        queue.printQueue();
        queue.printQueueRecurcive();

        System.out.println(queue.getHead().getValue());
        queue.printQueue();

        System.out.println(queue.getHead().getValue());
        queue.printQueue();
        queue.remove(2);

        queue.printQueue();
        queue.addNode(2, new QueueNode(7));
        queue.printQueue();
        queue.remove(1);
        queue.printQueue();

        QueueNode node = queue.getFromHead(1);
        if (node != null) {
            System.out.println(node.getValue());
        }
        queue.printQueue();
    }
}
