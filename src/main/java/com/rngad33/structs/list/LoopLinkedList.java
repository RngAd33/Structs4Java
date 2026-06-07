package com.rngad33.structs.list;

import com.rngad33.structs.common.Node;

/**
 * 循环链表
 */
public class LoopLinkedList<T> implements List<T> {

    private final Node<T> head;

    private int length;

    /**
     * 初始化循环链表
     */
    public LoopLinkedList() {
        this.head = new Node<>(null);
        this.length = 0;
    }

    @Override
    public void insertHead(T data) {

    }

    @Override
    public void insertTail(T data) {

    }

    @Override
    public boolean insert(T data, int index) {
        return false;
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
}