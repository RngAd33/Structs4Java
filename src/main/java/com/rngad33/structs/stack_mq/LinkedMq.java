package com.rngad33.structs.stack_mq;

import com.rngad33.structs.common.Node;

/**
 * 链式队列
 *
 * @param <T>
 */
public class LinkedMq<T> {

    // 队首结点
    private final Node<T> front;

    // 队尾结点
    private final Node<T> rear;

    private int length;

    public LinkedMq(Node<T> front, Node<T> rear) {
        this.front = new Node<T>(null);
        this.rear = new Node<T>(null);
        this.length = 0;
    }

    /**
     * 入队
     *
     * @param data
     */
    public void enq(T data) {
        rear.setNext(new Node<>(data, null));
        length++;
    }

    /**
     * 出队
     *
     * @return
     */
    public T deq() {
        if (length == 0) return null;

        T data = front.getNext().getData();
        front.setNext(front.getNext().getNext());
        length--;
        return data;
    }

}