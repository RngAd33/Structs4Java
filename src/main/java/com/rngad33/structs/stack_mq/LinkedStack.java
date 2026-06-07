package com.rngad33.structs.stack_mq;

import com.rngad33.structs.common.Node;

/**
 * 链式栈
 */
public class LinkedStack<T> implements Stack<T> {

    private final Node<T> top;

    private int length;

    /**
     * 初始化链式栈
     */
    public LinkedStack() {
        this.top = new Node<>(null);
        this.length = 0;
    }

    /**
     * 入栈
     *
     * @param data
     */
    @Override
    public void push(T data) {
        Node<T> p = top;
        Node<T> q = p.getNext();
        Node<T> r = new Node<>(data, null);

        // 前往尾结点
        while (q != null) {
            p = q;
            q = q.getNext();
        }

        p.setNext(r);
        length++;
    }

    /**
     * 出栈
     *
     * @return
     */
    @Override
    public T pop() {
        if (top == null || length == 0) return null;

        Node<T> p = top;
        Node<T> q = p.getNext();

        // 前往尾结点
        while (q != null) {
            p = q;
            q = q.getNext();
        }

        p.setNext(null);
        length--;
        return top.getData();
    }

    /**
     * 遍历所有元素
     *
     * @return
     */
    @Override
    public T[] queryAll() {
        Node<T> p = top;
        Node<T> q = p.getNext();

        T[] dataList = (T[]) new Object[length];
        for (int i = 0; i < length; i++) {
            dataList[i] = q.getData();
            p = q;
            q = q.getNext();
        }
        return dataList;
    }

    /**
     * 销毁栈
     */
    @Override
    public void clear() {
        Node<T> p = top;
        Node<T> q = p.getNext();

        while (q != null) {
            p = q;
            q.setData(null);
            q = q.getNext();
        }
    }

}