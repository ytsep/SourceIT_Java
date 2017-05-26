package com.source.it.lecture5.examples.queue;

public class NodeQueueWrapper {
    private QueueNode tail;

    public NodeQueueWrapper(QueueNode node) {
        tail = node;
    }

    public void addNode(QueueNode node) {
        node.setNext(tail);
        tail = node;
    }

    public QueueNode getHead() {
        QueueNode current = tail;
        QueueNode prev = tail;
        while (current.getNext() != null) {
            current = current.getNext();
            prev = prev.getNext();
        }
        prev.setNext(null);
        return current;
        /*
         * а если в очереди 1 элемент?
         * пофиксил: QueueNode current = tail.getNext();
         */
    }

    public void printQueue() {
        QueueNode current = tail;
        while (current != null) {
            System.out.print(current.getValue() + " --> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public void printQueueRecurcive() {
        printRecurcive(tail);
        System.out.println("null");
    }

    private void printRecurcive(QueueNode current) {
        System.out.print(current.getValue() + " --> ");
        if (current.getNext() != null) {
            printRecurcive(current.getNext());
        }
    }

    /*
    * Вычисляем длинну очереди
    *
    */
    private int lengthQueue () {
        QueueNode current = tail;
        int length = 0;
        while (current != null) {
            current = current.getNext();
            length++;
        }
        //System.out.println(length);
        return length;
    }

    /**
     * Removes Node from list that is located on position from head(start of the list).
     * If position is more than list size prints error message
     * @param position number of the Node starting from the head
     **/
    public void remove (int position) {
        /*Your code here*/
        getFromHead(position);
    }

    /**
     * Adds Node to list on position from head(start of the list).
     * If position is more than list size prints error message
     * @param position number of the Node starting from the head
     * @param node node should be inserted at position
     */
    public void addNode(int position, QueueNode node) {
        /*Your code here*/

        QueueNode current = tail;
        QueueNode prev = tail;

        int length = lengthQueue();

        length = length - position;

        if (length < 0) {
            addNode(node);
            return;
        }

        while (length > 0 && current.getNext() != null) {
            prev = current;
            current = current.getNext();
            length--;
        }
        node.setNext(current.getNext());
        current.setNext(node);
    }

    /**
     * Gets then Node that located on the position starting from the tail (end of the list)
     * if position is more than list size - prints error message
     * @param position number of the Node starting from the tail
     * @return Node that located on the position from the tail (end of list) if position exists in list
     */
    /*
    * можно модифицировать метод remove(int position) так что бы он возвращал current узел,
    * тогда это и будет getFromHead (int position)
    * */
    public QueueNode getFromHead(int position) {

        /*Your code here and please remove "return null". I've put it for ability to compile code*/

        QueueNode current = tail;
        QueueNode prev = tail;
        int length = lengthQueue();
        if (length < position || position <= 0) {
            System.out.println("Position too big or too small");
            return null;
        }
        length = length - position;
        if (length == 0) {
            tail = current.getNext();
            current.setNext(null);
            return current;
        }

        while (length > 0) {
            prev = current;
            current = current.getNext();
            length--;
        }

        prev.setNext(current.getNext());
        current.setNext(null);

        return current;
    }
}
