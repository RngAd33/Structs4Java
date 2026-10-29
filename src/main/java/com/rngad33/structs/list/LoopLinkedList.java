package com.rngad33.structs.list;

import com.rngad33.structs.model.list_stack_mq.Node;

/**
 * 循环链表
 */
public class LoopLinkedList<T> implements List<T> {

    private final Node<T> head;

    private int length;

    /**
     * 初始化
     */
    public LoopLinkedList() {
        this.head = new Node<>(null);
        head.setNext(head);
        this.length = 0;
    }

    @Override
    public void insertHead(T data) {
        Node<T> p = head;
        Node<T> q = p.getNext();
        Node<T> r = new Node<>(data, q);

        p.setNext(r);
        r.setNext(q);
        length++;
    }

    @Override
    public void insertTail(T data) {
        Node<T> p = head;
        Node<T> q = p.getNext();
        Node<T> r = new Node<>(data, null);

        // 前往尾结点
        while (q != head) {
            p = q;
            q = q.getNext();
        }

        p.setNext(r);
        length++;
    }

    @Override
    public boolean insert(T data, int index) {
        if (!this.checkIndex(index)) return false;

        Node<T> p = head;
        Node<T> q = p.getNext();
        Node<T> r = new Node<>(data, null);

        int i = 1;
        while (index > i) {
            p = q;
            q = q.getNext();
            i++;
        }

        p.setNext(r);
        r.setNext(q);
        length++;
        return true;
    }

    @Override
    public T query(int index) {
        return null;
    }

    @Override
    public T[] queryAll() {
        return null;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public void update(T data, int index) {

    }

    @Override
    public void clear() {

    }

    /**
     * 检查位置是否合法
     *
     * @param index
     * @return
     */
    private boolean checkIndex(int index) {
        return index > 0 && length > 0 && index <= length;
    }

    /**
     * 获取目标结点
     *
     * @param index
     * @return
     */
    private Node<T> getTargetNode(int index) {
        if (this.checkIndex(index)) return null;

        Node<T> p = head;
        Node<T> q = p.getNext();

        // 前往指定结点
        int i = 1;
        while (index > i) {
            p = q;
            q = q.getNext();
            i++;
        }

        return q;
    }

}