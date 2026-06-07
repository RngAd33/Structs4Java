package com.rngad33.structs.list;

import com.rngad33.structs.common.DuNode;

/**
 * 双向链表
 *
 * @param <T>
 */
public class DoubleLinkedList<T> implements List<T> {

    private final DuNode<T> head;

    private int length;

    public DoubleLinkedList(DuNode<T> head) {
        this.head = new DuNode<>(null, null);
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